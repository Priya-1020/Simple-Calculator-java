package day1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		System.out.println(".....CALCULATOR..... ");
		float a,b,c;
		int ch;
		int des=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for\"a\":");
		a=sc.nextFloat();
		System.out.println("enter a value for\"b\":");
		b=sc.nextFloat();
		while(des==1) {
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("CHOOSE ANY ONE:");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					c=a+b;
					System.out.format("addition of %.2f and %.2f is:%.2f\n",a,b,c);
					break;
				case 2:
					c=a-b;
					System.out.format("subtraction of %.2f and %.2f is:%.2f\n",a,b,c);
					break;
				case 3:
					c=a*b;
					System.out.format("multiplication of %.2f and %.2f is:%.2f\n",a,b,c);
					break;
				case 4:
					c=a/b;
					System.out.format("division of %.2f and %.2f is:%.2f\n",a,b,c);
					break;
				default:
					System.out.println("Happy Calculation!");
				
			}
				System.out.println("If you want to continue press 1:");
				des=sc.nextInt();
		
		}
		System.out.println("..!!..End Of Code..!!..");
	}

}
