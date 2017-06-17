/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex20;

/**
 * 第３章 問題２０
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int num = 1;
		/**
		 *	switch文では case値にマッチする処理を実行します。
		 *	処理が終われば break で switch文を抜けるようにします。
		 *	break を記述しなかった場合、以降に現れる case の処理が break が
		 *	現れるまで実行されます。
		 */
		switch (num) {
		case 1:
		case 2:
		case 3:
			System.out.println("A");
		case 4:
			System.out.println("B");
		default:
			System.out.println("C");
		}
	}
}
