 //pdf�����ڿ��� ���α׷��� 2�� ���� 

 class Plane
 {
	private String company;
	private String model;
	private int seats;
	
	public static int planes;   //���ݱ��� ������ ������� ������ ��Ÿ���� �������� �߰�

	public static int getPlanes(){ //��������planes�� ���� ��ȯ�ϴ� ���� �޼ҵ� �߰�  
		return planes;
	}

	//������	
	public Plane(){
		planes++;
	}
	public Plane(String company, String model, int seats ){
		this.company = company;
		this. model = model;
		this.seats = seats;
		planes++;
	}
	

	//������
	public void setCompany(String company){
		this.company = company;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setSeats(int seats){
		this.seats = seats;
	}
	//������
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public int getSeats(){
		return seats;
	}
	
	public String toString(){
		return"���ۻ�:"+company+",��:"+model+",�ִ�°���:"+seats+"";
	}
	
 }


class  PlaneTest
{
	public static void main(String[] args) 
	{
		System.out.println("����� ���:" + Plane.getPlanes()); //0 ���
		
		Plane p1 = new Plane();
		Plane p2 = new Plane("�������","A380",500);
		
		System.out.println("����� ���:" + Plane.getPlanes()); //2 ���
		System.out.println("Ŭ��������� ��ü�� ���ؼ��� ������ �� �־��");
		System.out.println("p1�� ���ؼ� Ȯ��:" + p1.getPlanes());
		System.out.println("p2�� ���ؼ� Ȯ��:" + p2.getPlanes());
	
		System.out.println(p1.getCompany());	//null
		System.out.println(p1.getModel());		//null
		System.out.println(p1.getSeats());			//0  ��µ�.
		
		p1.setCompany("����");
		p1.setModel("����747");
		p1.setSeats(200);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}