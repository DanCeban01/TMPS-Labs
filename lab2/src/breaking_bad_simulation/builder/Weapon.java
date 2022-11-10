package breaking_bad_simulation.builder;

public enum Weapon {
    KNIFE, GLOCK20, M16, M407, REMMINGTON, SHOTGUN, RPG, MP5, COLT45;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

