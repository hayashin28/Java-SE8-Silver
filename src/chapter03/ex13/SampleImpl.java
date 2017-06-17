/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex13;

/**
 * 第３章 問題１３
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		String a = new String("Sample");
		String b = "Sample";
		/**
		 * メモリ空間を使い回す『コンスタントプール』は文字型リテラルのみ有効です。
		 * new 演算子で明示的にインスタンスを生成した場合、参照先が異なります。
		 */
		System.out.print(a == b);		 //参照先の比較
		System.out.print(", ");
		System.out.println(a.equals(b)); //値の比較
	}
}
