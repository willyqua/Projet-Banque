package fr.banque;

// class compte a seuil qui va définir le seuil minimum du compte.
public class ThresholdAccount extends Account {

 private double thresholdAccount;

 public ThresholdAccount(){
     super();
 }


 // constructeur seuil a compte qui hérite du compte.
    public ThresholdAccount(int number, double pay, double thresholdAccount) {
        super(number, pay);
        this.thresholdAccount = thresholdAccount;
    }



}
