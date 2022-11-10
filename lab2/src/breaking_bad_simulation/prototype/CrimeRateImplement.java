package breaking_bad_simulation.prototype;

public class CrimeRateImplement implements CrimeRate {

    private Court court;
    private Authorities authorities;
    private DEA cityPower;

    /**
     * Constructor
     */
    public CrimeRateImplement(Court court, Authorities authorities, DEA cityPower) {
        this.court = court;
        this.authorities = authorities;
        this.cityPower = cityPower;
    }

    /**
     * Create mage
     */
    public Court createCourt() {
        try {
            return court.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create warlord
     */
    public Authorities createAuthorities() {
        try {
            return authorities.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * Create beast
     */
    public DEA createCityPower() {
        try {
            return cityPower.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}