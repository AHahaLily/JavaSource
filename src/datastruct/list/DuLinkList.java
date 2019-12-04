package datastruct.list;

import java.util.Scanner;

//双向链表
public class DuLinkList implements IList{
	public DuLNode head;
	
	//初始化一个只有头结点的双向链表
	public DuLinkList(){
		head=new DuLNode();
	}
	
	//创建长度为n的双向链表
	public DuLinkList(int n,boolean Order) throws Exception{
		//调用无参构造函数
		this();
		if(Order){
			create1(n);
		}else{
			create2(n);
		}
	}
	
	//前插法
	public void create1(int n) throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			insert(0,sc.next());
		}
		sc.close();
	}
	
	//后插法
	public void create2(int n) throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			insert(length()-1,sc.next());
		}
		sc.close();
	}
	
	//在双向链表的第i个位置插入元素x
	public void insert(int i,Object x)throws Exception{
		DuLNode p=head;
		int j=-1;
		//寻找插入位置i
		while(p!=null&&j<i-1){
			p=p.next;
			j++;
		}
		//未找到插入位置
		if(j>i-1||p==null){
			throw new Exception("没有找到位置i");
		}
		DuLNode s=new DuLNode(x);
		s.next=p.next;
		s.prior=p;
		p.next=s;
	}
	
	//清空双向表
	public void clear(){
		head.next=null;
	}
	
	//判断表是否为空
	public boolean isEmpty(){
		return head.next==null;
	}
	
	//输出表长度
	public int length(){
		DuLNode p=head;
		int length=0;
		while(p!=null){
			p=p.next; 
			length++;
		}
		return length;
	}
	
	//获取第i个元素
	public Object get(int i){
		DuLNode p=head;
		int j=0;
		while(p!=null&j<i){
			p=p.next;
			j++;
		}
		if(p==null||j>i){
			return -1;
		}
		return p.data;
	}
	
	//移除第i个元素
	public void remove(int i)throws Exception{
		DuLNode p=head;
		int j=-1;
		while(p!=null&&j<i){
			p=p.next;
			j++;
		}
		//位置i不存在
		if(j>i||p==null){
			throw new Exception("位置i不存在");
		}
		p.prior.next=p.next;
		p.next.prior=p.prior;
	}
	
	//获取元素x的索引
	public int indexOf(Object x){
		DuLNode p=head;
		int j=-1;
		while(p!=null&&!p.data.equals(x)){
			p=p.next;
			j++;
		}
		return j;
	}
	
	//打印双向链表
	public void display(){
		DuLNode p=head.next;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}

	}
	
	public static void main(String args[]) throws Exception{
		DuLinkList L=new DuLinkList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		L.create2(n);
		L.display();
		sc.close();
	}
}
