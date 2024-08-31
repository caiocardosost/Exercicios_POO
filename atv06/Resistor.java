public class Resistor implements Circuit {
    private double resistance;

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public double getResistance() {
        return this.resistance;
    }
}
