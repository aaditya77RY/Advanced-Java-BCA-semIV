package concurrentPro;
//date: 4/2/2026

import java.util.Scanner;
import java.util.Vector;

public class EvenMain {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		Vector<Integer>even1=new Vector<>();
		System.out.println("Enter m and n value to set limit:");

		EvenNum t1=new EvenNum(x=sc.nextInt(),y=sc.nextInt(),even1);
		t1.start();
		
		Vector<Integer>even2=new Vector<>();
		System.out.println("Enter m and n value to set limit:");

		EvenNum t2=new EvenNum(x=sc.nextInt(),y=sc.nextInt(),even2);
		t2.start();
		
		Vector<Integer>even3=new Vector<>();
		System.out.println("Enter m and n value to set limit:");

		EvenNum t3=new EvenNum(x=sc.nextInt(),y=sc.nextInt(),even3);
		t3.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(even1);
		System.out.println(even2);
		System.out.println(even3);
		
	}
}
