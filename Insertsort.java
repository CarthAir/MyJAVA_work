//��������
class Insertsort
{
	public static void main(String[] args)
	{
		int[] arr={9,3,1,4,2,7,6,8,10,5};
		System.out.print("����ǰ\n");
		sop(arr);
		System.out.print("\n�����\n");
		Insertsort(arr);
		sop(arr);
	}
	public static void Insertsort(int[] arr)//������������㷨
	{
		for(int j=1;j<=arr.length-1;j++)
		{
			int key=arr[j];//���ƶ����ó���һ���ơ�
			int i=j-1;//����ԭ�����е��ơ�
			while(i>=0&&arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
	}
	public static void sop(int[] arr)//��ӡ����ĺ�����
	{
		System.out.print("[");
		for(int x=0;x<=arr.length-1;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]+"]");
		}
	}
}