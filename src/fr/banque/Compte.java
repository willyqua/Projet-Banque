package fr.banque;

public class Compte {

    private int number;
    private double pay;

    public Compte() {
    }

    public Compte(int number, double pay) {
        this.number = number;
        this.pay = pay;
    }


    // add au montant existant la somme recu.
    // first => verif if i add the amount to the pay
    // display amount
    public void add(double amount) {
        this.pay += amount;
        System.out.println(pay);

    }

    public void debite(double amount) {
        this.pay -= amount;
        System.out.println(pay);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "number=" + number +
                ", pay=" + pay +
                '}';
    }
}
