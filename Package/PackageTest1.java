package mypack;
//import packa.DemoA;//�������õġ�
import packa.*;//����packa�����е��ࡣ
class PackageTest1
{
	public static void main(String[] args)
	{
		DemoA a=new DemoA();
		a.show();
		System.out.println("PackageTest1");
	}
}
/*
	PackageTest1.java:6: ����: �Ҳ�������
                DemoA a=new DemoA();
                ^
  ����:   �� DemoA
  λ��: �� PackageTest1
PackageTest1.java:6: ����: �Ҳ�������
                DemoA a=new DemoA();
                            ^
  ����:   �� DemoA
  λ��: �� PackageTest1
2 ������

����д��
������ȷ���������ȷ�����ǰ���.����



*/