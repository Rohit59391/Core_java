package core;

public class Static_Variables 
{
	    static String school = "ABC School"; // static variable
	    String name;

	    public Static_Variables(String name) {
	        this.name = name;
	    }

	    public void show() {
	        System.out.println(name + " studies in " + school);
	    }

	    public static void main(String[] args) {
	    	Static_Variables s1 = new Static_Variables("Rohit");
	    	Static_Variables s2 = new Static_Variables("Neha");

	        s1.show();
	        s2.show();

	        // Change static variable using class name
	        Static_Variables.school = "XYZ School";

	        s1.show();
	        s2.show();
	    }
	}



