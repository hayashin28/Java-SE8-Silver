/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex09;

/**
 * 第３章 問題９
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		Sample a = new Sample(10, "a");
		Sample b = new Sample(10, "b");
		/**
		 * Sampleクラスでは、equalsメソッドをオーバーライドしています。
		 * オーバーライドされた equalsメソッド内では、引数のオブジェクトが
		 * Sampleクラスであった場合、お互いの　num が等しいか判定し、その
		 * 結果を返却しています。
		 */
		System.out.println(a.equals(b));
	}
}
