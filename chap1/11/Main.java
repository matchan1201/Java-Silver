public class Main {
  public static void main(String[] args) {
    int[][] array;
    array = new int[3][4]; // 縦三つ、横四つの長方形を作る
    // int[][] array = new int[3][4];
    array[0][0] = 100;// 0番の0番目を指定
    array[0][3] = 200;// 縦0番の横3番目を指定。
    System.out.println("array[0][0]の値 :" + array[0][0]);
    System.out.println("array[0][3]の値 :" + array[0][3]);
    System.out.println(array.length); //配列の縦の長さ
    System.out.println(array[0].length);// 配列の横の長さ
  }
}