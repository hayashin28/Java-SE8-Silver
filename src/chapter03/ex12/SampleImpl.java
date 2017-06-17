/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex12;

/**
 * 第３章 問題１２
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		String a = "Sample";
		String b = "Sample";
		/**
		 * 文字型リテラルはプログラム中に頻繁に現れます。
		 * そのため、文字リテラルは定数値としてインスタンスとは異なる定数用の
		 * メモリ空間が作られ、そこへの参照が String型の変数に代入されます。
		 * もし、同じ文字列リテラルがプログラム内に登場した場合、定数用の
		 * メモリ空間が使い回され、メモリの消費を抑制します。
		 * このような仕組みを『コンスタントプール』と呼びます。
		 */
		System.out.print(a == b);		 //参照先の比較
		System.out.print(", ");
		System.out.println(a.equals(b)); //値の比較
	}
}
