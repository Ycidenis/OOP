package com.gmail.ycidenis;

public class Cat {
private String name;
private int old;
private String color;
private String type;
private double tailLength;
public Cat(String name, int old, String color, String type, double tailLength) {
	super();
	this.name = name;
	this.old = old;
	this.color = color;
	this.type = type;
	this.tailLength = tailLength;
}
public Cat() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getOld() {
	return old;
}
public void setOld(int old) {
	this.old = old;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getTailLength() {
	return tailLength;
}
public void setTailLength(double tailLength) {
	this.tailLength = tailLength;
}
public void voice (){
	System.out.println("May-May");
}
public void battle() {
	System.out.println("KHSSSSSSSSS");
}
public void eat(){
	System.out.println("Khrym-khrym");
}
public void sleeping(){
	System.out.println("...");
}
}
