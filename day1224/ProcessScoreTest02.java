//선생님풀이

class IllegalScore extends Exception
{
	public IllegalScore(String msg){
		super(msg);
	}
}

class ProcessScore
{
	public ProcessScore(int []score)throws IllegalScore{
		int tot = 0;
		for( int s : score){
			if( s < 0){
				throw new IllegalScore("점수는 음수가 될 수 없습니다.");
			}
			tot += s;
		}
		int avg = tot / score.length;
		System.out.println("평균점수:" + avg);
	}
}


class  ProcessScoreTest02
{
	public static void main(String[] args) 
	{
		try{
			int arr[] ={ 80, 90, 90, -100, 70  };
			
			new ProcessScore(arr);
		
		}catch(IllegalScore e){
			System.out.println("예외발생 : " + e.getMessage());
		}
	}
}
