public class PracticeJava4{
    public static void main(String[] args){
        short s=100;
        int i=s;
        System.out.println("i="+ i);
        char s2=(char)i;//キャストをすることで型を変えられる
        System.out.println("i(char)="+s2);
        int i2=(int)s2;//キャストをすることで型を変えられる
        System.out.println("i(int)="+i2);

        Comic comic = new Comic(100);
        comic.output();
        Book book = comic;//子⇒親：キャスト不要
        book.output();
        Comic castComic = (Comic)book;//親⇒子：キャスト必要

        System.out.println("comic = -Book-?:"+(comic instanceof Book));//instanceofを使って型を判別
        System.out.println("comic = -Comic-?:"+(comic instanceof Comic));
    }
} 

class Book{
    int i;
    Book(int i){
        this.i = i;
    }
    void output(){
        System.out.println("i="+i);
    }
}
class Comic extends Book{
    Comic(int i){
        super(i);
    }
}