class ExceptionTest2
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		int t=method(null,-11);
		System.out.println(t);
	}
	public static int method(int[] arr,int index)
	{
		if(index>=arr.length)
			throw new ArrayIndexOutOfBoundsException("Խ���˴�ɭ:"+index);
		if(index<0)
			throw new ArrayIndexOutOfBoundsException("��ɭ�Ǳ��ɸ�����:"+index);
		if(arr==null)
			throw new NullPointerException("�㴫�˸�ɶ?�յ�?");
		return arr[index];
	}
}
