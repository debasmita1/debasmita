 
import java.util.ArrayList;
import java.util.List;
 
public class ThreadJoin 
 {
    	public static List<String> names = new ArrayList<String>(); 
    	public static void main(String args[])
	{
        		List<Sample> list = new ArrayList<Sample>();
        		for(int i=0;i<5;i++)
		{
            			Sample s = new Sample();
           			 list.add(s);
           			 s.start();
        		}
        		for(Sample st:list)
		{
           		 try{
                			st.join();
            		} catch (Exception ex){}
       	 }
        	System.out.println(names);
    	}
}
 
class Sample extends Thread
   {  
    	public void run()
	{
       		 for(int i=0; i<10; i++)
		{
            			try{
                			Thread.sleep(10);
           		 } catch(Exception ex){}
       	 }
     	ThreadJoin.names.add(getName());
   	 }
}