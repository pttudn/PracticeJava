public class PracticeJava7{
    public static void main(String[] args){
        Chara PlayerA = new PlayerA();//インスタンス化
        PlayerA.move(); 
    }
}
abstract class Chara{//抽象クラス//とりあえず枠だけ作っておきましたってイメージ。以下で実装されていないとエラー
    abstract void move();//抽象メソッド
}
class PlayerA extends Chara{
    void move(){
        System.out.println("==移動アクション==");
    }
}