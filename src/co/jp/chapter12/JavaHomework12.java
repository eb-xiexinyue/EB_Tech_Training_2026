package co.jp.chapter12;

public class JavaHomework12 {
    // 質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣
    // します。該当例外を処理するサンプルコードを書いてください。
    static void arrayException() {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：配列の範囲外にアクセスしました。");
            System.out.println("詳細：" + e.getMessage());
        }

        System.out.println("プログラムは正常に終了しました。");
    }

    // 質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。
    static class ValidationException extends Exception {
        private String name;    // カラム名称
        private String message; // エラーメッセージ

        // コンストラクタ
        public ValidationException(String name, String message) {
            super(message);
            this.name = name;
            this.message = message;
        }
        @Override
        public String getMessage() {
            return "入力エラー： [" +  this.name + "] " + this.message;
        }
    }

    // ユーザー入力のバリデーション例
    static void validateInput(String input) {
        try {
            // 英字のみ許可の例
            if (!input.matches("^[0-9]+$")) {
                throw new ValidationException("名称", "半角数字を入力してください。");
            }
            System.out.println("入力は正しいです: " + input);

        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("質問1: 配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外");
        arrayException();

        System.out.println("\n質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。");
        validateInput("Validation");


    }
}

