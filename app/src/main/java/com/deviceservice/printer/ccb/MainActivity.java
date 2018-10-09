package com.deviceservice.printer.ccb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ccb.deviceservice.aidl.IDeviceService;
import com.ccb.deviceservice.aidl.printer.IPrinter;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "tag";//logt

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DeviceService.getInstance(getApplicationContext()).bindDeviceService();
        Button button = findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBtnPrinter();
            }
        });
    }


    private void onBtnPrinter() {
        try {
            PrinterService printer = PrinterService.getInstance(MainActivity.this);
//            printer.appendPrinterString(PrinterFormat.getTextFormat(0, 0), "字体:small,左对齐,不添加下划线,不截断");
            printer.appendPrinterString(PrinterFormat.getTextFormat(1, 1, true, false), "字体:normal,居中对齐,\n添加下划线,不截断");
            printer.appendPrinterString(PrinterFormat.getTextFormat(2, 2, false, true), "字体:large,右对齐,不添加下划线,截断");
//            printer.appendPrinterBarCode(PrinterFormat.getBarCodeFormat(0, 200, 100), "123456789");
            printer.appendPrinterFeedLine(1);
//            printer.appendPrinterQrCode(PrinterFormat.getQrCodeFormat(0, 200), "qwertyuiopasdfg");
            printer.appendPrinterFeedLine(3);
            printer.startPrinter(new PrinterService.IPrinterListener() {
                @Override
                public void onFinish() {
                    Message message = handler.obtainMessage();
                    message.what = 0;
                    message.obj = "打印成功";
                    handler.sendMessage(message);
                }

                @Override
                public void onError(String msg) {
                    Message message = handler.obtainMessage();
                    message.what = 0;
                    message.obj = "打印失败，失败描述:" + msg;
                    handler.sendMessage(message);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    showToast(String.valueOf(msg.obj));
                    break;
                case 1:
                    showToast("扫码成功，数据=[" + String.valueOf(msg.obj) + "]");
                    break;
            }
        }
    };

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void bindDeviceService() {
        Intent intent = new Intent();
//        intent.setPackage("com.ccb.deviceservice.CCBDeviceService");
//        intent.setPackage("com.ccb.smartpos.bankpay");
        intent.setPackage("com.ccb.deviceservice");
        intent.setAction("com.ccb.device_service");
        bindService(intent, conn, Context.BIND_AUTO_CREATE);
    }

    //    // 当进行AIDL跨进程通讯时，如果抛出 Binder invocation to an incorrect interface ，则主要是因为2种情况。   
////1、最普遍的，客户端 VS 服务端 的AIDL必须保证完全一样，包括包名，类名，接口名，及其里面的代码。否则会抛出以上异常
////2、如果第一条符合，则检查下调用的服务是否正确，如果调用的服务不一致或者 服务中返回给客户端的Binder不是客户端想要的，则也会抛出以上异常。
////客户端的aidl文件包名要与服务端的包名一样,在不同工程下建立相同的包名
//
    private IDeviceService manager;
    public ServiceConnection conn = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            manager = IDeviceService.Stub.asInterface(service);
            Log.d(TAG, "onServiceConnected: " + manager);
            try {
                IBinder iBinder = manager.getPrinter();
                Log.d(TAG, "onServiceConnected: " + iBinder);
                IPrinter printer = IPrinter.Stub.asInterface(iBinder);
                Log.d(TAG, "onServiceConnected: " + printer.getStatus());

            } catch (RemoteException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "onServiceDisconnected: ");
        }
    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        DeviceService.getInstance(null).unbindDeviceService();
    }

}
