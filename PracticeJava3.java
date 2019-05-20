public class PracticeJava3{
    public static void main(String[] args){
        Player playerA = new Player(30);//クラスからインスタンスplayerAを生成
        playerA.printHP();
    }

}

class Chara{//スーパークラス
    int hp;
    Chara(int hp){
        this.hp = hp;
    }
    void printHP(){//メソッド
        System.out.println("HP＝"+ hp);
    }
}

class Player extends Chara{//子クラス
    Player(int hp){//親クラスのメンバーをそのまま使える
        super(hp + 50);
    }
    @Override//オーバーライドしていることを明示
    void printHP(){//メソッドprintHPをオーバーライド
        System.out.println("Player HP="+ hp);
    }
}
