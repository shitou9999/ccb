package com.ccb.deviceservice.aidl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lib);
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
            PrinterService printer = PrinterService.getInstance(MainLibActivity.this);
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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        DeviceService.getInstance(null).unbindDeviceService();
    }


}
