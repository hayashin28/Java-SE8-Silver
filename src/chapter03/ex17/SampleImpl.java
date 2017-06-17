/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex17;

/**
 * 第３章 問題１７
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		int num = 10;
		/**
		 * if文や for文において{}（ブロック）を省略した場合、
		 * 直下の一行だけが諸理されます。
		 * 本問題においては C のみが出力されます。
		 * なお、else と if の間に改行を入れた場合、 elseブロック内に
		 * 新しい if文が記述されたと解釈されます。
		 */
		if (num == 100)		//１００と等しいか
			System.out.println("A");
		else if(10 < num)	//１０より大きいか
			System.out.println("B");
		else 
		if(num == 10)			//１０と等しいか
			System.out.println("C");
		else
		if(num == 10)			//１０と等しいか
			System.out.println("D");
	}
}
