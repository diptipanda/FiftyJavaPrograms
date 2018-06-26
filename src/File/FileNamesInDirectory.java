package File;

import java.io.File;

public class FileNamesInDirectory {

    public static void main(String[] args) {
    	
    File folder = new File("/users/admin/desktop");	         
        
    File[] files = folder.listFiles();	         
       
    for (File file : files) 
       
    {
            if (file.isFile())
          
            {
            
            	System.out.println(file.getName());
            	
            }
        }
    }
}