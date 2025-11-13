package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human h = new Human("Peter");
		h = new Human("new Peter");
		
		Human h1;
		h1 = new Human("Jay");
//		h1.name = "john";
		h1.age = 5;
		h1.gender = 1;
		
//		System.out.println(h.name);
		
//		h.callMyName();
		
		h.setName("John");
//		h.callMyName();
		
//		Human h2 = h.createHuman();
		
		Pet cat = new Pet("cat");
		Pet dog = new Pet("dog", 5);
		
		cat.setName("cat");
		cat.setAge(2);
		
		dog.setName("dog");
		dog.setAge(5);
		
		Pet.run();
		System.out.println(Pet.startAge);
//		Pet.startAge = 10;
		System.out.println(Pet.startAge);
		
		Pet bird = new Pet("bird");
		System.out.println(bird.startAge);
	}

}
