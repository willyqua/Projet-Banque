package fr.banque;

import java.util.Arrays;

// class Customer
public class Customer {
    // attributs
    private String name;
    private String firstName;
    private int age;
    private int number;
    // attributs externes
    private Account[] accounts;


    // empty constructor
    public Customer() {
        super();
    }

    // constructor with attribut
    public Customer(String name, String firstName, int age, int number) {
       super();
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.number = number;
        this.accounts = new Account[5];
    }

    // méthod add account in array account
    // return a message if the account has reached the maximum possible account
    // otherwise add an account if requested
    public void addAccount(Account account) {
                //accounts[0]=customer;
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] == null) { // si l'élément de mon index et vide alors il est null .
                this.accounts[i] = account;
                return; // permet de ne pas ajouter 5 fois le meme client mais une fois.
            }
        }
        System.out.println("you can have only five accounts");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }


// Fonction

    /**
     * Fonction qui permet d'ajouter un compte(max 5)
     *
     * @param account : celui à ajouter
     */
    /*public void ajouterCompte(Account account) {
        int nbAccount = 0;
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] != null) {
                if (this.accounts[i].getNumber() == account.getNumber()) {
                    System.out.println("ce cpù^te existe déja");
                    break;
                }
                nbAccount += 1;

            } else {
                this.accounts[i] = account;
                nbAccount += 1;
                break;
            }
        }
            if (nbAccount >= 5) {
                System.out.println("il n'y a plus d'espace de comptes disponible");
            }

    }*/

    /**
     * Fonction qui permet de récupérer un compte dans la liste du client
     * à partir de son numéro
     *
     * @param numberAccount : un int correspond au numéro du compte rechercher
     * @return un compte correspond à celui-ci
     */

    public Account getAccountByNum(int numberAccount) {
        Account findAccount = null;
        for (Account account : this.accounts) {
            if (account.getNumber() == numberAccount) {
                findAccount = account;
            }
        }
        if (findAccount.equals(null)) {
            System.out.println("le compte n'a pas été trouvé");
        }
        return findAccount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
