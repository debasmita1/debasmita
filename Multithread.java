// Java program using Thread

class Multithreading extends Thread
{
    public void run()
    {
        try
        {
            System.out.println ("Thread " +Thread.currentThread().getId() + " is running");
 
        }
        catch (Exception e)
        {
            System.out.println ("Exception occured!!!");
        }
    }
}
 
public class Multithread
{
    public static void main(String args[])
    {
        int n = 10; 
        for (int i=0; i<10; i++)
        {
            Multithreading m = new Multithreading();
            m.start();
        }
    }
}