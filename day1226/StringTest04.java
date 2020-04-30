/*
substring
public String substring(int beginIndex,int endIndex)

examples:
 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
*/



class StringTest04 
{
	public static void main(String[] args) 
	{
		String data ="hello java hello korea";
		//특정 단어만 잘라오고 싶다.
		
		String r  = data.substring(6,10); //java만 잘라오도록 
		System.out.println(r); //java 출력

		String r2 = data.substring(17); //17번째 인덱스부터 끝까지 잘라오도록
		System.out.println(r2);	// korea 출력됨.
	}
}
