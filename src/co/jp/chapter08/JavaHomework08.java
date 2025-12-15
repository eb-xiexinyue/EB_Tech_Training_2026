package co.jp.chapter08;

import co.jp.chapter09.JavaHomework09;

public class JavaHomework08 {

	public static void main(String[] args) {
        // 質問１︓以下コードの出⼒するを回答してください。
        String x = "a";
        String y = "a";
        System.out.println(x == y);      // true　x == y は、オブジェクトのアドレスを比較する。
                                         // 文字列リテラル "a" は文字列プールに保存されるため、
                                         // xとyは同じ String オブジェクトを参照している。
                                         // そのため、trueになる。
        System.out.println(x.equals(y)); // true　equals()は文字列の内容を比較するメソッドである。
                                         // xもyも内容がaであるためtrueである。

        String empty = "";
        String nullString = null;
        System.out.println(nullString.equals(empty));
        // 実行すると'NullPointerException' とエラーが出る。
        // 理由として、nullStringがnullであり、参照が何も指していない状態のため、メソッドを呼び出せない。

         // 質問２︓以下コードの出⼒を回答してください
         // Employee.java
//        public class Employee {
//            private String id;
//            public Employee(String id) {
//                this.id = id;
//            }
//            @Override
//            public boolean equals(Object another) {
//                if (another instanceof Employee) {
//                    Employee an = (Employee) another;
//                    return an.id.equals(id);

//                }
//                return false;
//            }
//        }
          // Kicker.java
//        public class Kicker {
//            public static void main(String...args) {
//                Employee x = new Employee("1234");
//                Employee y = new Employee("1234");
//                System.out.println(x == y); // false　xとyはそれぞれ別々に生成された違うインスタンスのためfalseである。
//                System.out.println(x.equals(y)); // true　yがEmployeeのインスタンスであるため、
                                                   // id内容の比較に入る。idの内容が同じであるため、trueになる。
//            }

        }

}
//        質問３︓以下コンパイルを修正してください。
class Parent {
    public void hello() {
        System.out.println("parent method");
    }
}
// Child.java
class Child extends Parent {
    @Override
    public void hello() {
        System.out.println("child method");
    }
}

// Kicker.java
class Kicker {
    public static void print(Parent v) { // 引数の型をChildからParentに変更することで、
                                         // ParentとChildのインスタンスを両方受け取れる。
                                         // 実行時には、実際のオブジェクトの型に応じてそれぞれのhello()が呼び出される。
        v.hello();
    }
    public static void main(String...args) {
        print(new Parent());
        print(new Child());
    }
}