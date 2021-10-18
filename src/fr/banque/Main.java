package fr.banque;

public class Main {

    public static void main(String[] args) {

        // instance de compte appeler bankAccount contenant deux paramètres number et pay.


        // récupére le solde du compte bankAccount.
        //System.out.println(bankAccount.getPay());
        // appelle la méthode add qui permettra de récupérer son comportement.
        // 1- nom objet instancé => bankAccount.
        // 2- choix de la méthode => .add
        // 3- entrer le nombre de paramètre necessaire à la méthode pour son bon fonctionnement.
        //bankAccount.add(100.00);
        //bankAccount.debite(50.00);

        // nom objet finaleBankAccount
        // appelle la méthode calcul interest pour calculer le taux sur le solde actuel.
        // appelle la méthode addInterest pour rajouter le taux au compte finale .
        // recupére la valeur final du compte

        AccountRemunerate finalBankAccount = new AccountRemunerate(10.00);

        //finalBankAccount.calculInterest(bankAccount);
        finalBankAccount.setPay(150);

        finalBankAccount.addInterest();
        /////////////////////////////////
        Customer customer = new Customer("ret","eric",18,12345);
        Account c1 = new Account(1, 1500);
        Account c2 = new Account(2, 150);
        Account c3 = new Account(3, 15000);
        Account c4 = new Account(4, 1600);
        Account c5 = new Account(5, 500);
        Account c6 = new Account(6, 50000);
        customer.addAccount(c1);
        customer.addAccount(c2);
        customer.addAccount(c3);
        customer.addAccount(c4);
        customer.addAccount(c5);
        customer.addAccount(c6);


        //customer.addAccount(bankAccount);
        System.out.println(customer.toString());
       /* Account economy = new Account(23424,12345);
        customer.ajouterCompte(economy);*/
    }
}
