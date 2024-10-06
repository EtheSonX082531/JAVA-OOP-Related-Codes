public class Main {
	abstract public static class Animal {
		public void walk() {
			System.out.println("Can Walk..");
		}
	}

	public static class Horse extends Animal {
		public void walk() {
			System.out.println("Can Walk on 4 legs...");
		}
	}

	public static class Snake extends Animal {

	}

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.walk();
		Snake s1 = new Snake();
		s1.walk();
	}
}
