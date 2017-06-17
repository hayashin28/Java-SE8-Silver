/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex10;

/**
 * 第３章 問題１０
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		Sample a = new Sample(10);
		Sample b = new Sample(10);
		/**
		 * 本問題の Sampleクラスの equalsメソッドはシグネチャ
		 * （引数の型や構成）が異なり、オーバーロードしています。
		 * 今回の equalsメソッドでは、引数の型は Sampleクラス
		 * であり、null でない場合にお互いの num の値を比較し、
		 * その結果を返却しています。
		 */
		System.out.println(a.equals(b));
	}
}
