public class ThreadJoin2
 {
   	public static void main(String args[] ) 
	{
      		Thread t1 = new Thread(new Test(), "t1");
      		Thread t2 = new Thread(new Test(), "t2");
     		 Thread t3 = new Thread(new Test(), "t3");
      		t1.start();
      		try 
		{
         			 t1.join();
     		 } catch (InterruptedException ie) 
		{
         			 ie.printStackTrace();
        		}
     		 t2.start();
      		try 
		{
          			t2.join();
     		 } catch (InterruptedException ie)
		 {
          			 ie.printStackTrace();
       		 }
     		 t3.start();
     		 try 
		{
         			 t3.join();
      		} catch (InterruptedException ie) 
		{
            			ie.printStackTrace();
        		}  
      		System.out.println("All threads have finished execution");
   	}
}
 
class Test implements Runnable
{
	    public void run()
	   {
    	    Thread t = Thread.currentThread();
        	     System.out.println("Thread started: "+t.getName());
        	    try 
	   {
            		Thread.sleep(1000);
        	} catch (InterruptedException ie)
	 {
           		 ie.printStackTrace();
        	}
        	System.out.println("Thread ended: "+t.getName());
        
    	}
}