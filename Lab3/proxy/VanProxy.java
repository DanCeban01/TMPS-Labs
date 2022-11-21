package breaking_bad_simulation.proxy;

public class VanProxy extends Van{

    private static  final int NUM_TROOPER_ALLOWED = 5;
    private int numTrooper;

    @Override
    public void onBoard(Trooper Trooper){
        if (numTrooper < NUM_Trooper_ALLOWED){
            super.onBoard(Trooper);
            numTrooper++;
        } else {
            System.out.println( Trooper + " is not allowed to enter.");
        }
    }
}
