import breaking_bad_simulation.abstract_factory.factorymethods.GusChickenFarm;
import breaking_bad_simulation.abstract_factory.factorymethods.WhiteRV;
import breaking_bad_simulation.builder.*;
import breaking_bad_simulation.prototype.*;

public class NewMexico {
    public static void main(String[] args){
        var mafia1 = new WhiteRV();
        var base = mafia1.createBase();
        var don = mafia1.createDon();
        var crew = mafia1.createCrew();

        var mafia2 = new GusChickenFarm();
        var base2 = mafia2.createBase();
        var don2 = mafia2.createDon();
        var crew2 = mafia2.createCrew();

        System.out.println(base.getDescription());
        System.out.println(don.getDescription());
        System.out.println(crew.getDescription());

        System.out.println(base2.getDescription());
        System.out.println(don2.getDescription());
        System.out.println(crew2.getDescription());

        Hero driver =
                new Hero.Builder(Profession.DRIVER, "Pablo Esperantso")
                        .withHairType(HairType.BALD).withWeapon(Weapon.KNIFE).build();
        System.out.println(driver);

        Hero  assassin =
                new Hero.Builder(Profession.ASSASSIN, "Jimmy Carter").withHairColor(HairColor.BLACK)
                        .withHairType(HairType.SHORT).withSuit(Suit.PLATE_MAIL).withWeapon(Weapon.GLOCK20)
                        .build();
        System.out.println(assassin);

        Hero gunman =
                new Hero.Builder(Profession.GUNMAN, "Ralph Cipharetto").withHairColor(HairColor.BLOND)
                        .withHairType(HairType.CURLY).withWeapon(Weapon.M16).build();
        System.out.println(gunman);


        CrimeRate secondaryCharacters;
        Court court;
        Authorities authorities;
        DEA cityPower;

        secondaryCharacters = new CrimeRateImplement(new Judge(),new Mayor(), new Police());
        court = secondaryCharacters.createCourt();
        authorities = secondaryCharacters.createAuthorities();
        cityPower = secondaryCharacters.createCityPower();
        System.out.println(court);
        System.out.println(authorities);
        System.out.println(cityPower);

    }
}
