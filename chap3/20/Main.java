public class Main {
  public static void main(String[] args) {
    int num = 2;
    switch(num){
      case 1:
        System.out.println("numの値は1です。");
        break; //breakによりswitchから抜ける
      case 2:
        System.out.println("numの値は2です。");
        //break文が無いため、次のdefaultの処理文も実行
      default:
        System.out.println("defaultです。");
    }
  }
}