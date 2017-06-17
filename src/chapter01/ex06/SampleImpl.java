/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter01.ex06;

/**
 * 第１章 問題６
 * このクラスを利用する以下のプログラムに当てはまる、
 * import文を選びなさい。
 * @author hayashin
 */

/**
 * staticなフィールドやメソッドに略称表記でアクセスする
 * ための宣言がstaticインポートです。
 * import static　に続けて、表記したいフィールドや
 * メソッドの完全装飾名を記述します。
 */
import static chapter01.ex06.Sample.num;
import static chapter01.ex06.Sample.print;

public class SampleImpl {
	public static void main(String[] args) {
		num =10;
		print();
	}
}
