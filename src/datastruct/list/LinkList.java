package datastruct.list;

import java.util.Scanner;

//单链表
public class LinkList implements IList {
	public Node head;		//创建单链表头结点
	
	//初始化单链表
	public LinkList(){
		head=new Node();
	}
	
	//创建长度为n的单链表
	public LinkList(int n,boolean Order) throws Exception{
		this();
		if(Order){
			create1(n);
		}else{
			create2(n);
		}
	}
	
	//��ͷ�巨˳����������
	public void create1(int n) throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			insert(0,sc.next());
		}
		sc.close();
	}
	
	//��β�巨˳����������
	public void create2(int n)throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			insert(length()-1,sc.next());
		}
		sc.close();
	}
	
	//�������ÿ�
	public void clear(){
		head.data=null;
		head.next=null;
	}
	
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return head.next==null;
	}
	
	//����������
	public int length(){
		Node p=head;
		int length=0;
		while(p!=null){
			p=p.next;
			length++;
		}
		return length;
	}
	
	//��ȡ�����صڸ�Ԫ�ص�ֵ
	public Object get(int i)throws Exception{
		Node p=head;
		int j=0;
		while(p!=null&&j<i){
			p=p.next;
			j++;
		}
		if(j>i||p==null){
			throw new Exception("��"+i+"������Ԫ�ز�����");
		}
		return p.data;
	}
	
	//����x��Ϊ��i��Ԫ��
	public void insert(int i,Object x)throws Exception{
		Node p=head;
		int j=-1;
		while(p!=null&&j<i-1){
			p=p.next;
			j++;
		}
		if(j>i-1||p==null)throw new Exception("����λ�ò��Ϸ�");
		Node s=new Node(x);
		s.next=p.next;
		p.next=s;
	}
	
	//ɾ����i��Ԫ��
	public void remove(int i) throws Exception{
		Node p=head;
		int j=-1;
		while(p!=null&&j<i-1){
			p=p.next;
			j++;
		}
		if(j>i-1||p.next==null){
			throw new Exception("ɾ��λ�ò��Ϸ�");
		}
		p.next=p.next.next;
	}
	
	//����Ԫ��x�״γ��ֵ�λ���
	public int indexOf(Object x){
		Node p=head.next;
		int j=0;
		while(p!=null&&!p.data.equals(x)){
			j++;
		}
		if(p==null){
			return -1;
		}else{
			return j;
		}
	}
	
	public void display(){
		Node p=head.next;
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}
	}
	
	public static void main(String args[]) throws Exception{
		LinkList L=new LinkList();
		L.create1(4);
		L.display();
		L.create2(4);
		L.display();
	}
}
