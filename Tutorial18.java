class Machine {
	private String name;
	private int age;

	public Machine() {
		this("Suka");
		System.out.println("Constructor running!");

		name = "Stefcia";
	}

	public Machine(String name) {
		this("Suka", 3);
		System.out.println("Second constructor running");
		this.name = name;
	}

	public Machine(String name, int age) {
		
		System.out.println("Third constructor running");
		
	}
}

public class Tutorial18 {
	public static void main(String[] args) {
		new Machine("sss");

	}
}
