class Test{
    public static void main(String[] args){
        System.out.println("ポテトうどん大好き。");
        System.out.print("ターミナルの文字化けが完璧には治らない。");
        System.out.print("一部の文字が？になっている。");
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////
        
        String name = "ポテトうどん"; //説明する名前
        String subject = "制作者"; //説明する対象
        System.out.print(subject+"の名前は"+name); /* 対象の名前を表示する */
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////

        int[] datalist = new int[3]; //1次配列
        datalist[0] = 30;
        datalist[1] = 2;
        System.out.println("datalist[0] = "+datalist[0]);//データセットの1つ目の数字を表示
        System.out.println("datalist[2] = "+datalist[2]);//データセットの3つ目の数字（空のはず）を表示
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////

        int[][] intList= { //2次配列
            {30,50}
            ,{10,20,40}
        };
        System.out.println("intlist[0][1] = "+intList[0][1]);
        System.out.println("intlist[1][1] = "+intList[1][1]);
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////

        int mymoney = 300;//あなたの所持金額
        int pttudnprice = 250;//ポテトうどんの値段
        boolean isOK = (mymoney >= pttudnprice);
        System.out.println("所持金額："+mymoney);
        System.out.println("ポテトうどんの価格："+pttudnprice);

        if (isOK){//isOKに対する条件文
            System.out.println("私はポテトうどんを買うことができます！");
        }else{
            System.out.println("私はポテトうどんを買うことができません…");
        }

        String text = isOK ? "おいしい！":"残念…";//三項演算子
        System.out.println(text);
        System.out.print("\r\n\r\n");//改行

        ////////////////////////////////////////

        int cnt =0;//カウント
        while (cnt < 10){//シンプルなアップカウント(while)
            cnt++;
            System.out.print(cnt);
        }
        System.out.println();

        cnt = 0;
        do{//シンプルなアップカウント（do~while）
            cnt++;
            System.out.print(cnt);
        }while(cnt<10);
        System.out.println();
        
        for(int i=0;i<10;i++){//シンプルなアップカウント（for）
            System.out.print(i);
        }
        System.out.println();

        int[] cntlist = {1,2,3,4,5,6,7,8,9,10};
        for(int i : cntlist ){//拡張for文
            System.out.print(i);
        }

        
    }
}