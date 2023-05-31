package gr.upatras.junit.ergasthrio;
import java.util.*; 

public class MyClass {
	public static String afairesh(int a, int b) {   
		int result=a-b;
		if (result>=0) {
			System.out.println("POSITIVE"); 
			return "POSITIVE";
		}
		else {
			System.out.println("NEGATIVE"); 
			return "NEGATIVE";
		}
	}
}
