class duotaiTest4
{
	public static void main(String[] args)
	{
		Animal d=new Dog();
		method(d);
		Animal c=new Cat();
		method(c);
	}
	public static void method(Animal a)
	{
		a.eat();
		if(a instanceof Dog)//instanceof�����ж϶���ľ������ͣ�����ת��
		{
			Dog c=(Dog)a;
			c.lookdoor();
		}
		if(a instanceof Cat)
		{
			Cat c=(Cat)a;
			c.catchMouse();
		}
	}
}
abstract class Animal
{
	abstract void eat();
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog...meat");
	}
	void lookdoor()
	{
		System.out.println("look door");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("cat...fish");
	}
	void catchMouse()
	{
		System.out.println("catch Mouse");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

