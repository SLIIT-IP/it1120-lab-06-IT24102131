import java.util.Scanner;
public class IT24102131Lab6Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double num,squareroot,square;
		System.out.print("Enter a number :");
		num=input.nextDouble();
		square=num*num;
		squareroot=Math.sqrt(num);
		System.out.println("The square of"+num+"is :"+square);
		System.out.println("The square root of"+num+"is :"+squareroot);
	}
}