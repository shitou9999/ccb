/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: I:\\ccb\\ccblibrary\\src\\main\\aidl\\com\\ccb\\deviceservice\\aidl\\printer\\IPrinter.aidl
 */
package com.ccb.deviceservice.aidl.printer;

public interface IPrinter extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements IPrinter {
        private static final String DESCRIPTOR = "com.ccb.deviceservice.aidl.printer.IPrinter";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.ccb.deviceservice.aidl.printer.IPrinter interface,
         * generating a proxy if needed.
         */
        public static IPrinter asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof IPrinter))) {
                return ((IPrinter) iin);
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
                case TRANSACTION_getStatus: {
                    data.enforceInterface(descriptor);
                    int _result = this.getStatus();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_setGray: {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.setGray(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addText: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    String _arg1;
                    _arg1 = data.readString();
                    this.addText(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addBarCode: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    String _arg1;
                    _arg1 = data.readString();
                    this.addBarCode(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addQrCode: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    String _arg1;
                    _arg1 = data.readString();
                    this.addQrCode(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addImage: {
                    data.enforceInterface(descriptor);
                    android.os.Bundle _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    this.addImage(_arg0, _arg1);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_feedLine: {
                    data.enforceInterface(descriptor);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.feedLine(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_startPrint: {
                    data.enforceInterface(descriptor);
                    OnPrintListener _arg0;
                    _arg0 = OnPrintListener.Stub.asInterface(data.readStrongBinder());
                    this.startPrint(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_cutPaper: {
                    data.enforceInterface(descriptor);
                    this.cutPaper();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_autoCutPaper: {
                    data.enforceInterface(descriptor);
                    this.autoCutPaper();
                    reply.writeNoException();
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        private static class Proxy implements IPrinter {
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
            public int getStatus() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public void setGray(int gray) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(gray);
                    mRemote.transact(Stub.TRANSACTION_setGray, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addText(android.os.Bundle format, String text) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((format != null)) {
                        _data.writeInt(1);
                        format.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeString(text);
                    mRemote.transact(Stub.TRANSACTION_addText, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addBarCode(android.os.Bundle format, String barcode) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((format != null)) {
                        _data.writeInt(1);
                        format.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeString(barcode);
                    mRemote.transact(Stub.TRANSACTION_addBarCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addQrCode(android.os.Bundle format, String qrCode) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((format != null)) {
                        _data.writeInt(1);
                        format.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeString(qrCode);
                    mRemote.transact(Stub.TRANSACTION_addQrCode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void addImage(android.os.Bundle format, byte[] imageData) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((format != null)) {
                        _data.writeInt(1);
                        format.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    _data.writeByteArray(imageData);
                    mRemote.transact(Stub.TRANSACTION_addImage, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void feedLine(int lines) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(lines);
                    mRemote.transact(Stub.TRANSACTION_feedLine, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void startPrint(OnPrintListener listener) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    mRemote.transact(Stub.TRANSACTION_startPrint, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void cutPaper() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_cutPaper, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void autoCutPaper() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_autoCutPaper, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_setGray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_addText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_addBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_addQrCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_addImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_feedLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_startPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_cutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_autoCutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    }

    public int getStatus() throws android.os.RemoteException;

    public void setGray(int gray) throws android.os.RemoteException;

    public void addText(android.os.Bundle format, String text) throws android.os.RemoteException;

    public void addBarCode(android.os.Bundle format, String barcode) throws android.os.RemoteException;

    public void addQrCode(android.os.Bundle format, String qrCode) throws android.os.RemoteException;

    public void addImage(android.os.Bundle format, byte[] imageData) throws android.os.RemoteException;

    public void feedLine(int lines) throws android.os.RemoteException;

    public void startPrint(OnPrintListener listener) throws android.os.RemoteException;

    public void cutPaper() throws android.os.RemoteException;

    public void autoCutPaper() throws android.os.RemoteException;
}
