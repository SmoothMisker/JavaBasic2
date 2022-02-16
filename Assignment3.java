public class Assignment3{
	
	abstract class Shape{
		abstract void calculateArea();
		abstract void display();
	}	

	class Rectangle extends Shape{
		int length;
		int width;
		int area;

		Rectangle(int length, int width){
			this.length = length;
			this.width = width;
		}

		@Override
		void calculateArea(){
			area = length*width;	
		}

		@Override
		void display(){
			System.out.println("Area of this Rectangle is " + area);
		}
	}

	class Circle extends Shape{
		int radius;
		double area;
		
		Circle(int radius){
			this.radius = radius;
		}

		@Override
		void calculateArea(){
			area = 3.14*radius*radius;
		}

		@Override
		void display(){
			System.out.println("Area of this circle is " + area);
		}

	}
	
	class Triangle extends Shape{
		int base;
		int height;
		double area;

		Triangle(int base, int height){
			this.base = base;
			this.height = height;
		}

		@Override
		void calculateArea(){
			area = .5*base*height;
		}

		@Override
		void display(){
			System.out.println("The area of this triangle is " + area);
		}


	}
	
	
	Triangle tri = new Triangle(4,6);
	Circle cir = new Circle(3);
	Rectangle rec = new Rectangle(2,4);

	public void main(String[] args){
		tri.display();
		cir.display();
		rec.display();
	}



}
