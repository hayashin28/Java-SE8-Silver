/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex04;

/**
 * 第３章 問題４
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int a = 10;
		/**
		 * インクリメント、デクリメントされた値が変数に格納された後で
		 * 各項の算術処理が行われます。
		 */
		int b = a++ + a + a-- - a-- + ++a;
		//  32 = 10   + 11 +11   - 10   +   10
		System.out.println(b);
		
		/**
 		 * インクリメント、デクリメントの演算子が変数の左右によって、
		 * 処理の順番が異なるので注意が必要です。
		 * 右は処理の後、左は処理の前に行われます。
		 */
	}
}
