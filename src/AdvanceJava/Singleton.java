package AdvanceJava;

public class Singleton {
	
	//In OOP a singleton class is a class that have only one object(instance of class) at a time
	//How to design singleton class
	//1.Make constructor as private
	//2.write a public static method (getInstance) that has return type of object of this singleton class(lazy Initialization)
	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		str="This is a singleton class pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance==null)
		{
			singleton_instance=new Singleton();
		}
		
		return singleton_instance;
	}
	
	

	public static void main(String[] args) {
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
