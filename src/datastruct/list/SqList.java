package datastruct.list;

//顺序表
public class SqList implements IList {
	private Object[] listItem;
	private int curLen;
	private int maxSize;
	
	//创建长度为maxSize的顺序表
	public SqList(int maxsize){
		curLen=0;
		maxSize=maxsize;
		listItem=new Object[maxSize];
	}
	
	//清空顺序表
	public void clear(){
		curLen=0;
	}
	
	//判断线性表是否为空，为空则返回true，否则返回false
	public boolean isEmpty(){
		return curLen==0;
	}
	
	//返回线性表的长度
	public int length(){
		return curLen;
	}
	
	//获取线性表的第i个元素值
	public Object get(int i)throws Exception{
		if(i<0||i>curLen-1)
			throw new Exception("位置"+i+"不存在");
		return listItem[i];
	}
	
	//在线性表中插入值
	public void insert(int i,Object x)throws Exception{
		if(curLen==maxSize)throw new Exception("˳�������");
		if(i<0||i>curLen)throw new Exception("����λ�÷Ƿ�");
		for(int j=curLen;j>i;j--){
			listItem[j]=listItem[j-1];
		}
		listItem[i]=x;
		curLen++;
	}
	
	//删除线性表中的值
	public void remove(int i) throws Exception{
		if(i<0||i>curLen-1)throw new Exception("ɾ��λ�÷Ƿ�");
		for(int j=i;j<curLen;j++){
			listItem[j]=listItem[j+1];
		}
		curLen--;
	}
	
	//求值为x的元素在线性表中的位置
	public int indexOf(Object x){
		for(int i=0;i<curLen;i++){
			if(listItem[i].equals(x)){
				return i;
			}
		}
		return -1;
	}
	
	//打印线性表
	public void display(){
		for(int i=0;i<curLen;i++){
			System.out.println(listItem[i]);
		}
	}
	
	public static void main(String args[]) throws Exception{
		SqList L=new SqList(26);
		for(int i=0;i<26;i++){
			L.insert(i,'a'+i);
		}
		
		L.display();
		
		System.out.println(L.get(10));
		System.out.println(L.indexOf(102));
	}
}
