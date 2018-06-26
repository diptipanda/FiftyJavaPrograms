package OopsConcepts;

public abstract class ShapeAbstractClass {
	
	int noofsides;
	
	double area;
	
	double perimeter;
	
	public  abstract double calculataArea();
    
	public abstract double calculatePerimeter();
    
	public  void setSides(){ 
    
		System.out.println("to set sides of the required shape");
    }
	}
