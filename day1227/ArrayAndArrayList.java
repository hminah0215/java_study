import java.util.ArrayList;
class  ArrayAndArrayList
{
	public static void main(String[] args) 
	{
		int []a = {1, 2, 3};

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);

		a[1] = 200;
		b.set(1,200); 
		//1번째를 200으로 바꿔줘, ,ArrayList는 데이터의 사이즈변화에 유연하게 대처하므로 일반 배열과 다르게 처리함.

	}
}
