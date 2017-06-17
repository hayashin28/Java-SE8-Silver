/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex01;

/**
 * 第３章 問題１
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int a = 3;
		/**
		 * a += 5 で a には８（３＋５）が代入されます。
		 * また、その値は b にも代入されています。
		 * += は代入演算子と呼ばれ、加算代入や減算代入などの
		 * バリエーションを持ちます。
		 */
		int b = a += 5;
		/**
		 * a + b = 8 + 8 = 16
		 */
		System.out.println(a + b);
	}
}
