class MainTest
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for(int x=0;x<args.length;x++)
			System.out.println(args[x]);//[Ljava.lang.String;@15db9742
	}
}
/*
��ʽ�̶���Ϊjvmʶ��͵��á�

public:Ȩ�ޱ��������ġ�
static:����Ҫ����
void:������û�о��巵��ֵ��
main:���ǹؼ��֣�ֻ��jvmʶ��̶������֡�
String[] args:�������Ĳ������б���һ���������͵Ĳ���������Ԫ�ض����ַ������͡�
*/


