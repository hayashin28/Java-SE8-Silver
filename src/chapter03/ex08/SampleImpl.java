/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex08;

/**
 * 第３章 問題８
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		/**
		 * Sampleクラスをインスタンス化し、格納している
		 * メモリのアドレスを s1 に代入しています。 
		 */
		Sample s1 = new Sample(10);
		/**
		 * s1 に格納されているインスタンスのアドレスを
		 * s2 に代入しています。
		 */
		Sample s2 = s1;
		/**
		 * 新たなSampleクラスのインスタンスを生成し、
		 * s1 に参照先を代入しています。
		 */
		s1 = new Sample(10);
		/**
		 * お互いの変数に格納されているインスタンスの
		 * 参照先を比較していますが、異なるため false
		 * が出力されます。
		 */
		System.out.println(s1 == s2);
	}
}
