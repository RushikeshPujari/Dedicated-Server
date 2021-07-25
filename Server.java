import java.rmi.Naming;
import java.util.Calendar; 
import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;
import java.io.BufferedWriter; 
public class Server
{
	public static void main(String[]args) throws Exception
	{
		AddC obj = new AddC();
		Naming.rebind("ADD",obj);
		System.out.println("Server Started..");
		Calendar calendar = Calendar.getInstance();  
		System.out.println("The current date is : " + calendar.getTime());  
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("The current date is : " + calendar.getTime());
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}	
		
	}
}