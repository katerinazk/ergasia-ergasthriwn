package gr.upatras.junit.ergasthrio;
import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a= num.nextInt();
		System.out.print("Enter the second number:");
		int b= num.nextInt();
		MyClass.afairesh(a,b);
		System.out.print("result printed");
	}

}
