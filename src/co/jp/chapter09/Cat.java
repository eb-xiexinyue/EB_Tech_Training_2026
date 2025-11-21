package co.jp.chapter09;

public class Cat extends BasePet implements Ipet, IAnimal{

	@Override
	public void hello() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello from cat");
	}

	@Override
	public void Ihello(String str) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Ihello from cat(implements Ipet)");
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("running (implements IAnimal)");
	}

}
