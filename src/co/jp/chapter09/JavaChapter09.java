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
		
//		Ipet rIpet = (String str1) -> {
//			System.out.println("Ihello from "+ str1 +"(implements Ipet)");
//		};
//		
//		rIpet.Ihello("demo");
		
//		Animal a1 = Animal.Dog;
		
//		switch(a1) {
//		case Dog:
//			System.out.println("a1 is Dog");
//			break;
//		case Cat:
//			System.out.println("a1 is Cat");
//			break;
//		default:
//			System.out.println("a1 is not Cat or Dog");
//			break;
//		}
//		
//		if(a1 == Animal.Dog) {
//			System.out.println("a1 is Dog(from if)");
//		}
		
//		for(Animal animal : Animal.values()) {
//			System.out.println(animal.name());
//		}
		
		Animal fromString = Animal.Dog;
		System.out.println(fromString.gender);
		System.out.println(fromString.description);
		fromString.printDescription();
	}
}

enum Animal{
	Cat(0,"this is a cat"),
	Dog(1,"this is a dog");
	
	final int gender;
	final String description;
	
	Animal(int gender, String description){
		this.gender = gender;
		this.description = description;
	}
	
	public void printDescription() {
		System.out.println("Description:"+this.description);
	}
}
