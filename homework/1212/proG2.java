import java.util.Scanner;
//숙제 프로그래밍 2번 선생님 풀이 
class  ProG2
{
	public static int correctAnswers( String []dap, String []a  ){  //반환할때 정수로해야하니 인트!
		int n = 0;
		for( int i= 0;  i < dap.length; i++ ){
			if( dap[i].equals (a[i]) ){
					n ++;
			}
		}
			return n;
	}

	public static int incorrectAnswers( String []dap, String []a  ){  //반환할때 정수로해야하니 인트!
		int n = 0;
		
		n = dap.length - correctAnswers( dap , a );
		//메소드안에서 이미 있는 다른 메소드를 얼마든지 호출할 수 있다. 이미 있는 메소드를 
		//활용해서 오답횟수가 출력되도록 하는게 더 간단. 

		//for( int i= 0;  i < dap.length; i++ ){
			//if( !dap[i].equals (a[i]) ){  //정답횟수 구하는거에서 ! 같지않다고 하면 오답횟수. 
				//	n ++;
			//}
		//}
			return n;
	}

	public static boolean isPassed( String []dap, String []a  ){
	
		boolean r = false;
		int cnt = correctAnswers( dap, a );
		if( cnt >= 7 ){
			r = true;
		}
		return r;
		
	

	/*
	String s;
		if ( a >= 7 ){
			s = "true";
		}else {
			s = "false";
		}
			return s;  
			이렇게 해도 작동잘됨. 근데 불린으로 하면 좋음.
		*/

	}




	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[10];  //정답저장 배열로. 
		int count =0;
		String []quiz = {		//문제들
			"문제1) 캐나다의 수도는?",
			"문제2) 이수인의 짝은?",
			"문제3) 1+1 =?",
			"문제4) 한국의 수도는?",
			"문제5) 우리나라 대통령은?"	,			
			"문제6) 올해는 몇년도인가요?",
			"문제7) 우리는 언제수료해요?",
			"문제8) 현민아의 짝은?",
			"문제9) 우리 강의장은?",
			"문제10) 우리 교육기관은?"
			};
		
			String []one = {		//보기들
			"a)벤쿠버		b)토론토	 c)오타와		d)재스퍼",
			"a)홍길동		b)이원우  c)이순신		d)유관순",
			"a)100	b)-1		c)2	d)50",
			"a)울산	b)대전	 c)광주		d)서울",
			"a)문재인		b)닭 	c)쥐		d)소",
			"a)2020		b)2019		c)2018		d)1997",
			"a)2020/5/3		b)2019/12/31		c)2020/6/3		d)2019/12/11",
			"a)홍길동			b)유관순		c)이순신		 d)최영수",
			"a)4강의장		b)2강의장		c)1강의장		d)3강의장",
			"a)한빛교육센터		 b)비트캠프			c)비트코인		d)비트박스",
			}; 
		
			String []dap = {"a","b","c","d","a","b","c","d","a","b"};  //답
			
			for( int i = 0; i < 10 ; i++ ){
			System.out.println( quiz[i] );  //문제출력
			System.out.println( one[i] );	//보기출력
			System.out.print( ( i+1) + " 번 문제의 정답을 입력하세요==>");
			a[i] = sc.next();
		
			}

		

			count = correctAnswers(  dap , a  );
			int inCorrect = incorrectAnswers( dap, a );			
			//String pass = isPassed( count );
			
			System.out.println( "정답 횟수 : " + count );
			System.out.println( "오답 횟수 : " + inCorrect );
			//System.out.println(" 합격여부 :" +pass);
		
			if( isPassed( dap, a )  ){ //불린으로 반환하는 메소드라 == true 인지 굳이 안물어봐도 됨. 
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			} 
		
			
	}
}