//this�ؼ���test����ǿ�����Ķ��ԡ�
//����Ա�����;ֲ�����������������this�ؼ��������֡�
//this��������ĸ����󣬵�ǰ����this�������ں���������������á���˵���ĸ����������this���ڵĺ���,this�ʹ����ĸ�������
class difBaby_dif
{
	public static void main(String[] args)
	{
		Person p1=new Person("haha");
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
	Person(String name)//���ӳ����������֡�
	{
		this.name=name;//this�ؼ��֣�������е�name��
		age=1;
	}
	void speak()
	{
		System.out.println(name+"..."+age);
	}
}