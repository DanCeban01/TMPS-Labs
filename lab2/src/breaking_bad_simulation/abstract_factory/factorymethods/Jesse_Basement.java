package breaking_bad_simulation.abstract_factory.factorymethods;

import breaking_bad_simulation.abstract_factory.Storage;

public class Jesse_Basement implements Storage {
    static final String DESCRIPTION = "Old Clothes, Aunt's staff, some meth.";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
