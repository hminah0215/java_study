/*
컴퓨터와 사용자간에 가위,바위,보 게임을 위한 프로그램을 만들려고 합니다. 
사용자한테 0,1,2(가위,바위,보)를 입력받아 "가위","바위","보"를 출력하세요.
<실행예>
가위[0],바위[1],보[2] 중에 선택하세요==? 1
당신은 "바위"를 내셨습니다.
*/

import java.util.Scanner;
import java.util.Random; //무작위수, 난수
class	SwitchP01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		int user,com;
		String userStr="",comStr="";

		//사용자에게 입력받기전에 먼저 컴퓨터가 준비하고 있을 수 있도록
		com = rand.nextInt(3); //0부터 2까지 중에 무작위로 컴퓨터가 내도록.
		//System.out.println(com);
		
		
		System.out.println("*** 가위,바위,보 게임 ***");
		System.out.print("가위[0],바위[1],보[2] 중에 선택하세요==>");
		user=sc.nextInt();

		if(user < 0 || user > 2)
		{
			System.out.println("입력값을 확인하세요!");
			return; //범위외 숫자를 입력했을떄 아예 스위치를 만나지 않게하려고.
		}
		switch(user)
		{
			case 0:userStr = "가위";break;
			case 1:userStr = "바위";break;
			case 2:userStr = "보";break;
			

		}
		System.out.println("당신은 "+userStr+ " 를 냈습니다.");
		
		switch(com)//컴퓨터가 낸것 메시지 출력
		{
			case 0:comStr = "가위";break;
			case 1:comStr = "바위";break;
			case 2:comStr = "보";break;
			

		}
		System.out.println("컴퓨터는 "+comStr+ " 를 냈습니다.");

		/*컴퓨터가 이겼는지,사용자가 이겼는지, 비겼는지 판단하여
		 게임결과를 출력하도록 기능을 추가해보세요. */
		
		/* 내가한거
	
			if( user==com )
			System.out.println("비겼습니다.");
		
			else if( user == 0 )
			{
		 		 if( com == 1)
				System.out.println("사용자가 졌습니다.");
				else if( com == 2)
				System.out.println("사용자가 이겼습니다.");
			}

			 else if( user == 1 )
			{
				if( com == 0 )
				System.out.println("사용자가 이겼습니다.");
				else if( com == 2)
				System.out.println("사용자가 졌습니다.");
			}
			 
				else if( user == 2 )
				{
					if( com == 0 )
				System.out.println("사용자가 졌습니다.");
		 			else if( com == 1)
				System.out.println("사용자가 이겼습니다.");
				
				}
				
			*/

		if( com==user )
		{	
		System.out.println("비겼습니다.");
		}	else if((user ==0 && com==2) || (user ==1 && com==0)|| (user==2 && com==1))
				System.out.println("당신이 이겼습니다.");
		    else {
				System.out.println("당신이 졌습니다.");}
	}
}

 