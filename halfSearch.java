//ʹ�ö��ֲ����ҳ�ĳһ����
//��������һ�����в��ң�����Ҫʹ������
//Ϊ�����Ķ�����ߴ��븴���ԣ������ֲ��ҵ��������һ������
class halfSearch
{
	public static void main(String[] args)
	{
		System.out.print("ʹ�ö��ַ�����������ĳ����\n");
		int[] arr={0,1,2,3,434,555,666,7786};//�����һ������
		int Index=halfSearch(arr,555);
		System.out.print("Index="+Index);
	}
	public static int halfSearch(int[] arr,int key)
	{
		//���ֲ�����Ҫ���������������ߵ������м����
		int max,min,mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			if(max<min)
				return -1;
			mid=(max+min)/2;
		}
		return mid;
	}
}
/*���鳣�����ܣ����ֲ��ҡ�*/


