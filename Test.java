public class Test
{  
    public static void main(String args[]) 
    {
        try 
        {
           show();  
            System.out.print("A");  
        } 
        catch (RuntimeException ex)
        { 
            System.out.print("B"); 
        } 
        catch (Exception ex1) 
        { 
            System.out.print("C"); 
        } 
        finally 
        {
            System.out.print("D"); 
        } 
        System.out.print("E"); 
    } 
    public static void show() 
    { 
        throw new RuntimeException(); 
    } 
}