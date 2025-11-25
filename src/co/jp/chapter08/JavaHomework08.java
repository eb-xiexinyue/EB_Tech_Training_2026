package co.jp.chapter08;

public class JavaHomework08 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        //質問1：以下のコードの出力を回答してください。
        String x = "a";
        String y = "a";
        System.out.println(x==y);          // true
        // 原因：Stringリテラルは同じ値の場合、Stringプールを共有するため参照先が同じになる。
        
        System.out.println(x.equals(y));   // true
        // 原因：equals()は文字列の内容を比較するため、内容が同じのでtrue
        
        String empty = "";
        String nullString = null;
        System.out.println(nullString.equals(empty)); 
        // ➜ 実行すると NullPointerException
        // 原因：nullStringがnullのため、メソッド呼び出し(nullString.equals())ができず例外が発生する。
        

        //質問2：以下のコードの出力を回答してください。
        class Employee{
            private String id;
            public Employee(String id) {
                this.id = id;
            }
            @Override
            public boolean equals(Object another) {
                if(another instanceof Employee) {
                    Employee an = (Employee)another;
                    return an.id.equals(id);
                }
                return false;
            }
            
        }
        
        class Kicker{
            public static void main(String...args) {
                Employee x = new Employee("1234");
                Employee y = new Employee("1234");
                
                System.out.println(x==y);     // false
                // 原因：newで作成された別々のインスタンスなので、参照先が異なる
                
                System.out.println(x.equals(y)); // true
                // 原因：equals()によりidの内容比較が行われ、内容が同じ("1234")ためtrue
                
            }
        }
        
        
        //質問3：以下コンパイルを修正して下し
        class Parent {
            public void hello() {
                System.out.println("parent method");
            }
        }
        
        class Child extends Parent {
            @Override
            public void hello() {
                System.out.println("child method");
            }
        }
        
        class Kicker1 {
            public static void print(Parent v) {//Child → Parentに変更
            // printメソッドの引数がChild型のままだとParent型を渡せないためコンパイルエラー。
           	// Parent型に変更することで多態性が成立し、ParentもChildも受け取れるようになる。

                v.hello();
            }

            public static void main(String... args) {
                print(new Parent());
                print(new Child());
            }
        }
        
    }
}
