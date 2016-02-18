import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kuku {

	public static void main(String[] args) {
		String str = null;
		String str2 = null;
		int x = 0;
		int y = 0;
		boolean flg = true;

		while (flg) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("xの値をいれてください。 >\n");

				str = br.readLine();
				x = Integer.parseInt(str);

				if (isNumber(str)) {
					if (x >= 1 && x <= 9) {
						break;
					} else {
						System.out.println("1～9で入力してください\n");
						continue;
					}
				} else {
					System.out.println("数字で入力してください\n");
					continue;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}




	while (flg) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("yの値を入力してください > \n" );
			str2 = br.readLine();
			y = Integer.parseInt(str2);

			if (isNumber(str2)) {
				if (y >= 1 && y <= 9) {
					break;
				} else {
					System.out.println("1～9で入力してください\n");
					continue;
				}
			} else {
				System.out.println("数字で入力してください\n");
				continue;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	System.out.println(x*y);
}

	private static boolean isNumber(String str) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	}


