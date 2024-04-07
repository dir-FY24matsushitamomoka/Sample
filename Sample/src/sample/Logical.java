package sample;

public class Logical {

	public static void main(String[] args) {
		int score=59; //成績
		//And演算子
		System.out.println("scoreが４０以上かつ５０以下:");
		System.out.println(score>=40&&score<=50);
		//or演算子
		System.out.println("scoreが４０以上または５０以下：");
		System.out.println(score>=40||score<=50);
		//Not演算子
	    System.out.println("scoreが６０以上ではない:");
	    System.out.println(!(score>=60));
	    
		

		
		

	}

}
