/**
*����һ���й�������࣬����������Ĵ����Լ�һЩ��������������ķ�����
*@author Tease
*@version v1.0.0
*/
public class List
{
	Link head=new Link(4);
	Link curr=head;
	List(int n){
		for(int x=0;x<n;x++){
			curr.next=new Link(4);
			curr=curr.next;
		}
	}
	/**
	*չʾ��ǰ����Ԫ�ص�ֵ��
	*/
	void display(){
		curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	/**
	*׷��һ��Ԫ�صķ�����
	*@param d ׷�ӵ�Ԫ�ص���ֵ��
	*/
	void addNode(int d) {
        Link newLink = new Link(d);
        if (head == null) {
            head = newLink;
            return;
        }
        Link curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newLink;
    }

} 














