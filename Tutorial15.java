class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name);
	}
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	
}
public class Tutorial15 {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Slim Shady";
		person1.age = 30;
		person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		System.out.println("Lat do emeryturki: " + years);
		
		int age = person1.getAge();
		System.out.println("Zią ma tyle lat: " + age);
		
		System.out.println("Tyle też: " + person1.age);
	}
}
