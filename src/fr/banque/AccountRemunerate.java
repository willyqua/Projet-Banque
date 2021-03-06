package fr.banque;

// rate => taux.
public class AccountRemunerate extends Account implements IAccountRemerate {
    private double rate;


    public AccountRemunerate() {
        super();
    }

    public AccountRemunerate(double rate) {
        super();
        this.rate = rate;
    }

    // calculer le taux * solde
    // soustraire le solde - le calcule du solde
    // afficher le solde final
    // pour que ma fonction s'exécute, les paramètre ne sont pas obligatoire mais parfois comme ici
    // il sont le coeur de la fonction : sans c'est parametre la fonction ne pourra pas s'exécuter
    // une  voiture ne peux pas tourner sans essence. paramètre essence.
    // question a se poser lor de la création de la méthode : est ce que j'ai besion de paramètre pour quelle s'execute.
    private double calculInterest() {
        double temp = this.getPay();
        double calcInterest = (rate * this.getPay()) / 100;
        //double calcInterest = (rate * getPay()) / 100);
        System.out.println("methode calculInterest " + calcInterest);
        return calcInterest;

    }

    public void addInterest() {
       //super.add(this.calculInterest());
        double finalPay = getPay() + this.calculInterest();

        System.out.println("solde du compet apres ajout d'interet " + finalPay);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "rate=" + rate +
                '}';
    }
}
