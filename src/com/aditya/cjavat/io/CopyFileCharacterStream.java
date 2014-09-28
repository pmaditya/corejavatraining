package com.aditya.cjavat.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacterStream {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader(CopyFileByteStream.class.getResource("sample-file.txt").getFile());
				FileWriter writer = new FileWriter("sample-file-copy.txt");) {

			int b;
			while ((b = reader.read()) != -1) {
				writer.write(b);
			}
			System.out.println("completed copying content");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
