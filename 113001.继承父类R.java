package pac;

public class App extends R{
	public static void main(String[] args) {
		HuaBei();
		int [][]array2d= {
				{1,2},
				{3,4},
				{5,6}
				};
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				System.out.print(array2d[row][column]+" ");
			}
			System.out.println();
		}
	}
}


package pac;

public class R {
  static void HuaBei(){
      String boy_filePath="img/boy.gif";
      String girl_filePath="img/girl.gif";
  }
}
