package inheritance;

public class Sub  extends Super {
	
	protected String name;
	protected int age;
	
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	
	public Sub(String name, int age, double weight, double height) {
		System.out.println("Sub 생성자");
		this.age = age;
		this.name = name;
		super.height = height; // 부모 클래스의 참조값
		super.weight = weight;
		//this.height = height;// 내 자신 클래스의 참조값
		//this.weight = weight;
	}
	
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
		
	}
	
	public static void main(String[] args) {
		
		Sub aa = new Sub("홍길동", 25, 60, 193.5);
		
		aa.disp();
		System.out.println();
		aa.output();
		System.out.println("-----------------");
		
		Super bb = new Sub("코난", 13, 35.4, 152.1);
		//bb.output(); - error 
		bb.disp();
		
	}
}
