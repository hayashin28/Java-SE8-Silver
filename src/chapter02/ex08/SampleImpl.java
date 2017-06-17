/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex08;

/**
 * 第２章 問題８
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	
	public static void main(String[] args) {
		Item a = new Item();
		Item b = new Item();
		a.name = "apple";
		b.price = 100;
		a.price = 200;
		b.name = "banana";
		/**
		 * a のインスタンスに b を代入しています。
		 * クラス型の変数は参照型ですので、a のインスタンスは
		 * b のインスタンスと同じオブジェクトを参照します。
		 */
		a = b;
		a.printInfo();
	}
}
