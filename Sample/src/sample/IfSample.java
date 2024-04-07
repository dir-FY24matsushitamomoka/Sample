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

	}

}
