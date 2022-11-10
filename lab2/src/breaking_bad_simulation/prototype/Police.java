package breaking_bad_simulation.prototype;

public class Police extends DEA {
    public Police() {}

    @Override
    public DEA clone() throws CloneNotSupportedException {
        return new Police();
    }

    @Override
    public String toString() {
        return "Hands up! Drop your weapon!";
    }

}
