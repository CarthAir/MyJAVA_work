class difBaby
{
	public static void main(String[] args)
	{
		Person p1=new Person("��ɭ");
		Person p2=new Person();
		p1.speak();
		p2.speak();
	}
}
class Person
{
	int age;
	String name;
	Person()//���ӳ���û�����֡�
	{
		name="baby";
		age=1;
	}
	Person(String name1)//���ӳ����������֡�
	{
		name=name1;
		age=1;
	}
	void speak()
	{
		System.out.println(name+"..."+age);
	}
}