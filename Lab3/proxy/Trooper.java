package breaking_bad_simulation.proxy;

public class Trooper {

    private String name;

    public People(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
