class Dog {
	int number;
	String name;
	int weight;
	int age;
}

public class Tutorial13 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.number = 1;
		dog1.name = "Szarik";
		dog1.weight = 12;
		dog1.age = 4;

		Dog dog2 = new Dog();
		dog2.number = 2;
		dog2.name = "Pimpek";
		dog2.weight = 10;
		dog2.age = 2;

		System.out.println("Pies numer " + dog1.number + " to " + dog1.name + ", \n" + dog1.name + " waży " + dog1.weight + "kg i ma " + dog1.age + " lat.\n");
		System.out.println("Pies numer " + dog2.number + " to " + dog2.name + ", \n" + dog2.name + " waży " + dog2.weight + "kg i ma " + dog2.age + " lat.\n");

	}
}
