import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex_03 {

	public static void main(String[] args) {
		int maxSubjects;
		int total = 0;
		double avg;
		int[] marks=new int[5];
		
		try {
			Scanner sc=new Scanner (System.in);
			System.out.print("Max Subject : ");
			maxSubjects= sc.nextInt();
			
			for(int i=0;i<maxSubjects;i++) {
				System.out.print("Markes : ");
				marks[i]=sc.nextInt();
				total=total+marks[i];
			}
			
			avg=total/maxSubjects;
			System.out.println("Average marks is : "+avg);
			
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
         finally {
        	 System.out.println("...This code will be run...");
         }
		System.out.println("The end of the code !!!");
	}

}
