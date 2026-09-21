package test.courses;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World:"+Arrays.toString(args));
		System.out.println(args[3]);
		
		sumDouble();
	}

	public static void sumDouble () {
		
		double [] da = {5.5, 10.1, 11};
		double s = 5.5+ 10.1 +11;
		System.out.println(s/3);
		
		double a = 3.0/0;
		double b = 0/4.0;
		double c = 0/0.0; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int g =3; System.out.println(++g*8);
		
		double r, pi, area;
		r = 9.8;
		pi= 3.14;
		area = pi * r * r;
		System.out.println(area);
		
		int i = -8;
		//System.out.println( i>>2);
		System.out.println( i>>>2);
		System.out.println( i>>2);
		System.out.println( i>>1);
		System.out.println(i);
	}
}
