import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your interest?");
		System.out.println("1. movies");
		System.out.println("2. Series");
		System.out.print("Enter you choice 1 or 2: ");
		int n = sc.nextInt();
	
		switch(n) {
		case 1:
			System.out.println("Movie you wish to watch");
			System.out.println("1. Founder");
			System.out.println("2. Snowden");
			System.out.println("3. Jobs");
			System.out.println("4. Her");
			System.out.println("5. Social Network");
			System.out.println("6. Wall-E");
			System.out.println("7. AI");
			System.out.println("Enter your choice: 2");
			int m = sc.nextInt();
			switch(m) {
			case 1:
				System.out.println("1: Founder");
				break;
				
			case 2:
				System.out.println("2: Snowden");
				break;
				
			case 3:
				System.out.println("3: Jobs");
				break;
				
			case 4:
				System.out.println("4: Her");
				break;
				
			case 5:
				System.out.println("5: Social Network");
				break;
				
			case 6:
				System.out.println("6: Wall-E");
				break;
				
			case 7:
				System.out.println("7: AI");
				break;
				
				default:
					System.out.println("Invalid choice");
				
			}
			break;
			
		case 2:
			System.out.println("Best series to watch");
			System.out.println("1. Silicon Valley");
			System.out.println("2. Devs");
			System.out.println("3. the IT crowd");
			System.out.println("4. Mr. Robot");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1: Silicon Valley");
				break;
				
			case 2:
				System.out.println("2: Devs");
				break;
				
			case 3:
				System.out.println("3: the IT crowd");
				break;
				
			case 4:
				System.out.println("4: Mr. Robot");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		default:
			System.out.println("Invalid choice");
			
			
		}
	}

}
