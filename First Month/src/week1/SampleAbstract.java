package week1;
//Abstract Class and Abstract Methods

abstract class Animal {
	

	 public void run() {
		System.out.println("Animal is running");
	}
	 //non abstract class with return type and parameters
	 
	 public int returning(int a) {
			return a;
		}

	abstract public int eat();//abstract class must not have body
	                          //but can have return type
}

class Dog extends Animal {

	public int eat() {
		System.out.println("Dog is eating");
		return 0;        //It is mandatory to override the abstract method in child class.
	}
	public void run() {
		super.run();
		System.out.println("Animal is running reference");}
		public void run1() {
			System.out.println("Animal is running reference");
		
	}
}
public class SampleAbstract {

	public static void main(String[] args) {

//		new Animal();    error. Cannot create objects of abstract class.
		Dog animal1 = new Dog();
		Animal one=new Dog();
		animal1.run();
		animal1.eat();
		animal1.run();
		System.out.println(animal1.returning(5));
	}
}

/*
       1. abstract class:
            You cannot create object of abstract class
            It may or may not contain abstract methods
       2. abstract method:
            No method body. You cannot write code in abstract method.
            It is mandatory to override the abstract method in child class.
*/