/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex12;

/**
 * 第２章 問題１２
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		/**
		 * メソッドは記述した順に実行（順次処理）されます。
		 * 後続の処理で使う変数などは、使う箇所よりも前で宣言されて
		 * いなければなりません。
		 */
		System.out.println(a);
		System.out.println(b + 2);
		@SuppressWarnings("unused")
		int c = b;
	}
}
