package test.Tp;


public class Budget extends Observer {
    private double globalBudget = 5000;
    private double blockedBudget = 0;

    public double getGlobalBudget() {
        return globalBudget;
    }

    public void setGlobalBudget(double globalBudget) {
        this.globalBudget = globalBudget;
    }

    public double getBlockedBudget() {
        return blockedBudget;
    }

    public void setBlockedBudget(double blockedBudget) {
        this.blockedBudget = blockedBudget;
    }

    @Override
    public void refresh(Observable observable) {
        double amount = ((Demande) observable).getAmount();
        if (((Demande) observable).getState().equals("Approved."))
            setBlockedBudget(amount);
        else {
            setGlobalBudget(this.getGlobalBudget() - amount);
            setBlockedBudget(0);
        }
    }
}
