//영수가 푼 문제==> 선생님이 손봐주신 파일 
import java.util.Scanner;

class Pro03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a; // 정답 저장
		int count = 0;
		String []quiz = { //문제들
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
		String []one = { //보기들
			"a)벤쿠버		b)토론토	 c)오타와		d)재스퍼",
			"a)홍길동		b)이원우  c)이순신		d)유관순",
			"a)100	b)-1		c)2	d)50",
			"a)울산	b)대전	 c)광주		d)서울",
			"a)문재인		b)박근혜		c)이명박		d)조국",
			"a)2020		b)2019		c)2018		d)1997",
			"a)2020/5/3		b)2019/12/31		c)2020/6/3		d)2019/12/11",
			"a)홍길동			b)유관순		c)이순신		 d)최영수",
			"a)4강의장		b)2강의장		c)1강의장		d)3강의장",
			"a)한빛교육센터		 b)비트캠프			c)비트코인		d)비트박스",
			}; 
		String []dap = {"a","b","c","d","a","b","c","d","a","b"};  //답
		String []dap2 = {"1","2","3","4","1","2","3","4","1","2"};
		for( int i = 0; i < 10 ; i++ )
		{
			System.out.println( quiz[i] );  //문제출력
			System.out.println( one[i] );	//보기출력
			System.out.print( ( i+1) + " 번 문제의 정답을 입력하세요==>");
			a = sc.next();
			if( dap[i].equals(a)  ||  dap2[i].equals(a)){
				count++;
			}
			
		}
		System.out.println(" 정답 횟수 : " + count);
		System.out.println(" 오답 횟수 : " + (10 - count));
	}
}
