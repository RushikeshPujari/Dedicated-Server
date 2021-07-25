import java.rmi.Naming;
import java.util.Scanner; 
import java.rmi.RemoteException;
import java.util.Calendar; 
import java.util.Scanner; 
import java.io.*; 
import java.awt.Desktop;  
import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;
import java.io.BufferedWriter;

//Addi obj=(Addi)Naming.lookup("ADD");
		//int n = obj.add(12,13);
		//System.out.println("Addition = "+n);

public class Client
{
	public static void main(String[]args)throws Exception
	{
	Scanner input = new Scanner(System.in);

    String Username;
    String Password;
	
	Password = "admin";
    Username = "admin";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();
	 
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password))
		{
			System.out.println("Access Granted! Welcome!");
		while(true)
		{			
			System.out.println("\n\nList of services Provided By Server\n");
			System.out.println("     __________________________________________");
			System.out.println("     |    1] Calculator                        |");
			System.out.println("     |_________________________________________|");
			System.out.println("     |    2] Log file                          |");
			System.out.println("     |_________________________________________|");
			System.out.println("     |    3] List of Available Files           |");
			System.out.println("     |_________________________________________|");
			System.out.println("     |    4] Write a Existing File             |");
			System.out.println("     |_________________________________________|");
			System.out.println("     |    5] Create a New File                 |");
			System.out.println("     |_________________________________________|");
			System.out.println("     |    6] Exit                              |");
			System.out.println("     |_________________________________________|");
			System.out.print("__E_N_T_E_R___C_H_O_I_C_E_= ");
			Addi obj=(Addi)Naming.lookup("ADD");
			int op,op1;
			Scanner Option = new Scanner(System.in);
			op= Option.nextInt();
			boolean val;
			switch(op)
			{
				case 1:System.out.println("Calculator Selected");
					System.out.println("Enter Two Numbers");
					Scanner sc = new Scanner(System.in);
					int num1, num2;
					num1=sc.nextInt();
					num2=sc.nextInt();
					System.out.println("      _________________________________________ ");
					System.out.println("     |             Select Operation             ");
					System.out.println("     |_________________________________________|");
					System.out.println("	 |	1] Addition                            |");
					System.out.println("     |_________________________________________|");
					System.out.println("	 |	2] Multiplication                      |");
					System.out.println("     |_________________________________________|");
					System.out.println("	 |	3] Division                            |");
					System.out.println("     |_________________________________________|");
					System.out.println("	 |	4] Substraction                        |");
					System.out.println("     |_________________________________________|");
					int n;
					op1=Option.nextInt();
					switch(op1)
					{
							case 1:n=obj.add(num1,num2);
							System.out.println("Addition Selected");
							System.out.println("Addition is "+n);
							break;
							case 2:n=obj.mul(num1,num2);
							System.out.println("Multiplication Selected");
							System.out.println("Multiplication is "+n);
							break;
							case 3:n=obj.div(num1,num2);
							System.out.println("Division Selected");
							System.out.println("Division is "+n);
							break;
							case 4:n=obj.sub(num1,num2);
							System.out.println("Substraction Selected");
							System.out.println("Substraction is "+n);
							break;
							
					}
				break;
				case 2:System.out.println(" Opening a log file.");
				//n=obj.Calender(1,1);
				val=obj.OpenLog(1,1);
				if(val)
					{
						File file = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
	  
						BufferedReader br = new BufferedReader(new FileReader(file));
	  
						String st;
						while ((st = br.readLine()) != null)
						{
							System.out.println(st);
						}
					}
					
				break;
				case 3:System.out.println("List of Available Files");
				
				val=obj.ReadAvailableFile(1,1);
				if(val)
				{
				File file = new File("C:/Users/SHRI 1/Desktop/mini102/ListOfAvailableFiles.txt");
	  
				BufferedReader br = new BufferedReader(new FileReader(file));
	  
				String st;
				while ((st = br.readLine()) != null)
				{
					System.out.println(st);
				}
				}
				System.out.println();
				System.out.println("Enter file name to open it ");
				val=obj.ReadFile(1,1);
				if(val)
				{
					//Scanner input = new Scanner(System.in);
					System.out.print("Enter Filename : ");
					String Filename = input.next();
					System.out.println();
					File file = new File("C:/Users/SHRI 1/Desktop/mini102/SavedFiles/"+Filename);
	  
						BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
				String st;
				while ((st = br.readLine()) != null)
				{
					System.out.println(st);
				}
				System.out.println();
				}
				break;
				case 4:System.out.println("Write a Existing File");
				val=obj.ReadAvailableFile(1,1);
				if(val)
				{
					File file = new File("C:/Users/SHRI 1/Desktop/mini102/ListOfAvailableFiles.txt");
	  
					BufferedReader br = new BufferedReader(new FileReader(file));
		  
					String st;
					while ((st = br.readLine()) != null)
					{
						System.out.println(st);
					}
					System.out.println();
					}
				System.out.print("Enter file name to open it =  ");
				val=obj.EditFile(1,1);
				if(val)
				{
					try  
					{  
					//constructor of file class having file as argument  
					//Scanner input = new Scanner(System.in);
					System.out.println("Enter Filename : ");
					String Filename = input.next();
					File file = new File("C:/Users/SHRI 1/Desktop/mini102/SavedFiles/"+Filename);
					
					if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
						{  
							System.out.println("not supported");  
							//return x;  
						}  
					Desktop desktop = Desktop.getDesktop();  
					if(file.exists())         //checks file exists or not  
					desktop.open(file);              //opens the specified file  
					}  
					catch(Exception e)  
					{  
						e.printStackTrace();  
					}
				}
				break;
				case 5:System.out.println("Create a New File");
				val=obj.CreateFile(1,1);
				if(val)
				{
					//Scanner input = new Scanner(System.in);
					System.out.println("Enter Filename : ");
					String Filename = input.next();
					File file = new File("C:/Users/SHRI 1/Desktop/mini102/SavedFiles/"+Filename);
					//initialize File object and passing path as argument  
					boolean result;  
					try   
						{  
						result = file.createNewFile();  //creates a new file  
						if(result)      // test if successfully created a new file  
						{  
							System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
							//Now we have to add that file in List Of Available files.
							try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/ListOfAvailableFiles.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write(Filename);
								bw.close();
								System.out.println("File Added to List of available Files..Done");
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
					
						}  
						else  
						{  
							System.out.println("File already exist at location: "+file.getCanonicalPath());  
						}  
					}   
					catch (IOException e)   
					{  
						e.printStackTrace();    //prints exception if any  
					}         	
				}
				//n=obj.EditFile(1,1);
				break;
				case 6: System.exit(0);
				break;
				
			}
		}		
			
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

	}
	
}