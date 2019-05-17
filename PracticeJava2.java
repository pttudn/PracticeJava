public class Test{
    public static void main(String[] args){
        
        view("ポテトうどん",1); //別のメソッドの呼び出し
        view("讃岐うどん",5);
        view("きつねうどん",8);
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////
       
        process("ポテトうどん","きつねうどん");//可変因数を引数とするメソッドの呼び出し
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////
       
        //クラスを呼び出して実体を作成（インスタンス化）
        UdonStatus udon1 = new UdonStatus("ポテトうどん");
        udon1.price = 250;
        udon1.satisfaction = 100;
        udon1.printInt();
        UdonStatus udon2 = new UdonStatus("讃岐うどん");
        udon2.price = 180;
        udon2.satisfaction = 20;
        udon2.printInt();
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////
       
        Topping wakame = new Topping("ワカメ");
        wakame.print("おいしい");
        wakame.print("おいしい","おいしい"); 

    }

    //メソッド
    //アクセス修飾子　（static）　戻り値　メソッド数（因数）｛｝
    static void view(String target,int viewNum){
        System.out.println("---メッセージ表示---");
        for(int i=0;i<viewNum;i++){
            System.out.println(target);
        }
        System.out.println("---表示完了---");
    }

    //可変引数をもつメソッド
    static void process(String... names){
        for (String n : names){
            System.out.println(n);
        }
    }
}

class UdonStatus{
    String name;
    int price;
    int satisfaction;
    //コンストラクタ
    UdonStatus(String inputname){
        name = inputname;
    }
    //インスタンスイニシャライザ
    {
        System.out.println("ーーーーーーーーーーーーーーーーーーー");
    }
    //クラス内のメソッド（クラスメソッド）
    void printInt(){
    System.out.println(name+"は"+price+"円。"+satisfaction+"％の満足度です！");
    }
}

class Topping{
    Topping(String name){
        this(name,30);
    }
    Topping(String name,int i){
        System.out.println(name+"は"+i+"円です");
    }

    //同じ名前のメソッドを並べれる。自動判別される（オーバーロード）
    void print(String name1,String name2){
        System.out.println("わかめは"+name1+"し"+name2);
    }
    void print(String name){
        System.out.println("わかめは"+name);
    }
}