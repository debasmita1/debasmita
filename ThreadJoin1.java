public class ThreadJoin1
{
   	public static void main(String args[]) 
	{
      		Thread t1 = new Thread(new ThreadJoin2(), "t1");
      		Thread t2 = new Thread(new ThreadJoin2(), "t2");
      		Thread t3 = new Thread(new ThreadJoin2(), "t3");
		 t1.start();
     		 t2.start();        
     		 t3.start();
   	}
}
 
class ThreadJoin2 implements Runnable
{
    	public void run()
	 {
    		Thread t = Thread.currentThread();
        		System.out.println("Thread started: "+t.getName());
        		try {
            			Thread.sleep(1000);
        		} catch (InterruptedException ie)
		 {
           			 ie.printStackTrace();
        		}
        		System.out.println("Thread ended: "+t.getName());    
    	}
}