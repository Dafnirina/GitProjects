package cycle;

public class UniCycle implements Cycle {
	public void move() {
		System.out.println("I'm moving on the one wheel");
	}
}

class UniCycleFactory implements CycleFactory {
	public Cycle makeCycle() {
		return new UniCycle();
	}
}