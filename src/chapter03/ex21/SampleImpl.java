/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex21;

/**
 * 第３章 問題２１
 * 次のプログラムを実行した時に yes と表示したい。
 * コードとして正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		String a = "A";
		String b = "B";
		/**
		 * 三項演算子は、条件に合致するか否かで戻す値を変更する演算子です。
		 * 論理式 ? true : false;
		 */
		String c = a.equals(b) ? "no" : "yes";
		System.out.println(c);
	}
}
