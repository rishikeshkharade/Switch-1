import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		
		if(num1<0||num2<0) 
			System.out.println("Sorry negative numbers not allowed");
	
		else {
		switch((num1*num2)%2) {
		case 1:
			System.out.println("Number is Odd");
			break;
			
		case 0:
			System.out.println("Number is even");
		}
	}
}
}
