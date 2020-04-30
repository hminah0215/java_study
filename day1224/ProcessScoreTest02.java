//������Ǯ��

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
				throw new IllegalScore("������ ������ �� �� �����ϴ�.");
			}
			tot += s;
		}
		int avg = tot / score.length;
		System.out.println("�������:" + avg);
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
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
	}
}