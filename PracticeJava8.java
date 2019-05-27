public class PracticeJava8{
    public static void main(String[] args){//内部クラス
        Ext ext = new Ext();//外側のクラスをインスタンス化
        Ext.Inner inner = ext.new Inner();//さらにその内側のクラスをインスタンス化
        inner.print();
        Ext2.Inner2 inner2 = new Ext2.Inner2();//staticを付与すると外側のクラスをインスタンス化しなくても直接インスタンス化できる
        inner2.print();
    }
}
class Ext{
    private int num = 100;
    class Inner{
        int num = 50;
        void print(){
            System.out.println("==内部クラス==");
            System.out.println("this.num="+this.num);
            System.out.println("Ext.this.num="+Ext.this.num);
        }
    }
}
class Ext2{
    private static int num = 100;
    static class Inner2{
        int num = 50;
        void print(){
            System.out.println("==内部クラス2==");
            System.out.println("this.num="+this.num);
            System.out.println("Ext.num="+ Ext2.num);
        }
    }
}