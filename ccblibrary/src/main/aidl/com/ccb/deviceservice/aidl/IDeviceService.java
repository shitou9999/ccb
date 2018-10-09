/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: I:\\ccb\\ccblibrary\\src\\main\\aidl\\com\\ccb\\deviceservice\\aidl\\IDeviceService.aidl
 */
package com.ccb.deviceservice.aidl;

public interface IDeviceService extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements IDeviceService {
        private static final String DESCRIPTOR = "com.ccb.deviceservice.aidl.IDeviceService";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.ccb.deviceservice.aidl.IDeviceService interface,
         * generating a proxy if needed.
         */
        public static IDeviceService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof IDeviceService))) {
                return ((IDeviceService) iin);
            }
            return new Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            String descriptor = DESCRIPTOR;
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(descriptor);
                    return true;
                }
                case TRANSACTION_lock: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _arg1;
                    _arg1 = data.readStrongBinder();
                    boolean _result = this.lock(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_unlock: {
                    data.enforceInterface(descriptor);
                    this.unlock();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getVersion: {
                    data.enforceInterface(descriptor);
                    String _result = this.getVersion();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getBeeper: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getBeeper();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getLed: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getLed();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getSerialPort: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getSerialPort();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getScanner: {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    android.os.IBinder _result = this.getScanner(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getMagCardReader: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getMagCardReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getInsertCardReader: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getInsertCardReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getRFCardReader: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getRFCardReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPinpad: {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    android.os.IBinder _result = this.getPinpad(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPrinter: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getPrinter();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPBOC: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getPBOC();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getDeviceInfo: {
                    data.enforceInterface(descriptor);
                    android.os.IBinder _result = this.getDeviceInfo();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getParamFile: {
                    data.enforceInterface(descriptor);
                    String _arg0;
                    _arg0 = data.readString();
                    String _arg1;
                    _arg1 = data.readString();
                    android.os.IBinder _result = this.getParamFile(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPinpadEx: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getPinpadEx(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getRFCardReaderEx: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getRFCardReaderEx(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getCashBox: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getCashBox(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getExtScanner: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getExtScanner(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getLedEx: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getLedEx(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getSignPanel: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getSignPanel(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getSerialPortEx: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getSerialPortEx(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getInsertCardReaderEx: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getInsertCardReaderEx(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPsamCardReader: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getPsamCardReader(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getIDCardReader: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getIDCardReader(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPedestal: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    android.os.IBinder _result = this.getPedestal(_arg0);
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        private static class Proxy implements IDeviceService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public boolean lock(android.os.Bundle data, android.os.IBinder session) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((data != null)) {
                        _data.writeInt(1);
                        data.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeStrongBinder(session);
                    mRemote.transact(Stub.TRANSACTION_lock, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void unlock() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_unlock, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public String getVersion() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getBeeper() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getBeeper, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getLed() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getLed, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getSerialPort() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getSerialPort, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getScanner(int cameraId) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(cameraId);
                    mRemote.transact(Stub.TRANSACTION_getScanner, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getMagCardReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getMagCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getInsertCardReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getInsertCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getRFCardReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getRFCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPinpad(int kapId) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(kapId);
                    mRemote.transact(Stub.TRANSACTION_getPinpad, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPrinter() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinter, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPBOC() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPBOC, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getDeviceInfo() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getDeviceInfo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getParamFile(String moduleName, String fileName) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(moduleName);
                    _data.writeString(fileName);
                    mRemote.transact(Stub.TRANSACTION_getParamFile, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPinpadEx(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getPinpadEx, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getRFCardReaderEx(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getRFCardReaderEx, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getCashBox(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getCashBox, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getExtScanner(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getExtScanner, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getLedEx(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getLedEx, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getSignPanel(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getSignPanel, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getSerialPortEx(android.os.Bundle param) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((param != null)) {
                        _data.writeInt(1);
                        param.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getSerialPortEx, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getInsertCardReaderEx(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((bundle != null)) {
                        _data.writeInt(1);
                        bundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getInsertCardReaderEx, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPsamCardReader(android.os.Bundle param) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((param != null)) {
                        _data.writeInt(1);
                        param.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getPsamCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getIDCardReader(android.os.Bundle param) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((param != null)) {
                        _data.writeInt(1);
                        param.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getIDCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPedestal(android.os.Bundle param) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((param != null)) {
                        _data.writeInt(1);
                        param.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_getPedestal, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_lock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_unlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_getBeeper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_getLed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_getMagCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_getInsertCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_getRFCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_getPinpad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_getPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_getPBOC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_getDeviceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_getParamFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_getPinpadEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
        static final int TRANSACTION_getRFCardReaderEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
        static final int TRANSACTION_getCashBox = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
        static final int TRANSACTION_getExtScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
        static final int TRANSACTION_getLedEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
        static final int TRANSACTION_getSignPanel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
        static final int TRANSACTION_getSerialPortEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
        static final int TRANSACTION_getInsertCardReaderEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
        static final int TRANSACTION_getPsamCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
        static final int TRANSACTION_getIDCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
        static final int TRANSACTION_getPedestal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    }

    public boolean lock(android.os.Bundle data, android.os.IBinder session) throws android.os.RemoteException;

    public void unlock() throws android.os.RemoteException;

    public String getVersion() throws android.os.RemoteException;

    public android.os.IBinder getBeeper() throws android.os.RemoteException;

    public android.os.IBinder getLed() throws android.os.RemoteException;

    public android.os.IBinder getSerialPort() throws android.os.RemoteException;

    public android.os.IBinder getScanner(int cameraId) throws android.os.RemoteException;

    public android.os.IBinder getMagCardReader() throws android.os.RemoteException;

    public android.os.IBinder getInsertCardReader() throws android.os.RemoteException;

    public android.os.IBinder getRFCardReader() throws android.os.RemoteException;

    public android.os.IBinder getPinpad(int kapId) throws android.os.RemoteException;

    public android.os.IBinder getPrinter() throws android.os.RemoteException;

    public android.os.IBinder getPBOC() throws android.os.RemoteException;

    public android.os.IBinder getDeviceInfo() throws android.os.RemoteException;

    public android.os.IBinder getParamFile(String moduleName, String fileName) throws android.os.RemoteException;

    public android.os.IBinder getPinpadEx(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getRFCardReaderEx(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getCashBox(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getExtScanner(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getLedEx(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getSignPanel(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getSerialPortEx(android.os.Bundle param) throws android.os.RemoteException;

    public android.os.IBinder getInsertCardReaderEx(android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.IBinder getPsamCardReader(android.os.Bundle param) throws android.os.RemoteException;

    public android.os.IBinder getIDCardReader(android.os.Bundle param) throws android.os.RemoteException;

    public android.os.IBinder getPedestal(android.os.Bundle param) throws android.os.RemoteException;
}
