package breaking_bad_simulation.adapter;

import breaking_bad_simulation.adapter.interfaces.ArmoredCar;


public class Lieutenants implements ArmoredCar {

    private ArmoredCar ArmoredCar;

    public Lieutenants() {

    }

    public Lieutenants(ArmoredCar ArmoredCar) {
        this.ArmoredCar = ArmoredCar;
    }

    public void setBattleship(ArmoredCar ArmoredCar) {
        this.ArmoredCar = ArmoredCar;
    }

    @Override
    public void attack() {
        ArmoredCar.attack();
    }

    @Override
    public void transport() {
        ArmoredCar.transport();
    }
}
