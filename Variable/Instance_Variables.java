package core;

public class Instance_Variables {

	int age = 20; // instance variable

    public static void main(String[] args)
    {
        Instance_Variables obj1 = new Instance_Variables();
        Instance_Variables obj2 = new Instance_Variables();

        obj2.age = 30; // each object has its own copy

        System.out.println("Obj1 age: " + obj1.age); 
        System.out.println("Obj2 age: " + obj2.age);
    }
}
