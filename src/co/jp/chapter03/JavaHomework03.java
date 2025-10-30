package co.jp.chapter03;

public class JavaHomework03 {

	public static void main(String[] args) {

//問1
        int a = 56;
        System.out.println("成績ランキング判断。入力値=" + a);

        if(a >= 90) {
            System.out.println("A");
        } else if(a >= 80) {
            System.out.println("B");
        } else if(a >= 70) {
            System.out.println("C");
        } else if(a  >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
//問2
        int price = 3340;//総額
        int coin_num = 0;//コインの総枚数
        boolean onlyCoin = true;//コインのみで支払うかどうか

        if(onlyCoin) {
            int coin_500 = price / 500;//500円コインの枚数：6枚
            price = price % 500;//500円コインを使った後の残額340円をpriceに代入する
            coin_num += coin_500;//500円コインの枚数を総数に加える

            int coin_100 = price / 100;
            price = price % 100;
            coin_num += coin_100;

            int coin_50 = price / 50;
            price = price % 50;
            coin_num += coin_50;

            int coin_10 = price / 10;
            price = price % 10;
            coin_num += coin_10;

            int coin_5 = price / 5;
            price = price % 5;
            coin_num += coin_5;

            int coin_1 = price / 1;
            price = price % 1;
            coin_num += coin_1;

            System.out.println("3340円をコインのみで支払われる場合、枚数は" + coin_num + "枚です。");
        } //出力：3340円をコインのみで支払われる場合、枚数は13枚です。

//問3
        int len = 9;

        for(int i=0;i<len;i++) {
            String str = "";
            for (int j = 0; j < len; j++) {
                if (i + j == 4 || i + j == 12 || j - i == 4 || i - j == 4) {
                    str = str + i + j;
                }
                str = str + "\t";
            }
            System.out.println(str);
        }

    }

}
