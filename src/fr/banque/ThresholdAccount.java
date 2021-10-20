package fr.banque;

// class compte a seuil qui va définir le seuil minimum du compte.
public class ThresholdAccount extends Account implements IThresholdAccount {

    private double thresholdAccount;

    public ThresholdAccount() {
        super();
    }


    // constructeur seuil à compte qui hérite du compte.
    public ThresholdAccount(int number, double pay, double thresholdAccount) {
        super(number, pay);
        this.thresholdAccount = thresholdAccount;
    }

    // méthode retirer montant du solde seulement si  on a solde-montant > Seuil.
    // solde = seuil du solde + retrait
    public void debitThresholdAccount(double amountDebit) {

        double payAfterDebitAmount = this.getPay() - (thresholdAccount + amountDebit);
        //System.out.println("solde apres retrait "+payAfterDebitAmount);

               if (payAfterDebitAmount > 0) {
                   System.out.println("montant sur votre solde après votre débit " +payAfterDebitAmount);

               }else{
                   System.out.println("votre solde ne permet pas de retrait");
               }

    }

    public double getThresholdAccount() {
        return thresholdAccount;
    }

    public void setThresholdAccount(double thresholdAccount) {
        this.thresholdAccount = thresholdAccount;
    }
}
