package cycle;

public class TriCycle implements Cycle{
	public void move() {
		System.out.println("I'm moving on the three wheel");
	}
}

class TriCycleFactory implements CycleFactory {
	public Cycle makeCycle() {
		return new TriCycle();
	}
}