

	import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.IIOException;
		public  class texst{
		public static void main(String[] args)throws IIOException {
				// TODO 自動生成されたメソッド・スタブ
		//新規作成、上書き保存、追記ができること
				BufferedReader br = newBufferedReader(InputStreamReader(System.in));

				if( args.length ==0){
					System.out.println("未指定");
					return;
				}
				//新規作成
				File newfile = new File(args[0]+".txt");

				if(newfile.exists()){
					System.out.println("そのファイルは既に存在");
					return;
				}

				try{
					if(newfile.createNewFile()){
					String path = newfile.getPath();
					System.out.println(path+"を作成");
					}else{
						System.out.println("ファイル作成に失敗");
					}

				}catch(IOException e){
					System.out.println(e);
					}
					//読み込み
					File file= new File(args[0]);

					if(!file.exists()){
						System.out.println("ファイルが存在しない");
						return;
						}
					if(!file.isFile()){
						System.out.println("ファイル以外を指定");
						return;
					}
					if(!file.canRead()){
						System.out.println("ファイルが読み込み不可");
						return;
					}
						try{





							String str =null;
							while((str= br.readLine()) != null){
								System.out.println(str);
							}
							br.close();

						}catch (FileNotFoundException ex){
							System.out.println(ex);
						}catch( IOException ex){
								System.out.println(ex);
						}


						//書き込み・上書き
						if(args.length==0){
							System.out.println("未指定");
						return;
						}
			}



			private static FileReader InputStreamReader(InputStream in) {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}



			private static BufferedReader newBufferedReader(FileReader fr) {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}
						
	}


