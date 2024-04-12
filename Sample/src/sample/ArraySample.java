package sample;

public class ArraySample {

	public static void main(String[] args) {
		var numbers = new int[5];    //数字を５つ格納できる箱を５つ用意

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // 配列の各要素に値を代入
        }                              
        
        //forの繰り返しループを使い、箱に数字をいれる
        //　i<numbers.length　　このnumbersは上で代入している５　
        //i<5　つまり　iは0から４まで増加しつづける

        // 配列の要素を表示
        for (var i = 0; i < numbers.length; i++) {            //for(初期化式；条件式；変化式){条件式をくりかえしtrueならメソッドを実行する}｝
            System.out.println(numbers[i]);
        }
    }

	}

