package ch11;

public class SInfo implements Student {
	String name ="홍길동";
	String address ="서울 강남구";
	String email = "hong@gmail.com";
	
	int kor = 90;
	int eng = 85;
	int mat = 79;
	int tot;
	double avg;

	@Override
	public void address() {
		System.out.println("==============================================");
		System.out.println("이름\t주소\t        이메일");
		System.out.println(name + "\t" + address + "\t" + "\t" + email);
	}

	@Override
	public void point() {
		tot = kor + eng + mat;
		avg= tot/3;
		System.out.println("----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot
				+"\t"+String.format("%.1f", (double)(kor+eng+mat)/3));
		System.out.println("==============================================");
	}
}
