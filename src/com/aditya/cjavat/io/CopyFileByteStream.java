package com.aditya.cjavat.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByteStream {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(CopyFileByteStream.class.getResource("java-image.jpg").getFile());
			fos = new FileOutputStream("java-image-copy.jpg");
			int b;

			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			System.out.println("done copying the content");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
