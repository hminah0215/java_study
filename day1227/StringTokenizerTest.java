import java.util.StringTokenizer;
class StringTokenizerTest 
{
	public static void main(String[] args) 
	{
		String str = "이수인 이원우 이희재 한주련 최봉현 현민아 최영수";
		StringTokenizer st = new StringTokenizer(str);

		while( st.hasMoreTokens() ){ //불린을 반환한다는 뜻			
			String data = st.nextToken();
			System.out.println(data);
		}
	}
}
