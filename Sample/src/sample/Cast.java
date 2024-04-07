package sample;

public class Cast {

	public static void main(String[] args) {
	var a = 3;
	var b = 2;
	System.out.println(a/b);
	//小数点以下は切り捨てになった
	
	System.out.println((double)a/b);
	//これはaをdouble型にキャストしてから割り算。つまり３．０/２＝１．５と同じ。
	
	System.out.println((double)(a/b));
	//これはa/bの答えをdouble型にキャストしている
	
	
	
	

	}

}
