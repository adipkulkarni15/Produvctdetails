package productdetails;

import java.io.FileInputStream;

public class Productinforamtion {

	public static void main(String[] args) {
		 
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\aditya\\Desktop\\Test Product detils1.csv ");
		
		int a;
		
		while((a=fis.read()) !=-1)
		{
			System.out.print((char) a);
		}
		
		fis.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
