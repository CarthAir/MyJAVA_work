/*
	Object�ࣺ������ĸ��ࡣ
	Object�ࣺ���ϳ�ȡ�õ��ģ��������ж���Ĺ������ݡ�
*/
class Person//extends Object
{
	String name;
	Person(String name)
	{
		super();
		this.name=name;
	}
	public boolean equals(Object p)
	{
		if(!(p instanceof Person))
		{
			throw new ClassCastException("���ʹ���!");
		}	
		Person P=(Person)p;
		return this.name==P.name;
	}
}
class ObjectTest1
{
	public static void main(String[] args)
	{
		Person p1=new Person("John");
		Person p2=new Person("John");
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1);
	}
}
class Demo
{}
