/*12��13�� �ݿ��� ���� 1

1) ���� �ִ� ���� ��ǰ�߿� �ϳ��� �����Ͽ� �Ӽ��� ������ �м��Ͽ� 
	Ŭ������ ����� ��ü�� �����Ͽ� ���� �� ���ϴ�.(*)

*/
class Micro{
	private String button; //���ڷ��� ��ư
	private String door; // ���ڷ����� �� 
	private String round; //���ڷ����� ȸ����?
	
	public void state(){
		System.out.println("���ڷ����� ");
		System.out.println("��ư�� " + button);
		System.out.println("���� " + door);
		System.out.println("ȸ������ " + round);
	}

	//������
	
	public Micro( String button, String door, String round){
		this.button = button;
		this.door = door;
		this.round = round;
		
	}

	//������ 

	public void setButton( String button ){
		this.button = button;
	}
	public void setDoor( String door){
		this.door = door;
	}
	public void setRound( String round){
		this.round = round;
	}


	//������

	public String getButton(){
		return button;
	}
	public String getDoor(){
		return door;
	}
	public String getRound(){
		return round;
	}

}

class  MicroWave
{
	public static void main(String[] args) 
	{
		Micro m1 = new Micro("������","�ݴ´�","���ư���");
		m1.state();
		System.out.println();
		Micro m2 = new Micro("����","����","�����");
		m2.state();
		
		
		
	}
}
