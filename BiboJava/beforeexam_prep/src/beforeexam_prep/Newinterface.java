package beforeexam_prep;

interface AnimalsAction{
	int king=1;
	default void sleep() {
		System.out.println("zzz... zzz..");
	}
	void eat();
}

class Dog implements AnimalsAction{
	public void eat(){
		System.out.println("the dog is eating");
	}
	void run() {
		System.out.println("Dog is running");
	}
}


public class Newinterface {


	public static void main(String[]args) {
		AnimalsAction animal=new Dog();
		
		animal.sleep();
		animal.eat();
		((Dog)animal).run();
	}
}
