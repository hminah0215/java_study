//������ Ǭ ����==> �������� �պ��ֽ� ���� 
import java.util.Scanner;

class Pro03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a; // ���� ����
		int count = 0;
		String []quiz = { //������
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
		String []one = { //�����
			"a)������		b)�����	 c)��Ÿ��		d)�罺��",
			"a)ȫ�浿		b)�̿���  c)�̼���		d)������",
			"a)100	b)-1		c)2	d)50",
			"a)���	b)����	 c)����		d)����",
			"a)������		b)�ڱ���		c)�̸���		d)����",
			"a)2020		b)2019		c)2018		d)1997",
			"a)2020/5/3		b)2019/12/31		c)2020/6/3		d)2019/12/11",
			"a)ȫ�浿			b)������		c)�̼���		 d)�ֿ���",
			"a)4������		b)2������		c)1������		d)3������",
			"a)�Ѻ���������		 b)��Ʈķ��			c)��Ʈ����		d)��Ʈ�ڽ�",
			}; 
		String []dap = {"a","b","c","d","a","b","c","d","a","b"};  //��
		String []dap2 = {"1","2","3","4","1","2","3","4","1","2"};
		for( int i = 0; i < 10 ; i++ )
		{
			System.out.println( quiz[i] );  //�������
			System.out.println( one[i] );	//�������
			System.out.print( ( i+1) + " �� ������ ������ �Է��ϼ���==>");
			a = sc.next();
			if( dap[i].equals(a)  ||  dap2[i].equals(a)){
				count++;
			}
			
		}
		System.out.println(" ���� Ƚ�� : " + count);
		System.out.println(" ���� Ƚ�� : " + (10 - count));
	}
}