public class ParallelCircuit extends CompositeCircuit {
    public ParallelCircuit(Circuit[] Circuits){
        super(Circuits);
    }

    @Override
    public double getResistance() {
        double r = 0.0;
        for(Circuit array : circuits){
            r += 1/array.getResistance();
        }
        r = 1/r;
        return r;
    }    
}