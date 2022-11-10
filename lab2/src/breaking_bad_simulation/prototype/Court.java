package breaking_bad_simulation.prototype;

public abstract class Court extends Prototype {

    @Override
    public abstract Court clone() throws CloneNotSupportedException;
}