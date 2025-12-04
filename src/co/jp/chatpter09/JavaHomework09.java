package co.jp.chatpter09;

public class JavaHomework09 {
	
	//09 OOP　練習問題
	//質問1：クラス（Class）とは？
	//       クラス定義用のキーワードは「Class」である
	
	//質問2：クラスメンバ(Class member)の何種類ありますか？
	//       1．属性・フィールド(Field)
	//       2．関数(Function)・メソッド(Method)・操作(Operator)
	
	//質問3：クラスメンバの関数は特殊の関数「コンストラクタ」が持っています。
	
	//質問4：コンストラクタの特徴
	//　　　1．戻り値不要
	//　　　2．関数名＝クラス名称
	
	//質問5：コンストラクタの作用：クラス属性の初期化する。
	
	//質問6：1つクラスに複数のコンストラクタ持つ可能
	
	//質問7：キーワードthisの使用方法？this.name?name?
	//    public class people{
	//      private String name;
	//      public void setName(String name){
	//          this.name = name;
	//        }
	//     }
	// 説明：this.nameはクラスのフィールド、nameはメソッドの引数。同じ変数名の時、区別するためにthisを使う
	
	//質問8：クラスを利用する為、インスタンス化する必要です。インスタンスの演算子は「new」です
	
	//質問9：演算子newの直後呼び出しているメソッドは「コンストラクタ」；
	//　　　1．people obj = new People();   この場合はPeopleがコンストラクタ
	
	//質問10：アクセス制御の3種類あります。
	//　　　1．+ public
	//　　　2．# protected
	//　　　3．- private
	
	//質問11．静的メンバの定義するキーワード(修飾子)はstatic
	
	//質問12．静的メンバアクセス時、インスタンス化不要。アクセス方法は「クラス名.静的メンバ」。
	//　　　1　System.out.println("1234"); //静的のField
	//　　　2　String value = String.format("%05d",0); //静的のメソッド
	
	//質問13：クラス「Animal」を定義して、インスタンス化オブジェクトcatを作成します。変数catのsayHello()メソッドを呼び出してください。
	//　　　1．属性：年齢
	//　　　2．属性：名前
	//　　　3．属性：分類
	//　　　4．コンストラクタ：名前を渡して、初期化する
	//　　　5．操作：sayHello():void
	//　　　6。操作：getName():String自分の名称を返す
	static class Animal {

		private int age;       // 年齢
		private String name;   // 名前
		private String type;   // 分類

		public Animal(String name) {
			this.name = name;
		}

		public void sayHello() {
			System.out.println("Hello!");
		}

		public String getName() {
			return this.name;
		}
	}
	
    //質問14：以下の1行を解釈してください。
    //     1．System.out.println(new Animal("cat").getName());
    //   解答：Animal オブジェクトを作って、その名前を取得して表示している
    
    //質問15：クラスス継承する用キーワードは「extends」
    
    //質問16：継承しているクラス。上位クラスは「親クラス」・「スーパークラス」。下位クラスは「サブクラス」と呼びます。
    
    //質問17：サブクラス＆アクセス制御(public,protected)。
    //   説明：サブクラスは public と protected のメンバにアクセスできる      

    //質問18：サブクラスと親クラス同じメソッド名かつメソッドの引数は一致する場合、「オーバーライド」となります。

    //質問19：以下Animalクラスを継承して以下2クラスを作成してください。
    //　　　1．クラスCat。sayHello メソッドをオーバーライドして、System.out.println("ニャー");
    //　　　2．クラスDog。sayHelloメソッドをオーバーライドして、System.out.println("ワン");
	//Catクラス（Animalを継承）
	static class Cat extends Animal {
		public Cat(String name) {
			super(name);
		}
		@Override
		public void sayHello() {
			System.out.println("ニャー");
		}
	}

	//Dogクラス（Animalを継承）
	static class Dog extends Animal {
		public Dog(String name) {
			super(name);
		}
		@Override
		public void sayHello() {
			System.out.println("ワン");
		}
	}
	public static void main(String[] args) {
        Animal cat1 = new Animal("猫"); //質問13の出力
        cat1.sayHello();    //質問13の出力
        System.out.println(cat1.getName()); //質問13の出力
        
        
        Animal cat2 = new Cat("猫");
		Animal dog = new Dog("犬");
		
		cat2.sayHello(); 
		dog.sayHello(); 
        
		System.out.println(cat2.getName()); 
		System.out.println(dog.getName()); 
    }
}

    //質問20：以下コードをIS-A関係で説明してください。
    //　　　1．Animal v0 = new Animal();//v0はAnimal型
    //　　　2．Animal v1 = new Cat("a cat");//v1はCat型、v1はAnmal型　
    //　　　3．Animal v2 = new Dog("dog");//v2はDog型、v2はAnimal型
    //　　　4
    //　　　5．Cat v3 = new Cat("");//OK
    //　　　6．Dog v4 = new Dog("");//OK
    //　　　7
    //　　　8．Cat v5 = new Animal("");//NG
    //
    //Cat や Dog は Animal の一種、なので親クラス型の変数で参照できる。
    //しかし、Animal は Cat ではないので逆は不可。
 
