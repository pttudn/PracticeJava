public class PracticeJava11{
    public static void main(String[] args){
        Setter<String> s = new Setter<String>();//String型にもなる
        s.data = "10";
        System.out.println(s.data);

        Setter<Boolean> s2 = new Setter<Boolean>();//Boolean型にもなる
        s2.data = true;
        System.out.println(s2.data);
    
        print(350);//int型を表示
        print(true);//Boolean型を表示
    }

    static <T> void print(T data){//総称型メソッド
        System.out.println(data);
    }

}

class Setter<T>{//総称型クラス
    T data;
}