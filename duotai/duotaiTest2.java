abstract class Animal
{
	abstract void Eat();
}
class Dog extends Animal
{
	void Eat()
	{
		System.out.println("dog...meat");
	}
	void lookhome()
	{
		System.out.println("����");
	}
}
class Cat extends Animal
{
	void Eat()
	{
		System.out.println("cat...fish");
	}
	void playMouse()
	{
		System.out.println("������");
	}
}
class rabbit extends Animal
{
	void Eat()
	{
		System.out.println("rabbit...carrots");
	}
	void jump()
	{
		System.out.println("��һ��");
	}
}
class duotaiTest2
{
	public static void main(String[] args)
	{
		Animal c=new Cat();//�Զ���������������ת�ͣ�,�������й����޷����ʡ����ã��������й��ܵ�ʹ�á�
		c.Eat();
		//������������й��ܣ���������ת�͡�
		Cat d=(Cat)c;
		d.playMouse();

	}
	public static void method(Animal a)
	{
		a.Eat();
	}
}
/*
	��̬�ĺô���
		����˴������չ�ԡ�
		ǰ�ڴ������ʹ�ú������ݡ�

	��̬��ǰ�᣺
		1�������й�ϵ���̳У�ʵ��
		2�������и���

*/










