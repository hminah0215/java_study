/*
6) 실수형 배열을 매개변수로 전달받아 오름차순 정렬하는 메소드를 
	참고자료 없이 만들 수 있도록 자신의 코드로 만드세요.
*/
class  Cc
{
	public static void sil( double b[]){
		for( int i = 0 ; i < b.length; i++){ 
			for( int j = i+1; j < b.length ; j++){
				if(b[i] > b[j]){
				 double temp;
				 temp = b[i];
				 b[i] = b[j];
				 b[j] = temp;
				
				}
			} System.out.println(b[i]);
		}
	}
	public static void main(String[] args) 
	{
		double a[] = {1.3, 4.9, 18.7, 19.1, 2.3 };
		sil (a);
	}
}
