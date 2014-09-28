package com.aditya.cjavat.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileBufferedStreams {

	public static void main(String[] args) {
		try (BufferedReader bufRead = new BufferedReader(new FileReader(CopyFileBufferedStreams.class.getResource("sample-file.txt").getFile()));
				PrintWriter writer = new PrintWriter("sample-file-copy.txt");) {

			String line = null;

			while ((line = bufRead.readLine()) != null) {
				// writing content to the console.
				System.out.println(line);
				writer.write(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
