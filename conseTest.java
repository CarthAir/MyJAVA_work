class Conse
{
	public static void main(String[] args)
	{
		Person p=new Person("John");
		p.speak();
	}						 
}
class Person
{
	private String name;
	private int age;
	void speak()
	{
		System.out.println(name+":"+age);
	}
	Person()
	{
		name="baby";
		age=1;
		System.out.println("person is live");
	}
	Person(String n)
	{
		System.out.println("person is live");
		name=n;
	}
}
//���캯���������������ʱ���õĺ��������ã���������г�ʼ����
//�������󶼱���Ҫͨ�����캯����ʼ����һ��������û�ж��幹�캯������ô�������һ��Ĭ�ϵĿղ������캯�����������ˣ���û���ˡ�
//�������������󴴽�ʱ�ر����ã�ֻ�ܵ���һ�Ρ�
//һ�㺯�������󴴽�����Ҫ���òŵ��ã��ɵ��ö�Ρ�
//ʲôʱ���幹�캯��������������ʱ���������Ѵ��ھ;߱������ݣ���Щ���ݶ������ڹ��캯���С�
