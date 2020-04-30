import java.util.HashMap;
class MapTest 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		map.put("hello",2);
		map.put("java",1);

		//int n = map.get("hello");
		//int n = map.get("korea");
		Integer n = map.get("korea"); //이 단어가 없는경우
		System.out.println(n);	//null 출력 
	}
}
