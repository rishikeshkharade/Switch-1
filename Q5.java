import java.io.*;
public class Q5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the Transportation");
		System.out.println("1. Local Transportation");
		System.out.println("2. Ambulance");
		System.out.println("3. Goods Transportation");
		int Transportation = Integer.parseInt(br.readLine());
		if(Transportation<0||Transportation>3)
			System.out.println("Invalid Input");
		
		else {
		
		switch(Transportation){
			case 1:
				System.out.println("Local Transportation");
				System.out.println("1. Bus");
				System.out.println("2. Rickshaw");
				System.out.println("3. Car");
				System.out.println("4. SUV Car");
				System.out.println("5. Mini Bus");
				System.out.println("6. Bike/Scooty");
				
				int choice = Integer.parseInt(br.readLine());
				
				switch(choice) {
				case 1:
					System.out.println("1: Bus");
					break;
					
				case 2:
					System.out.println("2: Rickshaw");
					break;
					
				case 3:
					System.out.println("3: Car");
					break;
					
				case 4:
					System.out.println("4: SUV Car");
					break;
					
				case 5:
					System.out.println("5: Mini Bus");
					break;
					
				case 6:
					System.out.println("6: Bike/Scooty");
					break;
					 
					default:
						System.out.println("Invalid Choice");
						break;
						
					
				}
				break;
			case 2:
				System.out.println("Ambulance");
				System.out.println("1. Government Ambulance");
				System.out.println("2. Private Ambulance");
				System.out.println("3. Nearby Ambulance");
				System.out.println("4. City Hospital Ambulance");
				
				int n = Integer.parseInt(br.readLine());
				switch(n) {
				case 1:
				System.out.println("1: Government Ambulance");
				break;
				
				case 2:
					System.out.println("2: Private Ambulance");
					break;
					
				case 3:
					System.out.println("3: Nearby Ambulance");
					break;
					
				case 4:
					System.out.println("4: City Hospital Ambulance");
					break;
					
					default:
						System.out.println("Invalid Input");
						
				}
				break;
				
			case 3:
				System.out.println("Goods Transportation");
				System.out.println("1. Tempo");
				System.out.println("2. Goods Rickshaw");
				System.out.println("3. Truck");
				System.out.println("4. Mini Truck");
				
				int m = Integer.parseInt(br.readLine());
				
				switch(m) {
				case 1:
					System.out.println("1: Tempo");
					break;
					
				case 2:
					System.out.println("2: Goods Rickshaw");
					break;
					
				case 3:
					System.out.println("3: Truck");
					break;
					
				case 4:
					System.out.println("4: Mini Truck");
					break;
					
					default:
						System.out.println("Invalid Input");
					
				}
				
				
			
			
		}
	}
	}
}