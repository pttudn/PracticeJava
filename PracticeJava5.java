public class PracticeJava5{
    public static void main(String[] args){
        Chara.print();
        Chara.name = "Tarou";
        Chara.print();
        Chara ch = new Chara();
        ch.name = "Zirou";
        Chara.print();//nameはstatic変数なのでCharaのnameも変更される
        ch.print();//nameはstatic変数なのでオブジェクト内に個別に管理できない

        System.out.println("--------------------------");

        System.out.println(Chara.name+" is "+Chara.sex);


    }
}
class Chara{
    static String name;
    final static String sex = "male";//final変数：書き換え不能
    //sex = "female";⇒エラー//final変数は書き換えできない
    static void print(){
        System.out.println("My name is "+name);
    }
    static {//staticイニシャライザ：初めて利用されたときに呼び出し
        name = "Saburou";
        System.out.println("----");
    }
}