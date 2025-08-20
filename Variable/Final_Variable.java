package core;

public class Final_Variable 
{
	    final int MAX_VALUE = 100; // final variable (constant)

	    public void show() 
	    {
	        System.out.println("Final variable: " + MAX_VALUE);
	    }

	    public static void main(String[] args) 
	    {
	    	Final_Variable obj = new Final_Variable();
	        obj.show();
	    }
	}

