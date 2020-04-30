 //pdf생성자연습 프로그래밍 2번 문제 

 class Plane
 {
	private String company;
	private String model;
	private int seats;
	
	public static int planes;   //지금까지 생성된 비행기의 개수를 나타내는 정적변수 추가

	public static int getPlanes(){ //정적변수planes의 값을 반환하는 정적 메소드 추가  
		return planes;
	}

	//생성자	
	public Plane(){
		planes++;
	}
	public Plane(String company, String model, int seats ){
		this.company = company;
		this. model = model;
		this.seats = seats;
		planes++;
	}
	

	//설정자
	public void setCompany(String company){
		this.company = company;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setSeats(int seats){
		this.seats = seats;
	}
	//접근자
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
		return"제작사:"+company+",모델:"+model+",최대승객수:"+seats+"";
	}
	
 }


class  PlaneTest
{
	public static void main(String[] args) 
	{
		System.out.println("비행기 대수:" + Plane.getPlanes()); //0 출력
		
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스","A380",500);
		
		System.out.println("비행기 대수:" + Plane.getPlanes()); //2 출력
		System.out.println("클래스멤버의 객체를 통해서도 접근할 수 있어요");
		System.out.println("p1을 통해서 확인:" + p1.getPlanes());
		System.out.println("p2를 통해서 확인:" + p2.getPlanes());
	
		System.out.println(p1.getCompany());	//null
		System.out.println(p1.getModel());		//null
		System.out.println(p1.getSeats());			//0  출력됨.
		
		p1.setCompany("보잉");
		p1.setModel("보잉747");
		p1.setSeats(200);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
