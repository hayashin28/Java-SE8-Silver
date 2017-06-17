/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter01.ex07;

/**
 * 第１章 問題７
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

import static chapter01.ex07.Sample.VALUE;

@SuppressWarnings("unused")
public class SampleImpl {
	
	/**
	 * インポートしたクラスに、インポートされたメソッドや
	 * フィールドと同じものがあった場合、そのインポートは
	 * 無視されます。
	 */
	private final static int VALUE = 0;
	public static void main(String[] args) {
		System.out.println(VALUE);
	}
}
