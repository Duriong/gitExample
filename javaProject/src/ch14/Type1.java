package ch14;

public class Type1 {
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	
//	private double value2;
//	public double getValue2() {
//		return value2;
//	}
//	public void setValue(double value2) {
//		this.value2=value2;
//	}
	
	public static void main(String[] args) {
		Type1 t =new Type1();
		t.setValue(100);
		//t.setValue(100.5);
		System.out.println(t.getValue());
	}
}
