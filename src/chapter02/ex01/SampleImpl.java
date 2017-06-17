/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter02.ex01;

/**
 * 第２章 問題１
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int val = 7;
		/**
		 * bool という変数の型は存在しないため、
		 * コンパイルエラーになります。
		 * 正しくは boolean です。
		 */
/*		
		bool flg = true;
		if (flg == true) {
			do {
				
			} while(val > 10);
			
		}
*/		
	}
}
