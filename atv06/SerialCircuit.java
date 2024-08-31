public class SerialCircuit extends CompositeCircuit {
    public SerialCircuit(Circuit[] circuits){
        super(circuits);
    }

    @Override
    public double getResistance() {
        double r = 0.0;
        for(Circuit array : circuits){
            r += array.getResistance();
        }
        return r;
    }
}
