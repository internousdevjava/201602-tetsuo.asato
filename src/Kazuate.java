import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Kazuate {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();
	int end=0;
	int ran=rnd.nextInt()% 101;
		if(ran<0){
		ran*= -1;
		}


	System.out.println("数当て");


	while(end==0){
	try{
		System.out.println("1～100の数を当てよう");
		String str=br.readLine();
		int nu= Integer.parseInt(str);
		if(nu==1000){
			break;
		}
		if(nu==ran){
			System.out.println("正解");
			end= 1;
		}else{
			if(nu>ran){
				System.out.println("小さいです");
		}else{
			System.out.println("大きです");
		}
		}
	}catch(Exception e){
		System.out.println("入力エラー");
	}
	}
	System.out.println("終了ました");
	}


	}


