class IllegalScore extends Exception
{
	public IllegalScore(String msg){
		super(msg);
	}
}

class ProcessScore
{
	public static int no( int []num ) throws IllegalScore{
		int avg =0;
		int sum =0;
		
		for(int i = 0; i < num.length; i ++){
			if( num[i] < 0){
				throw new IllegalScore("성적은 음수일 수 없어요.");
			}
			sum += num[i];	
		}
		avg = sum / num.length;		
		return avg;
	}
}



class  ProcessScoreTest
{
	public static void main(String[] args) 
	{
		try{
			int a[] ={ 10, 30, 30, 30, 100  };
			ProcessScore.no(a);
			System.out.println("평균은: "+ ProcessScore.no(a) );

		}catch(IllegalScore e){
			System.out.println(e.getMessage());
		}
	}
}
