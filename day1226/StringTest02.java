//String 은 불변의 특징을 가지고있다. 변하지 않는 문자열! 

class StringTest02 
{
	public static void main(String[] args) 
	{
		String str = "   hello   ";
		System.out.println("|"+str+"|");  // | 파이프라인   
		System.out.println( str.length());

		System.out.println("|"+ str.trim() +"|"); //trim 블랭크를 사라지게함.
		System.out.println("|"+str+"|"); //trim 이 string 값을 변환시켜주지 않으므로 여기서 다시 블랭크있는 헬로우 등장. 

		str = str.trim(); //trim 으로 변경된값을 다시 str에 담아줘야함. 스트링은 불변이니까.
		System.out.println("|"+str+"|");
	}
}
