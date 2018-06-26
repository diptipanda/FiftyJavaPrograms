package OopsConcepts;

public  class Circle extends ShapeAbstractClass implements  ShapeConstant{
	 private double radius;
	
	 public Circle(double d) {
	
		 radius=d;
	}
	
	
	
	public double calculataArea() {
		
		area= pi* Math.pow(radius, 2);
		
		return area;
	}
	
	
	public double calculatePerimeter() {
		
		perimeter= 2*pi*radius;
		
		return perimeter;
	}
	
	
	public void setSides()
	{
		System.out.println("Circle has only radius as parameter");
	}
   
   public static void main(String args[]){
	   
   	Circle c = new Circle(2.0);
   	
   	c.setSides();
   	
   	double d=c.calculataArea();
   	
   	System.out.println("Area is "+d);
   	
   	double f=c.calculatePerimeter();
   	
   	System.out.println("Perimeter is "+f);
   }
}