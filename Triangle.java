public class Triangle {
	
	int a,b,c;
	
	Triangle(){
		a=3;
		b=4;
		c=5;
	}
	
	double Area()
	{
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	int Perimeter()
	{
		return a+b+c;
	}
	
	public static void main(String args[]){
		Triangle obj=new Triangle();
		System.out.println("Area: "+obj.Area());
		System.out.println("Perimeter: "+obj.Perimeter());
	}

}

/*
Area: 6.0
Perimeter: 12
*/
