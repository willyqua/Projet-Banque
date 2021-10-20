package fr.banque;

public interface IThresholdAccount {

    public abstract void debitThresholdAccount(double amountDebit);
    // si default recupere automatiquement le comportement de IThresholdAccount vers Treshold.


    public double getThresholdAccount();

    public void setThresholdAccount(double thresholdAccount);
}
