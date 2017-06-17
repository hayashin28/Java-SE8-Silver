/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex22;

/**
 * 第３章 問題２２
 * 次のプログラムを実行した時に A と表示したい。
 * コードとして正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int point = 80;
		/**
		 * 三項演算子は、条件に合致するか否かで戻す値を変更する演算子です。
		 * 論理式 ? true : false;
		 * 本問題では三項演算子をネストさせています。可読性が落ちるため、
		 * 数式	= 式A ? 式Aが true の場合
		 * 		: 式B ? 式Bが true の場合
		 * 		: 式C ? 式Cが true の場合
		 * 		: すべて false だった場合
		 */
		String val = point < 40 ? "D" : point < 60 ? "C" : point < 80 ? "B" : "A";
		System.out.println(val);
	}
}
