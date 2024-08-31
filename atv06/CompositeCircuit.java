import java.util.ArrayList;

public abstract class CompositeCircuit implements Circuit {
    protected ArrayList<Circuit> circuits;

    public CompositeCircuit(Circuit[] circuits){
        this.circuits = new ArrayList<>();
        for(Circuit array : circuits){
            this.circuits.add(array);
        }
    }

    public Circuit[] getCircuits(){
        Circuit[] c = new Circuit[this.circuits.size()];
        int i = 0;
        for(Circuit array  : this.circuits){
            c[i] = array;
            i++;
        }
        return c;
    }
}
