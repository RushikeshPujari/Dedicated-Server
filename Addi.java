import java.rmi.Remote;
public interface Addi extends Remote
{
	public int add(int x,int y)throws Exception;
	public int div(int x,int y)throws Exception;
	public int mul(int x,int y)throws Exception;
	public int sub(int x,int y)throws Exception;
	//public int calender(int x,int y)throws Exception;
	public boolean ReadAvailableFile(int x,int y)throws Exception;
	public boolean ReadFile(int x,int y)throws Exception;
	public boolean EditFile(int x,int y)throws Exception;
	public boolean CreateFile(int x,int y)throws Exception;
	public boolean OpenLog(int x,int y)throws Exception;
	
}