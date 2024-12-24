package module25_polymorphism;
import java.util.*;
public class Calculate {
	static int addition(int num1, int num2) {
		return num1 + num2;
	}
	static double addition(double dnum1, double dnum2) {
		return dnum1 + dnum2;
	}
	static void addition() {
		int sum = 0;
		String status = "yes";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter number");
			sum += input.nextInt();
			System.out.println("do you want to another number(yes/no)");
			status = input.next();
			}while(status.equals("yes"));
		System.out.println("Sun = " + sum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("num1 + num2 is = " + addition(2,3));
		System.out.println("dnum1 + dnum2 is = " + addition(3.3,2.3));
		addition();
	}

}
