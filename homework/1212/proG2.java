import java.util.Scanner;
//���� ���α׷��� 2�� ������ Ǯ�� 
class  ProG2
{
	public static int correctAnswers( String []dap, String []a  ){  //��ȯ�Ҷ� �������ؾ��ϴ� ��Ʈ!
		int n = 0;
		for( int i= 0;  i < dap.length; i++ ){
			if( dap[i].equals (a[i]) ){
					n ++;
			}
		}
			return n;
	}

	public static int incorrectAnswers( String []dap, String []a  ){  //��ȯ�Ҷ� �������ؾ��ϴ� ��Ʈ!
		int n = 0;
		
		n = dap.length - correctAnswers( dap , a );
		//�޼ҵ�ȿ��� �̹� �ִ� �ٸ� �޼ҵ带 �󸶵��� ȣ���� �� �ִ�. �̹� �ִ� �޼ҵ带 
		//Ȱ���ؼ� ����Ƚ���� ��µǵ��� �ϴ°� �� ����. 

		//for( int i= 0;  i < dap.length; i++ ){
			//if( !dap[i].equals (a[i]) ){  //����Ƚ�� ���ϴ°ſ��� ! �����ʴٰ� �ϸ� ����Ƚ��. 
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
			�̷��� �ص� �۵��ߵ�. �ٵ� �Ҹ����� �ϸ� ����.
		*/

	}




	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[10];  //�������� �迭��. 
		int count =0;
		String []quiz = {		//������
			"����1) ĳ������ ������?",
			"����2) �̼����� ¦��?",
			"����3) 1+1 =?",
			"����4) �ѱ��� ������?",
			"����5) �츮���� �������?"	,			
			"����6) ���ش� ��⵵�ΰ���?",
			"����7) �츮�� ���������ؿ�?",
			"����8) ���ξ��� ¦��?",
			"����9) �츮 ��������?",
			"����10) �츮 ���������?"
			};
		
			String []one = {		//�����
			"a)������		b)�����	 c)��Ÿ��		d)�罺��",
			"a)ȫ�浿		b)�̿���  c)�̼���		d)������",
			"a)100	b)-1		c)2	d)50",
			"a)���	b)����	 c)����		d)����",
			"a)������		b)�� 	c)��		d)��",
			"a)2020		b)2019		c)2018		d)1997",
			"a)2020/5/3		b)2019/12/31		c)2020/6/3		d)2019/12/11",
			"a)ȫ�浿			b)������		c)�̼���		 d)�ֿ���",
			"a)4������		b)2������		c)1������		d)3������",
			"a)�Ѻ���������		 b)��Ʈķ��			c)��Ʈ����		d)��Ʈ�ڽ�",
			}; 
		
			String []dap = {"a","b","c","d","a","b","c","d","a","b"};  //��
			
			for( int i = 0; i < 10 ; i++ ){
			System.out.println( quiz[i] );  //�������
			System.out.println( one[i] );	//�������
			System.out.print( ( i+1) + " �� ������ ������ �Է��ϼ���==>");
			a[i] = sc.next();
		
			}

		

			count = correctAnswers(  dap , a  );
			int inCorrect = incorrectAnswers( dap, a );			
			//String pass = isPassed( count );
			
			System.out.println( "���� Ƚ�� : " + count );
			System.out.println( "���� Ƚ�� : " + inCorrect );
			//System.out.println(" �հݿ��� :" +pass);
		
			if( isPassed( dap, a )  ){ //�Ҹ����� ��ȯ�ϴ� �޼ҵ�� == true ���� ���� �ȹ������ ��. 
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			} 
		
			
	}
}