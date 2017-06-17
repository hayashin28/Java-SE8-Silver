/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex06;

/**
 * 第３章 問題６
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		/**
		 * 変数ｂは左にインクリメントの演算子が付いているため、
		 * 比較を行う前に１が加算され、右側の論理式は true に
		 * なります。
		 * しかし、左側の論理式は条件を満たさず false となり、
		 * if文は論理積を求めていることから false となります。
		 */
		if (10 < a && 10 < ++b) {
			a++;
		}
		System.out.println(a + b);
	}
}
