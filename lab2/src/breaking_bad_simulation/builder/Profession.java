package breaking_bad_simulation.builder;

public enum Profession {
    DRIVER, MECHANIC, GUNMAN, ASSASSIN, COOK, SELLER, POLICEMAN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
