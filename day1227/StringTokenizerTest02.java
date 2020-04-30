import java.util.StringTokenizer;
class StringTokenizerTest02
{
	public static void main(String[] args) 
	{
		String str = "이수인,이원우,이희재,한주련,최봉현,현민아,최영수";
		StringTokenizer st = new StringTokenizer(str,",");
		//StringTokenizer(String str, String delim) delim 자리가 분리할 문자(디폴트는 블랭크)

		while( st.hasMoreTokens() ){ 	
			String data = st.nextToken();
			System.out.println(data);
		}
	}
}
