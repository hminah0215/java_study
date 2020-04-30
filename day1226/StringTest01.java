//String length() 실험

class  StringTest01
{
	public static void main(String[] args) 
	{
		String data = "hello ";
		int n = data.length();  // 문자열의 길이를 구해줌
		System.out.println(n);	// 5라고 출력, 블랭크있으면 6자 (공백도 한글자로 취급)
	}
}
