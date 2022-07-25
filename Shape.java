package Phase1.mphasis;

public class Shape {
	int result;
	public Shape()
	{
		System.out.println("Default Constructor");
	}
	public Shape(int a)
	{
		result=a*a;
	}
	public Shape(int l,int b){
		 result=l*b;
	}
	public Shape(double r)
			{
		 result=(int)(3.14*(r*r));
			}
	void displaySquare(){
		System.out.println("Area of square:"+result);
	}
	void displayRectangle(){
		System.out.println("Area of rectangle:"+result);
	}
	void displayCircle(){
		System.out.println("Area of circle:"+result);
		}
	public void rhombus( int d1,int d2){
		int r=(d1*d2)/2;
		System.out.println("Area of rhombus:"+ r);
	}
	public void triangle (int b,int h){
		int t=(b*h)/2;
		System.out.println("Area of triangle:"+ t);
	}

public static void main(String[] args) {
	Shape s2=new Shape(5);
	Shape s3=new Shape(6,9);
	Shape s4=new Shape(5.5);
	Shape s5=new Shape();
	s2.displaySquare();
	s3.displayRectangle();
	s4.displayCircle();
	s5.rhombus(2,2);
	s5.triangle(7,8);
	
	
		}

}
