package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Cook;

public class Walter_White implements Cook {
    static final String DESCRIPTION = "Say my name!...Heisenberg... You are God damn Right!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
