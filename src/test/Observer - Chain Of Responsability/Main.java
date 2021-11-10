package test.Tp;

public class Main {

    public static void main(String[] args) {
        Handler serviceC = new ServiceC();
        Handler serviceP = new ServiceP();
        serviceC.setNextHandler(serviceP);
        Demande demande = new Demande();
        Budget budget = new Budget();
        demande.add(budget);
        System.out.println(demande.getState() + "********" + budget.getGlobalBudget() + "*******" + budget.getBlockedBudget());
        System.out.println("--------------");
        serviceC.traiterDemande(demande);
        System.out.println(demande.getState() + "********" + budget.getGlobalBudget() + "*******" + budget.getBlockedBudget());
        System.out.println("--------------");
        serviceP.traiterDemande(demande);
        System.out.println(demande.getState() + "********" + budget.getGlobalBudget() + "*******" + budget.getBlockedBudget());
        System.out.println("--------------");
    }
}
