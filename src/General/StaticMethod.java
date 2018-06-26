package General;

	public class StaticMethod {
		
		String name;
		
		int rollno;
		
		static String collegename="ITIS";
		
		static void change()
		{
			collegename="BBDIT";
			
		}
		
		StaticMethod(int a, String b){
			
			rollno=a;
			
			name=b;
		}
		
		public void display(){
			
			
			System.out.println(rollno +" "+name+" "+collegename);
		}
		

		public static void main(String[] args) {
			
			StaticMethod.change();//static method don't need to be instantiated
			
			StaticMethod s1=new StaticMethod(111,"name1");
			
			StaticMethod s2=new StaticMethod(222,"name2");
			
			StaticMethod s3=new StaticMethod(333,"name3");
			
			s1.display();
			
			s2.display();
			
			s3.display();

		}

	}
