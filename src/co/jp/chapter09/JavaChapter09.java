package co.jp.chapter09;

public class JavaChapter09 {
	public static class Dog implements Ipet{

		@Override
		public void Ihello(String str) {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("Ihello from inner class Dog(implements Ipet)");
		}
		
	}
	
	public static void main(String[] args) {
//		Cat cat = new Cat();
//		cat.print();
//		cat.hello();
//		cat.Ihello();
//		Dog dog  =  new Dog();
//		
//		dog.Ihello();
		
//		Ipet ipet = new Ipet() {
//			public String str = "ipet";
//			
//			@Override
//			public void Ihello() {
//				// TODO 自動生成されたメソッド・スタブ
//				System.out.println("Ihello from "+str+"(implements Ipet)");
//			}
//		};
//		
//		ipet.Ihello();
		
		Ipet rIpet = (String str) -> {
			System.out.println("Ihello from "+ str +"(implements Ipet)");
		};
		
		rIpet.Ihello("demo");
	}
}
