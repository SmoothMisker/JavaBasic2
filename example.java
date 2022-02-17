interface MyInterface{
	public void demo();
	public static void display(){
		System.out.println("This is a static method");
	}

}


public class example{
	public void demo(){
		System.out.println("This is the implementation of the demo method");
	}

	public static void main(String[] args){
		example obj = new example();
		obj.demo();
		MyInterface.display();
	}
}
