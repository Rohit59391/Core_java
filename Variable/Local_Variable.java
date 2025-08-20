package core;

public class Local_Variable 
{
	public void display() {
        int x = 10; // local variable
        System.out.println("Local variable: " + x);
    }

    public static void main(String[] args) {
    	Local_Variable obj = new Local_Variable();
        obj.display();
    }
	
}
