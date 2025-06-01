package Day25_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

public class Ex4_ReadingPropertiesFile2 {

	public static Properties readPropertiesFile(String filePath) throws IOException
	{
		Properties prop=new Properties();
		
		// Create a FileInputStream to read the properties file
		FileInputStream file=new FileInputStream(filePath);
		
		 // Load the properties from the file
		prop.load(file);
		
		file.close(); // closing FileInputStream
		
		return prop;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		Properties myproperties=readPropertiesFile(".\\src\\main\\java\\ex24_FileHandling\\sample.properties");
		
		
		//Retrieve values using prop object
		
		String myname=myproperties.getProperty("name");
		String myemail=myproperties.getProperty("email");
		String myage=myproperties.getProperty("age");
		System.out.println(myname+"   "+myemail+"  "+myage);
		
		//Retrieves all the values
		
		Collection <Object> values=myproperties.values();
		System.out.println(values); //[John Doe, john.doe@example.com, 30]
				
				
		//Reading keys and values using loop
				
		for(String key:myproperties.stringPropertyNames())
			{
					System.out.println(key+"  "+myproperties.getProperty(key));
			}
		
	}

}
