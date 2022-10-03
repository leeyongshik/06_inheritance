package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo 클래스의 tiger() 호출
		Zoo zoo = new Zoo();
		zoo.tigher();
		//zoo.lion(); -> lion 은 private 이므로 출력 할 수 없다. 
		//zoo.giraffe();
		//zoo.elephant();
		
		
	}

}
