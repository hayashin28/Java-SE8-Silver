/**
 * 徹底攻略
 * Java SE8 Silver 問題集
 * @author 志賀澄人
 */

package chapter03.ex09;

public class Sample {
	private int num;
	@SuppressWarnings("unused")
	private String name;
	public Sample(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Sample) {
			Sample s = (Sample)obj;
			return s.num == this.num;
		}
		return false;
	}
}
