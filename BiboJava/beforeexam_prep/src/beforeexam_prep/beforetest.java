package beforeexam_prep;

interface Pet{
	void play();
}

abstract class Animal{
	int age;
	Animal(int age){
		this.age=age;
	}
	abstract void makeSound();
	
	void info() {
		System.out.println(this.age);
		}
}

class Dogs extends Animal implements Pet{
	Dogs(int age) {
		super(age);
	}
	public void makeSound() {
		System.out.println("Woof");
	}
	public void play() {
		System.out.println("Doggo is playing");
	}
	public void bark() {
		System.out.println("BARKK");
	}
}

class Cat extends Animal{
	Cat(int age){
		super(age);
	}
	public void makeSound() {
		System.out.println("Meow");
	}
}

public class beforetest {

	public static void main(String[]args) {
		
		Animal[] zoo=new Animal[3];
		zoo[0]=new Dogs(3);
		zoo[1]=new Dogs(15);
		zoo[2]=new Cat(10);
		for(int i=0;i<zoo.length;i++) {
			zoo[i].makeSound();
		}
		((Dogs)zoo[0]).bark();
		
	}
	
}
