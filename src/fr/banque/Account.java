package fr.banque;

public class Account {

    private int number;
    private double pay;


    public Account() {
    }

    public Account(int number, double pay) {
        this.number = number;
        this.pay = pay;
        System.out.println();
    }


    // add au montant existant la somme recu.
    // first => verif if i add the amount to the pay
    // display amount
    public void add(double amount) {
        this.pay += amount;
        System.out.println("credite " + pay);

    }


    public void debite(double amount) {
        this.pay -= amount;
        System.out.println("debite " + pay);
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
        return "Account{" +
                "number=" + number +
                ", pay=" + pay +
                '}';
    }
}
