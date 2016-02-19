import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Txst{
	public static void main(String args[]){
		InputStreamReader a = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(a);


		int p=0;
		int l=0;
		int m=0;
		String i = null;
		String j;
		String n = null;
		File fl;
while(p==0){
	while(p==0){
		try{
			System.out.println("メニュー");
			System.out.println("1:新規作成 2:上書き 3:追記 4:読み込み5:終了");
			String b = br.readLine();
			m=Integer.parseInt(b);
			if(m<6){p=1;}else{
				System.out.println("１～５で入力せよ");
			}
			}catch(Exception e){
				System.out.println("エラー");p=0;



			}
int l1 =m;
	switch(l1){

	case 1 ://新規作成
	try{
		System.out.println("新規ファイルを作ります。フォルダの場所を指定してください");

		i=br.readLine();
		System.out.println("ファイル名の入力");
		j= br.readLine();
		fl= new File(j);
		if(fl.createNewFile()){
			System.out.println("作成成功");
		}else{
				System.out.println("作成失敗");
		}



	FileWriter fw = new FileWriter(i+"/"+j);
	System.out.println("内容を入力");
	n=br.readLine();
	fw.write(n);
	System.out.println("成功");
	fw.close();
}catch(IOException e){
	e.printStackTrace();
	}
	break;






case 2:
	try{
		System.out.println("既存のファイルに上書きします。フォルダのパスを入力");
		i=br.readLine();
		FileWriter fw =new FileWriter(i);
		System.out.println("内容を入力");
		n=br.readLine();
		fw.write(n);
		System.out.println("成功");
		fw.close();
	}catch(IOException e){
		e.printStackTrace();

	}
break;

case 3:
	try{
		System.out.println("追記するファイルのパスを入力");
		n=br.readLine();
		FileWriter fr = new FileWriter(n,true);
		System.out.println("内容を入力");
		i=br.readLine();
		fr.write(n);
		System.out.println("成功");
		fr.close();
	}catch(IOException e){
		e.printStackTrace();
			break;
	}
	case 4:
		try{
			System.out.println("読み込み開始");
			j=br.readLine();

			File f =new File(j);
			FileReader q = new FileReader(f);

			int c = q.read();
			while(c != -1){
				System.out.print((char)c);
				c =q.read();
			}

			q.close();
		}catch(FileNotFoundException w){
			System.out.println(w);
		}catch(IOException e){
			e.printStackTrace();
		}


		break;

	case 5:
		System.out.println("プログラムの終了");
		break;
	}
	}
}
	}
}

