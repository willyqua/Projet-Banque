package fr.banque;

public interface IAccountRemerate {

    private double calculInterest(){
        return 0;
    }
    public void addInterest();

    public double getRate();

    public void setRate(double rate);
}
