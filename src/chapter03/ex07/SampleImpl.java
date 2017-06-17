/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex07;

/**
 * 第３章 問題７
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int a = 100, b = 20, c = 30;
		/**
		 * % は余剰を求める演算子です。
		 * a % b = 100 / 20 … 0
		 * 0 * c = 0 * 30 = 0
		 * a / b = 100 / 20 = 5
		 * 0 + 5 = 5
		 */
		System.out.println(a % b * c + a / b);
	}
}
