package com.ccb.deviceservice.aidl.printer;

public interface Constant {
    static interface Align {
        int LEFT = 0;
        int CENTER = 1;
        int RIGHT = 2;
    }

    static interface ErrorCode {
        int ERROR_NONE = 0;
        int ERROR_PAPERENDED = 240;
        int ERROR_HARDERR = 242;
        int ERROR_OVERHEAT = 243;
        int ERROR_BUFOVERFLOW = 245;
        int ERROR_LOWVOL = 225;
        int ERROR_PAPERENDING = 244;
        int ERROR_MOTORERR = 251;
        int ERROR_PENOFOUND = 252;
        int ERROR_PAPERJAM = 238;
        int ERROR_NOBM = 246;
        int ERROR_BUSY = 247;
        int ERROR_BMBLACK = 248;
        int ERROR_WORKON = 230;
        int ERROR_LIFTHEAD = 224;
        int ERROR_CUTPOSITIONERR = 226;
        int ERROR_LOWTEMP = 227;
    }

    static interface FontSize {
        int SMALL = 0;
        int NORMAL = 1;
        int LARGE = 2;
    }
}