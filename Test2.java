import java.util.Scanner;

class  Test2                           
{
	public static void main(String args[]) 
	{
		int num;						 
		Stack m=new Stack();          
		
		Scanner s = new Scanner(System.in);    

		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for push a numer");
			System.out.println("Enter 2 for pop a number");
			System.out.println("Enter 3 to display");
			System.out.println("Enter 4 to exit");
			num = s.nextInt();							
			switch(num)
			{
			case 1: System.out.println("Enter your element which you want to push");
					m.push(s.nextInt());                   
					break;

			case 2: System.out.println("Element  you want to pop is "+m.pop() ); 
					break;

			case 3: System.out.println("Stack is :");
					m.display();
					break;
			default: System.out.println("Exited successfully!!!"); 
					return ;

			}
		
		}
		
	}
}
class Stack
{
	int arr[]=new int[10];
	int top;
	Stack()
	{
		top = -1;      
	}

public void push(int num)  
	{
	if(top==1000)                      
		{
		System.out.println("Stack overflow");
		return;
		}
		else
		{
		 arr[++top] = num;
		}
	}
	public int pop()	
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return arr[top--];
	}
	public boolean stackisempty() 
	{
		if (top == -1)
			return true;
		else 
			return false;
	}
	public void display()	
	{
		int temp=0;
		
		if(!stackisempty())
		{
			temp = pop();
			System.out.println(temp);
			display();
		}
		push(temp);
	}


}