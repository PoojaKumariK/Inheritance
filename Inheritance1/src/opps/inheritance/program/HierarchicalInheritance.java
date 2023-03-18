package opps.inheritance.program;
class AnimalB
{
	void eat()
	{
		System.out.println("eating..");
	}
}
class DogC extends AnimalB
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class cat extends AnimalB
{
	void meow()
	{
		System.out.println("meowing..");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c1 = new cat();
		c1.eat();
	
		c1.meow();
        DogC cd = new DogC();
        cd.bark();
        cd.eat();

	}

}
