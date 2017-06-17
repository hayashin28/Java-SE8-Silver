/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex11;

/**
 * 第３章 問題１１
 * このクラスを利用する以下のプログラムをコンパイル、実行
 * した時の結果として正しいものを選びなさい。
 * @author hayashin
 */

public class SampleImpl {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = null;
		/**
		 * 同値性の確認方法は各クラスによって異なるため、equalsメソッドは
		 * オーバーライドして使うことが前提となっています。
		 * オーバーライドする際に満す条件は幾つかありますが、その一つに
		 * null 以外の参照値ｘについて、x.equals(null) は falses 
		 * が APIドキュメントに示されています。
		 * なお、最上位クラスである Objectクラスの equalsメソッドは
		 *
		 * public boolean equals (Object) {
		 * 		return (this == null);
		 * }
		 * 
		 * と定義されています。
		 * 自分自身を表す this と引数で渡された参照を比較しており、
		 * null が渡されると false が返却されます。
		 */
		System.out.println(a.equals(b));
	}
}
