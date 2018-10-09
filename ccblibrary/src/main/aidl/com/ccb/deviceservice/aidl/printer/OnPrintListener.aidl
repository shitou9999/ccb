package com.ccb.deviceservice.aidl.printer;


interface OnPrintListener {

	void onFinish();
	void onError(int error);
}
