package Static.java;

class Counter {
	int x;
	static int count = 0;

	// instance block : common code on creation of object
	{
		// System.out.println("In instance block");
		count++;
	}

	Counter() {
		// System.out.println("Default constuctor");
		x = 10;
		// count++;
	}

	Counter(int x) {
		// this();
		this.x = x;
	}

}

public class HitCounterApp {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		// System.out.println(Counter.count);

		Counter c2 = new Counter();
		// System.out.println(Counter.count);

		Counter c3 = new Counter();
		System.out.println(Counter.count);

		Counter c4 = new Counter(80);
		System.out.println(Counter.count);

	}

}
