package com.ccb.deviceservice.aidl.printer;

import com.ccb.deviceservice.aidl.printer.OnPrintListener;


interface IPrinter {

	int getStatus();
	void setGray(int gray);
	void addText(in Bundle format, String text);
	void addBarCode(in Bundle format, in String barcode);
	void addQrCode(in Bundle format, String qrCode);
	void addImage(in Bundle format, in byte[] imageData);
	void feedLine(int lines);
	void startPrint(OnPrintListener listener);
	void cutPaper();
	void autoCutPaper();
}
