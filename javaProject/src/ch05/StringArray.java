package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "HTML"}; //char은 단문자에 사용
		//정식문법으로도 바꿔보세요
		
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		
		//확장for문(향상된for문, for~each문) => jdk1.5이상부터 사용가능
		//for(개별값을 저장하는 변수 : 집합변수){ }
		for(String ss : str) {
			System.out.println(ss);
		}
		
		
	}
}
