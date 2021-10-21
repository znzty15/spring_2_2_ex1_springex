package com.javaGG.ex;

public class Calculation {
	
	private int num1;
	private int num2;
	
	public void add() {
		System.out.println("add 메소드 실행");
		int rs = num1 + num2;
		System.out.println(num1 +  "+"  + num2 + "=" + rs );
	}
	
	public void sub() {
		System.out.println("sub 메소드 실행");
		int rs = num1 - num2;
		System.out.println(num1 +  "-"  + num2 + "=" + rs );
	}
	
	public void multi() {
		System.out.println("multi 메소드 실행");
		int rs = num1 * num2;
		System.out.println(num1 +  "*"  + num2 + "=" + rs );
	}
	
	public void div() {
		System.out.println("div 메소드 실행");
		int rs = num1 / num2;
		System.out.println(num1 +  "/"  + num2 + "=" + rs );
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}	

}