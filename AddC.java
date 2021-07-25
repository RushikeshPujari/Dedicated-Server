import java.rmi.RemoteException;
import java.util.Calendar; 
import java.util.Scanner; 
import java.io.*; 
import java.awt.Desktop;  
import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.rmi.server.UnicastRemoteObject;
public class AddC extends UnicastRemoteObject implements Addi
{
	protected AddC()throws RemoteException
	{
		super();
	}
	public int add(int x,int y)throws Exception
	{	
		System.out.println("Addition Performed.");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("Addition Performed.");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return x+y;
	}
	public int div(int x,int y)throws Exception
	{
		System.out.println("Division Performed.");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("Division Performed.");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return x/y;
	}
	public int mul(int x,int y)throws Exception
	{
		System.out.println("Multiplication Performed.");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("Multiplication Performed.");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return x*y;
	}
	public int sub(int x,int y)throws Exception
	{
		System.out.println("Substraction Performed.");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("Substraction Performed.");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return x-y;
	}
	public boolean OpenLog(int x, int y)throws Exception
	{
		return true;
	}
	public boolean ReadAvailableFile(int x,int y)throws Exception
	{
		System.out.println("User List of Available File");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("User List of Available File");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return true;
	}
	public boolean ReadFile(int x,int y)throws Exception
	{
		System.out.println("User Reading a File");
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("User Reading a File");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return true;
		
	}
	public boolean EditFile(int x,int y)throws Exception
	{
		System.out.println("User Editing a File"); 
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("User Editing a File");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}
		return true;
	}
	public boolean CreateFile(int x,int y)throws Exception
	{
		System.out.println("User creating File");	
		try{
								File f1 = new File("C:/Users/SHRI 1/Desktop/mini102/Logs.txt");
								FileWriter fileWritter = new FileWriter(f1.getName(),true);
								BufferedWriter bw = new BufferedWriter(fileWritter);
								bw.write("\n");
								bw.write("User creating File");
								bw.close();
								
							}
							catch(IOException e)
							{
								e.printStackTrace();
							}	
		return true;
	}
	
}
