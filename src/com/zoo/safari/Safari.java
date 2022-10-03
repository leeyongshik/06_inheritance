package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tigher();
		//zoo.giraffe(); -> 부모로 new 해서 사용 불가 
		//zoo.elephant(); -> default 라서 출력 불가
		//zoo.lion(); -> private 라서 출력 불가 
		
		Safari safari = new Safari();
		safari.tigher();
		safari.giraffe(); 
		//safari.elephant(); -> default 라서 출력 불가
		//safari.lion(); -> private 라서 출력 불가 
		
		
	}

}
