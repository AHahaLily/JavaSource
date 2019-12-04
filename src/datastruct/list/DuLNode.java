package datastruct.list;

//双向链表节点
public class DuLNode {
	public Object data;
	public DuLNode prior;
	public DuLNode next;
	
	//初始化节点的数据域和指针域的值
	public DuLNode() {
		this.data=null;
		this.prior=null;
		this.next=null;
	}
	
	//设置节点的数据域值
	public DuLNode(Object data){
		this.data=data;
		this.prior=null;
		this.next=null;
	}
	
	//设置节点的数据域和指针域的值
	public DuLNode(DuLNode prior,Object x,DuLNode next){
		this.data=x;
		this.prior=prior;
		this.next=next;
	}

}
