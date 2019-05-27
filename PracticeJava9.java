public class PracticeJava9{
    public static void main(String[] args){
        Chara ch = new Chara(){//インスタンス化
            public void move(){//名前も付けずその場で処理を実装（楽）
                System.out.println("==匿名クラスの利用==");
            }
        };
        ch.move();
    }
}
abstract class Chara{//抽象クラス
    abstract void move();
}