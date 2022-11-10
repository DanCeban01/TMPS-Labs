package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Storage;
import breaking_bad_simulation.abstract_factory.CookingTeam;
import breaking_bad_simulation.abstract_factory.Cook;
import breaking_bad_simulation.abstract_factory.BlueLaboratory;

public class WhiteRV implements BlueLaboratory {
    public Storage createBase() {
        return new Jesse_Basement();
    }
    public Cook createDon() {
        return new Walter_White();
    }
    public CookingTeam createCrew() {
        return new Walts_Guys();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
