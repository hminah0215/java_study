import java.util.StringTokenizer;
class StringTokenizerTest 
{
	public static void main(String[] args) 
	{
		String str = "�̼��� �̿��� ������ ���ַ� �ֺ��� ���ξ� �ֿ���";
		StringTokenizer st = new StringTokenizer(str);

		while( st.hasMoreTokens() ){ //�Ҹ��� ��ȯ�Ѵٴ� ��			
			String data = st.nextToken();
			System.out.println(data);
		}
	}
}
