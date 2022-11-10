package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.CookingTeam;

public class Gus_Guys implements CookingTeam {
    static final String DESCRIPTION = "eeee Cabron mi loco!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}