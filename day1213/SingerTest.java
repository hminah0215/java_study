class Singer{
	private	String name;
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void sing(){
		System.out.println(name+"��(��) �뷡�� �ҷ���.");
	}
}


class  SingerTest
{
	public static void main(String[] args) 
	{
		Singer s = new Singer();
		s.setName("����ö");
		s.sing();
	}
}