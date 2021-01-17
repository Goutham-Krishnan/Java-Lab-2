import java.util.*;
public class Area {
	
	int length;
	int breadth;
	
	public Area(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	int returnArea(){
		return length*breadth;
	}
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		Area obj=new Area(length, breadth);
		System.out.println("Area : "+obj.returnArea());
		scan.close();
	}

}

/*
Enter the length and breadth
3
4
Area : 12
*/
