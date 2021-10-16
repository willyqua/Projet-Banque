package fr.banque;

public class Main {

    public static void main(String[] args) {

        // instance de compte appeler livret contenant deux paramètres number et pay.
        Compte livret = new Compte(123456, 150);


        // récupére le solde du compte livret.
        System.out.println(livret.getPay());
        // appelle la méthode add qui permettra de récupérer son comportement.
        // 1- nom objet instancé => livret.
        // 2- choix de la méthode => .add
        // 3- entrer le nombre de paramètre necessaire à la méthode pour son bon fonctionnement.
        livret.add(50.00);
        livret.debite(75.25);

    }
}
