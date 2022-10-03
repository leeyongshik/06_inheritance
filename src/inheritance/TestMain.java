package inheritance;

class AA{
	public int a =3 ;
	public void disp() {
		a += 5;
		System.out.println("AA : "+a+" ");
	}
}
//--------------------

class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : "+a+" ");
	}
}
//--------------------


public class TestMain {
	public static void main(String[] args) {
		
		BB aa = new BB();
		aa.disp();
		System.out.println("aa : " + aa.a);
		
		AA bb = new BB();// 부모 = 자식
		bb.disp();
		System.out.println("bb : "+bb.a); // 3 -> 필드 a 는 Override 가 없기때문에 AA 클래스에있는 a 출력
		System.out.println();
		
		BB dd = (BB)bb; // 자식 = (자식)부모 casting 
		dd.disp();//18
		System.out.println("dd : " + dd.a);//18
		System.out.println();
		
		AA cc = new AA();// 부모 = 자식
		cc.disp();
		System.out.println("cc : "+cc.a); // 3 -> 필드 a 는 Override 가 없기때문에 AA 클래스에있는 a 출력
		System.out.println();
	
	}
}
