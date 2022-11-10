package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Storage;

public class LosPollosHermanos implements Storage {
    static final String DESCRIPTION = "New Chicken sauce every week!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
