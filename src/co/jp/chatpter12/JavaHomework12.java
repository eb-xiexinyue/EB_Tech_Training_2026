package co.jp.chatpter12;

public class JavaHomework12 {

    //12．例外の問題
    // 質問1：︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生します。該当例外を処理するサンプルコードを書いてください。
	public static void arrayExceptionTest() {

        int[] nums = {10, 20, 30};

        try {
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外を参照しました: " + e.getMessage());
        }

        System.out.println("プログラム終了");
    }

    // 質問2：ValidationExceptionを作成して、ユーザー入力した値を検証します。該当は実際商用アプリで利用しています。
	//STEP1 : ValidationException クラスを定義する
    static class ValidationException extends Exception {

        private String name;
        private String message;

        public ValidationException(String name, String message) {
            this.name = name;
            this.message = message;
        }

        @Override
        public String getMessage() {
            return name + "：" + message;
        }
    }
    //STEP2 : チェック処理（サンプル）
    public static void validationTest() {

        String name = "※※※";

        try {
            if (!name.matches("^[0-9A-Za-z]+$")) {
                throw new ValidationException("名称", "半角英数字を入力してください。");
            }
            System.out.println("入力OK！");
        } catch (ValidationException e) {
            System.out.println("エラー：" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("質問1の実行");
        arrayExceptionTest();

        System.out.println("\n質問2の実行");
        validationTest();

    }
}
