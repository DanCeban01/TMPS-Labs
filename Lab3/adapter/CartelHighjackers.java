package breaking_bad_simulation.adapter;

import breaking_bad_simulation.adapter.interfaces.ArmoredCar;

public class Interceptor  implements ArmoredCar {

    private Transport car;

    public Interceptor(){
        car = new StaffVan();
    }

    @Override
    public void attack(){
        System.out.println("Intercept the staff from that ********!");
    }

    @Override
    public void transport(){
        car.move();
    }
}
