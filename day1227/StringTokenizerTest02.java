import java.util.StringTokenizer;
class StringTokenizerTest02
{
	public static void main(String[] args) 
	{
		String str = "�̼���,�̿���,������,���ַ�,�ֺ���,���ξ�,�ֿ���";
		StringTokenizer st = new StringTokenizer(str,",");
		//StringTokenizer(String str, String delim) delim �ڸ��� �и��� ����(����Ʈ�� ��ũ)

		while( st.hasMoreTokens() ){ 	
			String data = st.nextToken();
			System.out.println(data);
		}
	}
}
