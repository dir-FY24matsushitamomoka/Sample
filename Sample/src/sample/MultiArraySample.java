package sample;

public class MultiArraySample {

	public static void main(String[] args) {
	
		var matrix = new int [3][4];//
		//３行４列のマトリクスを用意する
		
		for (var i = 0; i<matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=i*3+j+1; //値の代入
			}
		}
		
//外側ループ　iの初期値は0、iは行数３より小さいため、次の内側ループの処理に入る。i++の処理はループ終了後のためi=０のまま
//内側ループ　ｊの初期値は0、iは列数4より小さいため、次の処理へ。
//matrix.lengthは行列、matrix[i].lengthは列数（i行の長さ＝列）。
//matrix[i][j]=[0][0]=0*3+0+1=1
//0行0列めは１
//次のループ時には内側ループj++よりj=1 
//matrix[0][1]=2
//0行1列めは２
		
		
		
		for (var i = 0; i<matrix.length; i++) {
			for (var j = 0; j < matrix[i].length; j++) {
				System.out.print (matrix[i][j]+"　");
				//結果を改行なしで表示＋１行空け
				
	}
			System.out.println();
			//結果を改行ありで表示＋１行空け
		}
	}
}
