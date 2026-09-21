package courses.in28minutes;

import java.io.Closeable;
import java.io.IOException;

class MyRes implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyRes:close() called");
	}
}


class MyRes2 implements Closeable {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("MyRes2:close() called");
		
	}
}


public class TestTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (MyRes myRes = new MyRes()) {
			System.out.println(myRes);
		} catch(Exception e) {
			
		}

		
		try (MyRes2 myRes2 = new MyRes2()) {
			System.out.println(myRes2);
		} catch(Exception e) {
			
		}
		
	}

}
