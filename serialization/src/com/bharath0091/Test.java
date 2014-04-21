package com.bharath0091;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class Test implements Serializable{

	private static final long serialVersionUID = -3535577327591867198L;
	private String name;
  
  public Test(String name) {
	  this.setName(name);
  }
 
  public static void main(String args[]) throws IOException, ClassNotFoundException {
	  Test test = new Test("my test");
    // serialize
 try {
	Thread.sleep(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    System.out.println("Serialization done.");
    FileOutputStream fos = new FileOutputStream("serial.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(test);
    oos.close();
    // deserialize
    FileInputStream fis = new FileInputStream("serial.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Test deserializedObj = (Test) ois.readObject();
    System.out.println("DeSerialization done. Test: " + deserializedObj.getName());
    ois.close();
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
