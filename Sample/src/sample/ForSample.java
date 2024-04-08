package sample;

public class ForSample {

	public static void main(String[] args) {
	for (var i = 1; i<=10; i++) {
		System.out.println(i);
		
	}

	//初期化式と条件式、変化式を変更した書き方
	for (int i = 2; i<=20; i+=2 ) {
		System.out.println(i);
	}
	
	//if文と組合せた書き方
	for (int i = 1; i<=20; i++) {
		if (i%2==0) {
			System.out.println(i);
			
		}

	//出力処理で対応した書き方
	for (int a =1; a<=10; a++) {
	
		System.out.println(a*2);
	}
	
	for (int n = 1; n <= 20; n++) {
	    if (n % 2 != 0) {
	        // 現在の処理をスキップし、次の繰り返しに進む
	        continue;
	    }
	    System.out.println(n);
	}
	for (int t = 2; t <= 100; t+=2) {
	    if (t > 20) {
	        // 繰り返しから抜け出す
	        break;
	    }
	    System.out.println(t);            
	}
	}
	
	}

}
