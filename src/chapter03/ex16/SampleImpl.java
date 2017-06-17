/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex16;

/**
 * 第３章 問題１６
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int num = 10;
		/**
		 * if文や for文において{}（ブロック）を省略した場合、
		 * 直下の一行だけが諸理されます。
		 * 本問題においては B と C のみが出力されます。
		 */
		if (num < 10)	//１０未満か
			System.out.println("A");
		else
			System.out.println("B");
		if(num == 10)	//１０と等しいか
			System.out.println("C");
	}
}
