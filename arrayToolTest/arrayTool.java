/**
����һ�����ڲ�������Ĺ����࣬���а����˳����Ķ���������ķ�����
@author Carth
@version V1.0.0
*/
public class arrayTool
{
	private arrayTool(){};//��ֹ����Ĵ����Ա����ڴ�ռ���˷ѡ�
	/**
	�����������������
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	*/
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[y]<=arr[x])
					swap(arr,x,y);
			}
		}
	}
	private static void swap(int[] arr,int x,int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	/**
	��ȡԪ���������е�������
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@param key Ҫ�ҵ�Ԫ�ص��±ꡣ
	@return ���ظ�Ԫ�ص�һ�γ��ֵ��±꣬�������ڷ���-1��
	*/
	public static int Search(int[] arr,int key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==key)
				return x; 
		}
		return -1; 
	}
	/**
	��ȡ������������ֵ
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@return ������������Ԫ��ֵ��
	*/
	public static int getMax(int[] arr)
	{
		int arrMax=0;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[arrMax]<arr[x])
				arrMax=x;
		}
		return arr[arrMax];
	}
	/**
	��int����ת�����ַ�������ʽ�ǣ�[,,.....,,]
	@param arr ����һ��Ԫ��Ϊint���͵����顣
	@return ���ظ��ַ����ı�����ʽ��
	*/
	public static String ArrayToString(int[] arr)
	{
		String str1="[";
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				str1+=arr[x]+",";
			else
				str1+=arr[x]+"]";
		}
		return str1;
	}
}
