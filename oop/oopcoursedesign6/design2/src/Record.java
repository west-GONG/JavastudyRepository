
public class Record {
	//收支数据结构，链表
	private static Node head = null;
	//头节点，静态变量，只有一条链表

    private static int Nonum=0;
	//记录节点个数

    private static double allMoney=0;
	//记录总金额

	public static int getNonum() {
		return Nonum;
	}//返回节点个数

	public static double getAllMoney() {
		return allMoney;
	}//返回总金额

	private class Node {
		Node next = null;       //指针
		int num;                //编号
		double money;          //收支金额，正收负支
		String date;           //日期
		String info;           //说明信息
		public Node(double m,String d,String i) {//构造方法
			money=m;
			date=d;
			info=i;
			next=null;
		}
	}

    public static void addNode(double m,String d,String i) {
    	Nonum++;
    	allMoney+=m;
    	Record r = new Record();
		Node newNode = r.new Node(m,d,i);
		//实例化一个节点
        if (head == null) {
        	newNode.num=1;
            head = newNode;
           //信息存入头结点
        }
        else{
        	Node tmp = head;
			//链表不为空，定义一个tmp代替head
        	while (tmp.next != null) {
        	     tmp = tmp.next;
        	}
        	newNode.num=tmp.num+1;
        	tmp.next = newNode;
        }
    }

    public static void printList(int[] num,double[] money,String[] date,String[] info) {//遍历节点，数组
        Node tmp = head;
        int i=0;
        while (tmp != null) {
            num[i]=tmp.num;
            money[i]=tmp.money;
            date[i]=tmp.date;
            info[i]=tmp.info;
            i++;
        	tmp = tmp.next;
        }
    }

    public static boolean delectNode(int num) {//删除节点，成功true，不成功为false
		if (head==null){
			return false;
		}//防止抛出空异常
    	if(num<1) {
			return false;
		}
    	if(head.num==num) {
    		allMoney-=head.money;
    		head=head.next;
    		Nonum--;
    		return true;
    	}
    	Node n = head;
    	while(n.next!=null) {	
    		if(n.next.num==num) {
    			allMoney-=n.next.money;
    			n.next=n.next.next;
    			Nonum--;
    			return true;
    		} else if(n.next.num>num){
				return false;
			} else {
				n=n.next;
			}
    	}
    	return false;
    }

	public static boolean setNode(int num,double newMoney,int ch){//ch为选择修改为支出还是收入,1为支出，2为收入
		if (head==null){
			return false;
		}
		if(num<1) {
			return false;
		}
		if (head.num==num){
			if (ch==1){
				allMoney -=head.money;
				head.money = -newMoney;
				allMoney += head.money;
			}else if (ch==2){
				allMoney -=head.money;
				head.money = newMoney;
				allMoney += head.money;
			}
			return true;
		}
		Node n=head;
		while(n.next!=null){
			if(n.next.num==num) {
				if(ch==1){
					allMoney-=n.next.money;
					n.next.money = -newMoney;
					allMoney += n.next.money;
				}else if (ch == 2){
					allMoney-=n.next.money;
					n.next.money = newMoney;
					allMoney += n.next.money;
				}
				return true;
			} else if (n.next.num > num) {
				return false;
			}else {
				n=n.next;
			}
		}
		return false;
	}

	public static boolean setNode(int num,String newIfo){//setNode方法重载，修改信息
		if (head == null){
			return false;
		}
		if(num<1) {
			return false;
		}
		if (head.num==num){
			head.info=newIfo;
			return true;
		}
		Node n=head;
		while(n.next!=null){
			if(n.next.num==num) {
				n.next.info = newIfo;
				return true;
			} else if (n.next.num > num) {
				return false;
			}else {
				n=n.next;
			}
		}
		return false;
	}
}
