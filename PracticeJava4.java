public class PracticeJava4{
    public static void main(String[] args){
        short s=100;
        int i=s;
        System.out.println("i="+ i);
        char s2=(char)i;//�L���X�g�����邱�ƂŌ^��ς�����
        System.out.println("i(char)="+s2);
        int i2=(int)s2;//�L���X�g�����邱�ƂŌ^��ς�����
        System.out.println("i(int)="+i2);

        Comic comic = new Comic(100);
        comic.output();
        Book book = comic;//�q�ːe�F�L���X�g�s�v
        book.output();
        Comic castComic = (Comic)book;//�e�ˎq�F�L���X�g�K�v
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