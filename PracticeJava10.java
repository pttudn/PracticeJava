public class PracticeJava10{
    public static void main(String[] args){
        Chara ch1 = (int i) -> { //ラムダ式:その場でインターフェースの処理を実装
            System.out.println("Chara"+i);//「(引数)->{実装内容}」 型は自動判別、intは省略可能
        };
        ch1.move(1);

        Chara ch2 = i -> System.out.println("Chara"+i);//一行なら{}も短縮可能
        ch2.move(2);
        
        Chara ch3 = PracticeJava10::ref;//メソッド参照:すでに存在するメソッドを利用する　staticメソッドなら「クラス::メソッド名」
        ch3.move(3);
    }

    //インスタンスメソッドを参照するなら「変数::メソッド名」
    //コンストラクタを参照するなら「クラス名::new」

    static void ref(int num){//staticメソッド
        System.out.println("Chara"+num);
    }
}
@FunctionalInterface
interface Chara{//インターフェース：抽象クラスに似ている、多重継承可能
    void move(int num);//抽象メソッド
}