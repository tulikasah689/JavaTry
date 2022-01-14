import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main (String args[]) throws IOException {
		// TODO Auto-generated constructor stub
		String report="<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Page Title</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>This is a Heading</h1>\r\n" + 
				"<p>This is a paragraph.</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" ;
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    /*Date date = new Date();  
	    //System.out.println(formatter.format(date));  
	    System.out.println(date);
	    File f = new File("C:\\HealthCheck_try\\"+date);
	    f.mkdir();*/
	    
	    
	    
		FileWriter fw=new FileWriter("C:\\HealthCheck_try\\testout.html");    
        fw.write(report);    
        fw.close();
		System.out.println("pass checking");
		System.exit(0);
		
				
	}

}
