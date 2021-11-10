package test.Strategy;

/**
 *
 * @author hp
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context c = new Context();
        c.setStrat(new Strat1());
        c.MakeStrategy();
    }
    
}
