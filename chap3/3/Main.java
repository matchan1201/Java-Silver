public class Main {
  public static void main(String[] args) {
    int a = 10, b = 10, c = 10, d = 10;
    System.out.println(a++); //aを表示してから、インクリメント処理をしている。
    System.out.println(++b); //インクリメント処理をしてから、bを表示している
    System.out.println(c--);
    System.out.println(--d);
    System.out.println(a);
  
    a = 10; b = 10; c = 10; d = 10;
    b = ++a; //前置
    System.out.println("a = " + a + "b = " + b);
    d = c++; //後置
    System.out.println("c = " + c + "d = " + d);
  }
}