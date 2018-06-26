package OopsConcepts;

public class Overloading {
	
	
	
	 public void display(){
		 
		 System.out.println("This is parent class");
	 
	 }
	 
	 public int add(int num1,int num2){
		 
			int  sum = num1+num2;
			
			return sum;
		 }
	 
	 public double add(double num1,double num2){
	
		 double  sum = num1+num2;
		
		 return sum;
	 }
	 
	 
	 public void printSum(double sum){
		 
		 System.out.println("Sum is "+ sum);
	 }
		 
		
			 
    public static void main(String args[]){
    	
    	Overloading obj1= new Overloading();
    	
    	
    	obj1.display();
    	
  
    	int a =obj1.add(2,4);
    	
    	obj1.printSum(a);
    	
    	double b =obj1.add(23.0,45.0);
    	
    	obj1.printSum(b);
    
}
    }