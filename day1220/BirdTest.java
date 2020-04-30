abstract class Bird
{
	public abstract void sound();
}

class Dove extends Bird
{
	public void sound(){
		System.out.println("coo coo");
	}

}

class  BirdTest
{
	public static void main(String[] args) 
	{
		//Bird a = new Bird(); 객체를 생성하는 문장 추상클래스는 객체화 할 수 없음.
		Bird b = new Dove();
		b.sound();

		//Bird b[] = new Bird[5]; 
		//버드를 참조할 변수(객체참조변수)를 5개 만드는것이라 가능.
	}
}
