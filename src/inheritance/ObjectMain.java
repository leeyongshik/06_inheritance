package inheritance;

class Test extends Object{ // 자바의 모든 클래스는 Object로 부터 상속 받는다.
	
	@Override
	public String toString() {	
		return getClass() + "@개바부";
	}
}


//---------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());//주소값을 가지고 있는 메소
		System.out.println("객체 t = " + t.hashCode());// 주소값을 10진수로 출력
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());//주소값을 가지고 있는 메소
		System.out.println("객체 str = " + str.hashCode());// 주소값을 10진수로 출력
		System.out.println();
		
		
		String aa = new String("apple");
		String bb = new String("apple");
		
		System.out.println("aa==bb : "+ (aa==bb)); // 주소 - false
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); // 문자열 - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		
		System.out.println("cc==dd : "+ (cc==dd));// 주소 - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd));// 주소 - false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		
		System.out.println("ee==ff : "+ (ee==ff));// 주소 - false
		System.out.println("ee.equals(ff) : " + ee.equals(ff));// 주소 - false
		System.out.println();
		
		
		
	}

}
/*
class Object {
	public boolean equals(Object){} // 참조값 비교
	public String toString() // 클@16진수
	public String hashCode() // 10진수
 }

class Test extends Object {
	public String toString() //개바부
	
}

class String extends Object{
public boolean equals(Object){} // 참조값 비교
	public String toString() //문자열
	public String hashCode() // 문자열을 10진수로 변환
								표현 할 수 있는 문자열은 무한대이기 떄문에 10진수로 표현을 다 할 수 없다.
}
*/