package com.gmail.ycidenis;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat("Viskas",11,"black","dvorniaga",15.5);
		System.out.println("���: " +catOne.getName());
		System.out.println("�������: " +catOne.getOld());
		System.out.println("������ ������: " +catOne.getTailLength());
		catOne.battle();
		catOne.voice();
		catOne.sleeping();

	}

}
