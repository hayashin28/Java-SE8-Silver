/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex07;

/**
 * 第２章 問題７
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	
	public static void main(String[] args) {
		/**
		 * 変数aおよびbを Item クラスでインスタンス化しています。
		 * クラスをインスタンス化すると、参照型の変数になります。
		 * a と b は異なる変数、別言するとオブジェクトとなるため、
		 * コンソールには 10 が表示されます。
		 */
		Item a = new Item();
		Item b = new Item();
		b.setNum(20);
		System.out.println(a.getNum());
	}
}
