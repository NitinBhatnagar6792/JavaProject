package test.courses.in28minutes.io;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

class Circle implements Externalizable {

	private static final double PI = 3.14d;
	private double radius;
	private double area;

	public Circle() {
       System.out.println("default Circle constructor called");		
	}
	public Circle(double radius) {
		this.radius =radius;
		this.area = PI * radius * radius;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeDouble(radius);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		radius = in.readDouble();
		this.area = PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}
	
}

public class TestExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Circle circle = new Circle(2.5d);
		System.out.println("circle:"+circle);
		File file = Paths.get("./resources/circle.er").toFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(circle);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Circle circleFromFile = (Circle)ois.readObject();
		System.out.println("circleFromFile:"+circleFromFile);
		ois.close();
		fis.close();

	}

}
