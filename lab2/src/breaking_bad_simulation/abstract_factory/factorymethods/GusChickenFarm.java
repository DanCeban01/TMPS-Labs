package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Storage;
import breaking_bad_simulation.abstract_factory.CookingTeam;
import breaking_bad_simulation.abstract_factory.Cook;
import breaking_bad_simulation.abstract_factory.BlueLaboratory;

public class GusChickenFarm implements BlueLaboratory {
    public Storage createBase() {
        return new LosPollosHermanos();
    }
    public Cook createDon() {
        return new Gus_Fring();
    }
    public CookingTeam createCrew() {
        return new Gus_Guys();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
