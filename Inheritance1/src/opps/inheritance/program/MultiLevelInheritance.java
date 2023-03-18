package opps.inheritance.program;
class AnimalDemo{
	void eat()
	{
		System.out.println("eating..");
	}
}
class DogA extends AnimalDemo
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class Babydog extends DogA
{
	void weep()
	{
		System.out.println("weaping..");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog s1 = new Babydog();
		s1.bark();
		s1.eat();
		s1.weep();

	}

}
