package sample;

import java.awt.print.Printable;

public class Calc {

	public static void main(String[] args) {
	var num1 = 100;
	var num2 = 10;
	
	//足し算
	var result1 = num1+num2;
	System.out.println("num1+num2="+result1);
	//引き算
	var result2 = num1-num2;
	System.out.println("num1-num2="+result2);
	//割り算
	var result3 = num1/num2;
	System.out.println("num1/num2="+result3);
	//剰余
	var result4 = num1%num2;
	System.out.println("num1%num2="+result4);
	
	num1=10;
	num2=5;
	
	var result5 = num1 ++;
	System.out.println(result5);
	//１０＋１＝１１になるはずでは？
	
	
	
     
      
	
	
	}

}
