package com.aditya.cjavat.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

	public static void main(String[] args) {
		Person p = new Person(10, "Arka", "10-Hyderabad");

		try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("person.ser"));) {
			ois.writeObject(p);
			System.out.println("serialized the person object");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
