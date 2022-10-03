package inheritance;

enum Color{
	RED, GREEN, BLUE
}


class Final{
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "사자"; 
	public static final String ANIMAL2;
	
	//public static final int RED = 0;
	//public static final int GREEN = 1;
	//public static final int BLUE = 2;
	
	
	static{
		ANIMAL2 = "기린";	
	}
	public Final() {
		FRUIT2 = "딸기";
	}
	
	
	
}

//-------------------
public class FinalMain {

	public static void main(String[] args) {
		
		final int AGE = 10;
		//AGE++; -> error 값을 변경할 수 없다. 
		System.out.println("AGE = " + AGE);
		
		final int AGE2;
		AGE2 = 20;
		//AGE2 = 30; -> error 
		System.out.println("AGE2 = " + AGE2);
		System.out.println();
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		System.out.println();
		
		System.out.println("ANIMAL = " + f.ANIMAL);
		System.out.println("ANIMAL2 = " + f.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());
		System.out.println();
		
		for(Color data : Color.values()) {
			System.out.print(data+" " + data.ordinal());
			System.out.println();
		}
		
		
	}

}
