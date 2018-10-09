package com.ccb.deviceservice.aidl;

interface IDeviceService {

    boolean lock(in Bundle data, IBinder session);
    void unlock();
    String getVersion();
    IBinder getBeeper();
    IBinder getLed();
    IBinder getSerialPort();
    IBinder getScanner(int cameraId);
    IBinder getMagCardReader();
    IBinder getInsertCardReader();
    IBinder getRFCardReader();
    IBinder getPinpad(int kapId);
    IBinder getPrinter();
    IBinder getPBOC();
    IBinder getDeviceInfo();
    IBinder getParamFile(String moduleName, String fileName);
    IBinder getPinpadEx(in Bundle bundle);
    IBinder getRFCardReaderEx(in Bundle bundle);
    IBinder getCashBox(in Bundle bundle);
    IBinder getExtScanner(in Bundle bundle);
    IBinder getLedEx(in Bundle bundle);
    IBinder getSignPanel(in Bundle bundle);
    IBinder getSerialPortEx(in Bundle param);
    IBinder getInsertCardReaderEx(in Bundle bundle);
    IBinder getPsamCardReader(in Bundle param);
    IBinder getIDCardReader(in Bundle param);
    IBinder getPedestal(in Bundle param);

}
