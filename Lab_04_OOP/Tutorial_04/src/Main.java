import java.util.Scanner;



interface IDisplay{
	void print();
	void printDetails();
}

interface ITnput{
	void input();
}

public class Book implements IDisplay,ITnput{
	int bookID;
	String publisher;
	String title;
	@Override
	public void input() {
	 Scanner s1=new Scanner(System.in);
	 
	 System.out.println("Enter the Book ID is : ");
	 this.bookID=s1.nextInt();
	 
	 System.out.println("Enter the Book Title : ");
	 this.title=s1.next();
	 
	 System.out.println("Enter the Publisher Name : ");
	 this.publisher=s1.next();
	 	
	}
	@Override
	public void print() {
		 System.out.println("Book ID :"+this.bookID);
		 System.out.println("Book Title :"+this.title);
		 System.out.println("The Publisher :"+this.publisher);
		
	}
	@Override
	public void printDetails() {
		 System.out.println("Book ID :"+this.bookID);
		 System.out.println("Book Title :"+this.title);
		 System.out.println("The Publisher :"+this.publisher);
		
	}
	
	public class Student implements IDisplay,ITnput {
		
		int studentID;
		String name;
		@Override
		public void input() {
			Scanner s1=new Scanner(System.in);
			
			System.out.println("Student ID :");
			studentID=s1.nextInt();
			
			System.out.println("Name :");
			name=s1.next();
			
		}
		@Override
		public void print() {
			 System.out.println("Student ID :"+this.studentID);
			 System.out.println("Name :"+this.name);
			
		}
		@Override
		public void printDetails() {
			System.out.println("Student ID :"+this.studentID);
			 System.out.println("Name :"+this.name);
			
		}
	}
}





public class Main {

	public static void main(String[] args) {
		Book b1=new Book();
        Book s2=new Student();
		
		IDisplay Id;
		ITnput Ip;
        
		Id=new Book();
		Id.printDetails();
		
		Ip=new Student();
		
		Ip.input();
		
		b1.input();
		b1.print();
		b1.printDetails();
		
		s2.input();
		s2.print();
		s2.printDetails();
	}

}
