/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex10;

/**
 * 第２章 問題１０
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Sample s = new Sample();
		/**
		 * Sample クラスの add メソッドは２つの引数を必要としています。
		 * 下では引数を１つしか渡していないため、コンパイルエラーとなります。
		 */
		//System.out.println(s.add(10));
	}
}
