package test.Strategy;

/**
 *
 * @author hp
 */
public class Context implements Strategy{
    
    private Strategy strat ;

    @Override
    public void MakeStrategy() {
        strat.MakeStrategy();
    }

    public Strategy getStrat() {
        return strat;
    }

    public void setStrat(Strategy strat) {
        this.strat = strat;
    }
    
    
}
