//삼항연산자
class ConditionOperator 
{
	public static void main(String[] args) 
	{
		int i=7;
		String r = (i>=0)?"양수":"음수";
		System.out.println(r);
		//System.out.println( (i>=0)?"양수":"음수" ); //양수라고 출력됨
		//(i>0)?System.out.println("양수"):System.out.println("음수"); 
		//항2와 항3에 문장은올 수 없음. 수식만가능.
		
		//int j = (i>0)?1:0;
		//int j = (i>0)?i+100:i*2; //이런 수식이 올수도 있음. 
		//System.out.println(j);
	}
}
