/*

��������

*/
class PersonCode
{
	public static void main(String[] args)
	{
		//Person p1=new Person(12,"haha");
		//p1.show();
		Person.shao();
	}
}
class Person
{
	{
		//�������飺�����ж����ʼ����
		System.out.println("person show");
	}
	int age;
	String name;
	Person(int age,String name)//���캯��������Ӧ�����������Գ�ʼ����
	{
		this.age=age;
		this.name=name;
	}
	void show()
	{
		System.out.println(name+"..."+age);
	}
	static void shao()
	{
		System.out.println("Test");
	}
}

