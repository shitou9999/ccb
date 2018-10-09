package com.deviceservice.printer.ccb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import com.ccb.deviceservice.aidl.IDeviceService;
import com.ccb.deviceservice.aidl.printer.IPrinter;

/**
 * POS设备驱动服务
 */
public class DeviceService {
    private static final String TAG = DeviceService.class.getSimpleName();

    private static DeviceService _deviceService = null;
    private Context _context;
    //服务是否绑定
    private boolean isDeviceServiceBind = false;
    private IPrinter iPrinter;

    private DeviceService(Context context) {
        super();
        if (context != null) {
            this._context = context;
        }
    }

    public static DeviceService getInstance(Context context) {
        if (_deviceService == null) {
            _deviceService = new DeviceService(context);
        }
        return _deviceService;
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e(TAG, "设备驱动服务中断");
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //设备AIDL服务
            IDeviceService ideviceService = IDeviceService.Stub.asInterface(service);
            if (ideviceService != null) {
                try {
                    iPrinter = IPrinter.Stub.asInterface(ideviceService.getPrinter());
                    Toast.makeText(_context, "设备驱动服务绑定成功", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "设备驱动服务绑定成功");
                } catch (RemoteException e) {
                    Toast.makeText(_context, "获取设备驱动接口异常", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "获取设备驱动接口异常");
                    e.printStackTrace();
                }
            }
        }
    };

    /***
     * 绑定服务
     */
    public void bindDeviceService() {
        if (!isDeviceServiceBind) {
            Log.e(TAG, "bindDeviceService");
            Intent intent = new Intent();
            intent.setAction("com.ccb.device_service");
            intent.setPackage("com.ccb.deviceservice");
            isDeviceServiceBind = _context.bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
        }
    }

    /***
     * 解绑服务
     */
    public void unbindDeviceService() {
        if (isDeviceServiceBind) {
            _context.unbindService(serviceConnection);
            isDeviceServiceBind = false;
            Log.e(TAG, "设备驱动服务解绑成功");
        } else {
            Log.e(TAG, "设备驱动服务未绑定无需解绑");
        }
    }


    /***
     * 获取打印机对象
     * @return IPrinter
     */
    public IPrinter getIPrinter() {
        return iPrinter;
    }

}
