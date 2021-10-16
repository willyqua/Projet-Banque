package fr.banque;

public class Main {

    public static void main(String[] args) {

        // instance de compte appeler bankAccount contenant deux paramètres number et pay.
        Compte bankAccount = new Compte(123456, 150);


        // récupére le solde du compte bankAccount.
        System.out.println(bankAccount.getPay());
        // appelle la méthode add qui permettra de récupérer son comportement.
        // 1- nom objet instancé => bankAccount.
        // 2- choix de la méthode => .add
        // 3- entrer le nombre de paramètre necessaire à la méthode pour son bon fonctionnement.
        bankAccount.add(50.00);
        //bankAccount.debite(50.00);

        // nom objet finaleBankAccount
        // appelle la méthode calcul rate pour calculer le taux sur le solde actuelle.
        // appelle la méthode addInterest pour rajouter le taux au compte finale .
        // recupére la valeur final du compte
        CompteRemunere finalBankAccount = new CompteRemunere(10.00);
        finalBankAccount.calculRate(bankAccount);
        finalBankAccount.addInterest(10.00,bankAccount);

    }
}
