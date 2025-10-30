package JavaChapter03;

public class JavaHomework03_XIAOJINGZHUO {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ---- 第1問 ----
        int a = 56;
        System.out.println("成績ランキング判断。入力値 = " + a);

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        // ---- 第2問 ----
        int total = 3340;
        int count_1 = 0;
        int count_5 = 0;
        int count_10 = 0;
        int count_100 = 0;
        int count_500 = 0;

        while (total > 0) {
            if (total >= 500) {
                total -= 500;
                count_500++;
                continue;
            }
            if (total >= 100) {
                total -= 100;
                count_100++;
                continue;
            }
            if (total >= 10) {
                total -= 10;
                count_10++;
                continue;
            }
            if (total >= 5) {
                total -= 5;
                count_5++;
                continue;
            }
            if (total >= 1) {
                total -= 1;
                count_1++;
                continue;
            }
        }

        System.out.println("500円のコイン数は: " + count_500);
        System.out.println("100円のコイン数は: " + count_100);
        System.out.println("10円のコイン数は: " + count_10);
        System.out.println("5円のコイン数は: " + count_5);
        System.out.println("1円のコイン数は: " + count_1);

        // ---- 第3問 ----
        int len = 9;

        for (int i = 0; i < len; i++) {
            String str = "";
            for (int j = 0; j < len; j++) {
                if (i + j == 4 || i + j == 12 || i == j + 4 || j == i + 4) {
                    str = str + i + j;
                }
                str = str + "\t";
            }
            System.out.println(str);
        }

    }
}

