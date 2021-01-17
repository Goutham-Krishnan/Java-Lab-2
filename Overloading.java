import java.util.Scanner;

public class Overloading {
	
	void area(int a,int b){
		System.out.println("Area of rectangle = "+(a*b));
	}
	
	void area(int a){
		System.out.println("Area of circle = "+(a*a*3.14));
	}
	
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Overloading obj=new Overloading();
		
		System.out.println("Enter the length and breadth of rectangle");
		int l=scan.nextInt();
		int b=scan.nextInt();
		
		obj.area(l,b);
		System.out.println("Enter the radius of circle");
		int r=scan.nextInt();
		obj.area(r);
		
		scan.close();
	}
	
}
