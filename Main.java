package com.gmail.ycidenis;

public class Main {

	public static void main(String[] args) {

		Cat catOne = new Cat("Viskas",11,"black","dvorniaga",15.5);
		System.out.println("Имя: " +catOne.getName());
		System.out.println("Возраст: " +catOne.getOld());
		System.out.println("Длинна хвоста: " +catOne.getTailLength());
		catOne.battle();
		catOne.voice();
		catOne.sleeping();

	}

}
