/*
	��������ϰ��
	��Աʾ��
		���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
		��Ŀ������������������ţ�нˮ���н��𣬹������ݡ�
		�Ը��������ݽ������ݽ�ģ��
*/

//������Ա
abstract class Employee
{
	private String name;
	private String ID;
	private double pay;
	Employee(String name,String ID,double pay)
	{
		this.name=name;
		this.ID=ID;
		this.pay=pay;
	}
	public abstract void work();
}
//��������Ա
class Programmer extends Employee
{
	Programmer(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("code...");
	}
}
//��������
class Manager extends Employee
{
	private int bonus;
	Manager(String name,String ID,double pay)
	{
		super(name,ID,pay);
	}
	public void work()
	{
		System.out.println("manager");
	}
}
class abstract_test
{
	public static void main(String[] args)
	{
		
	}
}


















