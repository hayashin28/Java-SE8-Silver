/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex15;

/**
 * 第３章 問題１５
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if(false)
			/**
			 * if文や for文において{}（ブロック）を省略した場合、
			 * 直下の一行だけが諸理されます。
			 * 本問題においては B のみが出力されます。
			 */
			System.out.println("A");
			System.out.println("B");
	}
}
