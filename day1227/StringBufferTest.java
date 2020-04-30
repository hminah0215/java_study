
class StringBufferTest 
{
	public static void print(String str){
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("친구를");
		sb.append(" 사랑했네");
		System.out.println(sb);
		sb.insert(0,"친구의 ");
		System.out.println(sb);

		print(sb.toString()); //스트링버퍼를 투스트링을 이용해서 스트링으로 다시 변환해준다. 
}
