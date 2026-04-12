package test.courses.in28minutes.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;

class Rectangle implements Serializable {

	private static final long serialVersionUID = 598350608953495794L;

	private int length;
	private int width;
	transient private int area;

	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + "]";
	}
	
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
}

public class TestSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Rectangle rect = new Rectangle(6, 5);
		System.out.println("rect="+rect);
		File file = Paths.get("./resources/rectangle.ser").toFile();
		
		writeToFile(rect, file);
		Rectangle rectFromFile = readFromFile(file);
		System.out.println("rectFromFile="+rectFromFile);
		
	}

	private static Rectangle readFromFile(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Rectangle rectFromFile = (Rectangle)ois.readObject();
		ois.close();
		fis.close();
		return rectFromFile;
	}

	private static void writeToFile(Rectangle rect, File file) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream  oos = new ObjectOutputStream(fos);
		oos.writeObject(rect);
		oos.close();
		fos.close();
	}
}
