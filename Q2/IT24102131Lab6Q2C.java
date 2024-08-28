import java.util.Scanner;
public class IT24102131Lab6Q2C{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count=1;
		int num;
		int sum=0;
		System.out.println("Please enter 10 numbers");
		
		 while(count<=10)
		 {System.out.print("Enter number "+count+ ":");
		 num=input.nextInt();
		 count=count+1;}
		 
		 System.out.println("The numbers you entered are :");
		 System.out.print(num);
		 sum=num+sum;
		 System.out.println("Sum of the numbers"+sum);
		 double avg=sum/10;
		 System.out.println("Average of the numbers"+ avg);
		 
	
		 
	}
}