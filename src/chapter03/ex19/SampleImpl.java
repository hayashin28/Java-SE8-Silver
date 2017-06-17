/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex19;

/**
 * 第３章 問題１９
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final int NUM = 10;
		int num = 10;
		/**
		 *	case で使用できる値は次の条件を満たす必要があります。
		 *	・条件式が戻す値と同じ型か互換性がある型であること
		 *	・定数であるか、コンパイル時に値が決められること
		 *	・null でないこと
		 *	switch で 整数型がしていされているにも関わらず、
		 *	最初の case は文字列であり、互換性がありません。
		 *	２番目の case は変数を指定しています。 
		 *	case には定数やリテラルといった後から値が変更できない
		 *	ものしか記述できません。変数は case に使用できません。
		 */
		switch (num) {
/*		
		case "10"		:	System.out.println("A");
		 					break;								
		case num		:	System.out.println("B");
							break;
		case 2 * 5		:	System.out.println("C");
							break;
		case NUM		:	System.out.println("D");
							break;
*/
		}
	}
}
