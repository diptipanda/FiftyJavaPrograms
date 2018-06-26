package Arrays;

public class MargeArray {
	
public static void main(String args[]){
	
int [] array1 = {1,8,9,6,7};
int [] array2 = {0,88,99,87};
int [] array3 = new int[array1.length+array2.length];

int count =0;

for (int i= 0; i < array1.length;i++)
{
	array3[i] = array1[i];
	count++;
}
for(int j =0;j<array2.length;j++)
{
	array3[count++] = array2[j];
	
}
for(int i=0;i<array3.length;i++)

{
	System.out.print(array3[i]+",");
}
}
}
