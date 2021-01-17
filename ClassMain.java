public class ClassMain {
	
	public static void main(String args[]){
		Parent objP=new Parent();
		Child objC=new Child();
		
		objP.printParent();
		objC.printChlid();
		objC.printParent();
		
	}

}

class Parent{
	void printParent(){
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	void printChlid(){
		System.out.println("This is child class");
	}
}