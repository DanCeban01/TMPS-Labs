package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.CookingTeam;

public class Walts_Guys implements CookingTeam {
    static final String DESCRIPTION = "What's Up biaaaaaatch!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
