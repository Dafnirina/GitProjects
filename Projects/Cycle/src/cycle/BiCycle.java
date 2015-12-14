package cycle;

public class BiCycle implements Cycle{
	public void move() {
		System.out.println("I'm moving on the two wheels");
	}
}

class BiCycleFactory implements CycleFactory {
	public Cycle makeCycle() {
		return new BiCycle();
	}
}