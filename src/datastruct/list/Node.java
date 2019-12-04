package datastruct.list;

//单链表节点
public class Node {
	public Object data;
	public Node next;
	
	//初始化单链表
	public Node(){

	}
	
	//初始化单链表的数据域
	public Node(Object data){
		this.data=data;
	}
	
	//初始化单链表的数据域和指针域
	public Node(Object data,Node next){
		this.data=data;
		this.next=next;
	}
}
