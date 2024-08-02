import java.io.*;
public class Q1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int marathiMarks;
		System.out.print("Enter Marathi marks= ");
		marathiMarks=Integer.parseInt(br.readLine());
		
		int englishMarks;
		System.out.print("Enter English marks= ");
		englishMarks=Integer.parseInt(br.readLine());
		
		int mathMarks;
		System.out.print("Enter Math marks= ");
		mathMarks=Integer.parseInt(br.readLine());
		
		int scienceMarks;
		System.out.print("Enter Science marks= ");
		scienceMarks=Integer.parseInt(br.readLine());
		
		if(marathiMarks<35||englishMarks<35||mathMarks<35||scienceMarks<35) {
			System.out.println("You Failed Exam");
	
		}else {
			double avg = (marathiMarks+englishMarks+mathMarks+scienceMarks)/5;
			
		char ch;
		if(avg>75)
			ch='A';
		
		else if(avg>60)
			ch='B';
		
		else if(avg>50)
			ch='C';
		
		else if(avg>40)
			ch='D';
		
		else if(avg>=35)
			ch='E';
		
		else
			
			ch='F';
		
		switch(ch) {
		case 'A':
			System.out.println("First class with Distinction");
			break;
			
		case 'B':
			System.out.println("First Class");
			break;
			
		case 'C':
			System.out.println("Second Class");
			break;
			
		case 'D':
			System.out.println("Third Class");
			break;
			
		case 'E':
			System.out.println("Pass");
			break;
			
		case 'F':
			System.out.println("Fail");
			break;
		}
		
	}
	}
}
