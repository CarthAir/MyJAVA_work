class encapsulationDemo
{
	public static void main(String[] args)
	{
		person John=new person();
		John.setAge(-10);
		John.speak();
	}
}
class person
{
	private int age;//��߰�ȫ�ԣ���Ҫ�ԣ����仯���룬������ʹ�á�
	public void setAge(int a)
	{
		if(a>0&&a<120)
			age=a;
		else
			System.out.println("�������ֵ");
	}
	public int getAge()//ʹ��ʱ�ŵ��á�
	{
		return age;
	}
	void speak()
	{
		System.out.println("age..."+age);
	}
}
//private�����������Ա�����ε�ֻ���ڱ�����ʹ�á�