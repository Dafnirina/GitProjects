package cycle;
import cycle.CycleFactory;

public class Factory {

	Factory(CycleFactory... cycleFactories) {
		Cycle[] cycles = null;
		int k = 0;
		for (CycleFactory cF : cycleFactories) {
			cycles[k++] = cF.makeCycle();
			cycles[k].move();
		}
	}
	
	public static void produce(CycleFactory... cycleFactories) {
		Cycle[] cycles = new Cycle[cycleFactories.length];
		int k = 0;
		for (CycleFactory cF : cycleFactories) {
			cycles[k] = cF.makeCycle();
			cycles[k++].move();
		}
	}
	
	public static void main(String[] args) {
		produce((CycleFactory)new BiCycleFactory(), (CycleFactory)new TriCycleFactory(), (CycleFactory)new UniCycleFactory());
//		Factory((CycleFactory)new BiCycleFactory(), (CycleFactory)new TriCycleFactory(), (CycleFactory)new UniCycleFactory()); нельзя, а следовало бы
	}

}
