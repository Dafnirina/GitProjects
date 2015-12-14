package cycle;

public interface Cycle {
	public void move();
}

interface CycleFactory {
	Cycle makeCycle();
}