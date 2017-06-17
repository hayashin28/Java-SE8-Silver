/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex11;

/**
 * 第２章 問題１１
 * 次のプログラムを実行したときに、ガベージコレクションの
 * 対象となるインスタンスはどれか。
 * @author hayashin
 */

public class SampleImpl {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/**
		 * 利用されなくなったインスタンスを解放するのは、ガベージコレクタが
		 * 行います。ガベージコレクタが不要なインスタンスを探し、破棄する
		 * ことをガベージコレクションと呼びます。
		 * ガベージコレクションの対象は、参照されなくなったインスタンスです。
		 * 代表的なタイミングに null を代入する時があります。
		 */
		Object a = new Object();
		Object b = new Object();
		Object c = a;
		/**
		 * a の変数に null が代入されても c がインスタンスを参照しています。
		 * b の変数に格納されたインスタンスの参照先は、他の変数で使用されて
		 * いませんので、null が代入された段階でガベージコレクションの対象に
		 * なります。
		 */
		a = null;
		b = null; //このタイミングでインスタンスへの参照が外れる。
		//more code
	}
}
