//��� pdf ���α׷���2��
class Person
{
	protected String name;  //����� ���ο� �Ѷ� �ܺ��� �ٸ� Ŭ�����鿡�Դ� ������ 
	protected String addr;   //���ϰ� ������ �ڽ� Ŭ�������Դ� ������ �� �ֵ��� 
	protected String tel;		//������Ƽ���! 

	//������
	public Person( String name, String addr,String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public Person(){
		
	}

	//������
	public void setName(String name){
		this.name = name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public void setTel(String tel){
		this.tel = tel;
	}

	//������
	public String getName(){
		return name;
	}
	public String getAddr(){
		return addr;
	}
	public String getTel(){
		return tel;
	}
	//����Ʈ��
	public String toString(){
		return name+","+addr+","+tel;
	}
}
class Customer extends Person   //person�� ���. Ŀ����Ӵ� �޽��̴�.
{
	private int no;
	private int point;
	
	//������: �θ��� �����̺��� ���� �� ����. �θ��� �Ӽ��� ������Ƽ�忩�� ���ٰ���.
	public Customer( String name, String addr, String tel, int no, int point){
		/*this.name = name;
		this.addr = addr;
		this.tel = tel;  �̷��� �ص� ��*/ 
		super(name,addr,tel); //�θ��� �����ڿ��� �ʱ�ȭ���� ������ �ְ� ������ ����!
		this.no = no;
		this.point = point;
	}
	public Customer(){
		//super();  �����ص� ��.
	}


	//������
	public void setNo( int no){
		this.no = no;
	}
	public void setPoint( int point){
		this.point = point;
	}
	//������
	public int getNo(){
		return no;
	}
	public int getPoint(){
		return point;
	}
	//����Ʈ��
	public String toString(){
		return super.toString()+","+no+","+point;
		//�θ��ִ� �� ��Ʈ���� �ҷ���.
	}
	
}

class  CustomerTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("ȫ�浿","����","010-111-1111");
		Customer c1 = new Customer("�̼���","����","010-777-7777", 1000, 10000);
		System.out.println(p1);
		System.out.println(c1);
	}
}