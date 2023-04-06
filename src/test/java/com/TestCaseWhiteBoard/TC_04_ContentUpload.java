package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.UploadPOM;

public class TC_04_ContentUpload extends BaseClass {
	
	public void ContentUpload() throws InterruptedException {

		System.out.println("Upload a file Started");
		UploadPOM upload_obj = new UploadPOM(driver);
		Thread.sleep(3000);
		upload_obj.uploadClick();
		System.out.println("Upload menu Clicked");
		Thread.sleep(3000);
		upload_obj.uploadSubClick();
		System.out.println("Upload Sub menu Clicked");
		Thread.sleep(3000);
		upload_obj.uploadFilesPath(readconfig.getFilePath());
		System.out.println("File Upload Success");

	}

}
