class person
{
	private int age;//˽�л�ֻ�ڸ����п����á�
	private double length;
	public void compose(int g,double l)
	{
		age=g;//��Ҫ���µĵط�ʹ�þ�Ҫ������һ���±������и�ֵ��
		length=l;
		if(g>=0&&g<=130&&l>0&&l<3)
		{
			System.out.print("Tne man's age is "+g+",and his length is "+l+" metres.\n");
		}
		else
		{
			System.out.print("���������");
		}
	}
	public void compose()
	{
		System.out.print("Tne man's age is "+age+",and his length is "+length+" metres.");
	}
}
class personcomposing
{
	public static void main(String[] args)
	{
		person ming=new person();
		ming.compose(-12,1.2);
	}
}