
class  SwitchTest02
{
	public static void main(String[] args) 
	{
		int n=3;
		String r="";
		

		switch(n) 
		{
			case 0:case 1: case 2:System.out.println("이");break;
			case 3:case 4:case 5:System.out.println("오");break;
			case 6:case 7:case 8:case 9:System.out.println("구");break;
			default:System.out.println("0~9사이의 값이 아닙니다.");//else랑같음. 그나머지들.
		}
			System.out.println("작업종료");
		}
	}