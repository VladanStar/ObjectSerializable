package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{

            FileOutputStream fos = new FileOutputStream("tekst.txt");
            ObjectOutputStream output = new ObjectOutputStream(fos);
            Student s = new Student("Zoran Manojlovic");
            output.writeObject(s);
            output.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("tekst.txt"));
            Student inStudent = null;
           inStudent = (Student) inputStream.readObject();
            System.out.println(inStudent.name);
            output.close();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

}

