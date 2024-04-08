package sample;

public class IfSample {

	public static void main(String[] args) {
	var score = 80; //成績
	if (score >= 60) {
	System.out.println("合格です！");
	}
	
	score = 50;
	if(score>=60) {
	System.out.println("合格です！");
	}
	//60点以上の条件のため、falseとなり結果は表示されない
	
	score =-60; //成績
	if (score>=60) {
		System.out.println("合格です！");
		
	}
	else {
		System.out.println("赤点です。。。");
	}
	
	score=100 ;
	if (score==100) {
		System.out.println("満点です！");
		
	}
	else if (score>=80) {
		System.out.println("よくできました！");
		
	}
	else if (score>=60){
		System.out.println("合格です！");
		
	}
	else {
		System.out.println("赤点です。。。");
	}
	
	}

	}

