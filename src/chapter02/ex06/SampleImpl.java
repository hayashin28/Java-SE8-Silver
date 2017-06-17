/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex06;

/**
 * 第２章 問題６
 * このプログラムを実行した結果として、コンソールに NULL と
 * 表示したい。正しいコードを選びなさい。
 * @author hayashin
 */

public class SampleImpl {

	public static void main(String[] args) {
		/**
		 * Object は参照型の変数です。
		 * null を代入しても、表示処理で例外になります。
		 * 下のように "" で文字列扱いにすれば表示可能です。
		 */
		Object obj = "NULL";
		System.out.println(obj);
	}
}
