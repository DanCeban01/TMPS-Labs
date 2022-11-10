package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Cook;

public class Gus_Fring implements Cook {
    static final String DESCRIPTION = "Hello, my name is Gustavo, but you can call me Gus!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
