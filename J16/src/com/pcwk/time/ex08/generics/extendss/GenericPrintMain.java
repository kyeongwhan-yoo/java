package com.pcwk.time.ex08.generics.extendss;

import java.util.Collection;

public class GenericPrintMain {

	public static void main(String[] args) {
		//Powder type GenericPrint 생성
		//GenericPrint<Powder> powderPrinter =new GenericPrint<>();
		
		
		//Poeder getXXX(), setXXX()
		GenericPrint<Powder> powderPrinter =new GenericPrint<Powder>();
		
		//setMaterial
		powderPrinter.setMaterial(new Powder());
		
		//getXXX()
		Powder powder = powderPrinter.getMaterial();
		System.out.println("powder : "+powder);
		
		//재료는 Powder 입니다.
		System.out.println(powderPrinter.toString());
		

		//Plastic getXXX(), setXXX()
		GenericPrint<Plastic> plasticPrinter = new GenericPrint<>();
		plasticPrinter.setMaterial(new Plastic());
		
		System.out.println("plasticPrinter : "+plasticPrinter);
	
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println("Plastic : "+plastic);//plastic.toString()
		

		
	}

}
