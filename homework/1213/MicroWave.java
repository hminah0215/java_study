/*12월13일 금요일 숙제 1

1) 집에 있는 가전 제품중에 하나를 선택하여 속성과 동작을 분석하여 
	클래스를 만들고 객체를 생성하여 실험 해 봅니다.(*)

*/
class Micro{
	private String button; //전자렌지 버튼
	private String door; // 전자레인지 문 
	private String round; //전자레인지 회전판?
	
	public void state(){
		System.out.println("전자레인지 ");
		System.out.println("버튼을 " + button);
		System.out.println("문을 " + door);
		System.out.println("회전판이 " + round);
	}

	//생성자
	
	public Micro( String button, String door, String round){
		this.button = button;
		this.door = door;
		this.round = round;
		
	}

	//설정자 

	public void setButton( String button ){
		this.button = button;
	}
	public void setDoor( String door){
		this.door = door;
	}
	public void setRound( String round){
		this.round = round;
	}


	//접근자

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
		Micro m1 = new Micro("누른다","닫는다","돌아간다");
		m1.state();
		System.out.println();
		Micro m2 = new Micro("끈다","연다","멈춘다");
		m2.state();
		
		
		
	}
}
