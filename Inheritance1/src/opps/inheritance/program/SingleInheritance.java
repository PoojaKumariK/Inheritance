package opps.inheritance.program;
class Animal
{
	void eating() {
	System.out.println("animal is eating.....");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("dog is barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.eating();
		d1.bark();

	}

}
