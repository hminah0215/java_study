// 12월 13일 금요일 숙제.
// 현민아 
//4) 지난주의 사주팔자 프로그램을 완성하여 제출합니다.(*)
//rola70@nate.com

import java.util.Scanner;
class Saju 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name;
		int zodiac, mon, day,  time;
//태어난   띠      , 월    , 일  ,   시 

		String lucky[] = {"천귀","천액","천권", "천파", "천인", "천문" , "천복", "천고", "천역", "천간","천수", "천명"};
		
		String puli[] ={"천귀 : 어디를 가던지 귀인대접을 받음." , 
			 				  "천액 : 액이 끼어있는 사주.",
		 					  "천권 : 리더십이 있는 사주. ",
							  "천파 : 삶에 파동이 있음.",
							  "천인 : 인간성이 좋음.",
							  "천문 : 머리가 좋음.",
						      "천복 : 하늘로부터 복을 가지고 태어남.",
						      "천고 : 외로움을 많이타는 사주.",
							  "천역 : 역마살이 있다.",
							  "천간 : 이성한테 매력이있음. 남편복,바람끼.",
							  "천수 : 손재주가 있음.",
							  "천명 : 명이길어 오래산다."};

	
	//이름, 띠 , 태어난 월,일,시 입력받기
	 System.out.println("**재미로보는 사주팔자 확인 프로그램입니다**");
     System.out.print("이름을 입력해주세요===>");
     name = sc.next();
	 System.out.println();

	 System.out.println("당신의 띠를 아래 보기에서 선택해주세요.");
     System.out.println("1.쥐(자)   2.소(축)   3.호랑이(인)   4.토끼(묘)   5.용(진)   6.뱀(사) ");
	 System.out.println("7.말(오)   8.양(미)   9.원숭이(신)   10.닭(유)   11.개(술)   12.돼지(해)");
     zodiac = sc.nextInt();
	 System.out.println();

	 System.out.print("음력 탄생 월을 입력해주세요===>");
     mon = sc.nextInt();
     System.out.print("음력 탄생 일을 입력해주세요===>");
     day = sc.nextInt();
	 System.out.println();

	 System.out.println("태어난 시간을 아래 보기에서 선택해주세요.");
     System.out.println("1.[23시~01시]   2.[01시~03시]   3.[03시~05시]  4.[05시~07시]  ");
     System.out.println("5.[07시~09시]   6.[09시~11시]   7.[11시~13시]  8.[13시~15시]   ");
     System.out.println("9.[15시~17시]  10.[17시~19시] 11.[19시~21시] 12.[21시~23시] ");
     time = sc.nextInt();
	 System.out.println();	
	
		zodiac = zodiac-1;
			System.out.println("\n**사주풀이 결과를 풀이합니다**\n");
			System.out.println("당신의 이름은  "+name+ "입니다.");
			System.out.println("당신은 "+mon+"월 "+day+"일 에 태어났습니다.");
			System.out.println();
			
			System.out.println("당신의 첫번째 운은  " + lucky[zodiac]+ "입니다.");
		    System.out.println(puli[zodiac]);
			System.out.println();

		zodiac = (zodiac + mon - 1)%12; //첫번째로 나온자리 한번 찍고 (-1) 월만큼 순서대로 이동
			System.out.println("당신의 두번째 운은  " + lucky[zodiac] + "입니다.");
			System.out.println(puli[zodiac]);
			System.out.println();
      
       zodiac = (zodiac + day -1)%12;  
			System.out.println("당신의 세번째 운은  " + lucky[zodiac] + "입니다.");
			 System.out.println(puli[zodiac]);
			System.out.println();
      
       zodiac = (zodiac + time -1)%12;
			 System.out.println("당신의 네번째 운은  " + lucky[zodiac] + "입니다.");
			 System.out.println(puli[zodiac]);

			 System.out.println();
			 System.out.println("재미로 보는 사주풀이니 결과가 안좋다고 낙심하지마세요! ");
			 
	}
}
