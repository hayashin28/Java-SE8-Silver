/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex10;

public class Sample {
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	
	public boolean equals(Sample obj) {
		if (obj == null) {
			return false;
		}
		return this.num == obj.num;
	}
}
