public class Main {
  public static void main(String[] args) {
    String s1 = "Hello";  //Helloを参照している
    String s2 = new String("Hello"); //あたらしい配列を作っている
    String s3 = "Hello";
    String s4 = s2.intern(); //s2.Helloを参照している
    System.out.println("s1 == s2  : " + (s1 == s2));
    System.out.println("s1 == s3  : " + (s1 == s3));
    System.out.println("s1 == s4  : " + (s1 == s4));
    System.out.println("s2 == s4  : " + (s2 == s4));
    // 参照先が違う場合にfalseがかえる
  }
}