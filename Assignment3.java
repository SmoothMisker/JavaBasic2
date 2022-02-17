
	
	interface Shape{
		void calculateArea();
		void display();
	}	

	class Rectangle implements Shape{
		int length;
		int width;
		int area;

		Rectangle(int length, int width){
			this.length = length;
			this.width = width;
		}

		@Override
		public void calculateArea(){
			area = length*width;	
		}

		@Override
		public void display(){
			System.out.println("Area of this Rectangle is " + area);
		}
	}

	class Circle implements Shape{
		int radius;
		double area;
		
		Circle(int radius){
			this.radius = radius;
		}

		@Override
		public void calculateArea(){
			area = 3.14*radius*radius;
		}

		@Override
		public void display(){
			System.out.println("Area of this circle is " + area);
		}

	}
	


	class Triangle implements Shape{
		int base;
		int height;
		double area;

		Triangle(int b, int h){
			base = b;
			height = h;
		}

		@Override
		public void calculateArea(){
			area = .5*base*height;
		}

		@Override
		public void display(){
			System.out.println("The area of this triangle is " + area);
		}


	}
	
	
	public class Assignment3{
	
		public static void main(String[] args){
			Shape rec = new Rectangle(2,4);
			rec.calculateArea();
			rec.display();

			Shape cir = new Circle(3);
			cir.calculateArea();
			cir.display();

			Shape tri = new Triangle(4,6);
			tri.calculateArea();
			tri.display();
		}



}
