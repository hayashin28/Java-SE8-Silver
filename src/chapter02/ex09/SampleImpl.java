/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex09;

/**
 * 第２章 問題０９
 * 次のクラスの hello メソッドを呼び出し、コールに
 * 『hello』と表示するためのコードを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		Sample sample = new Sample();
		/**
		 * インスタンス変数名.メソッド名();で処理を呼び出せます。
		 */
		sample.hello();
	}
}
