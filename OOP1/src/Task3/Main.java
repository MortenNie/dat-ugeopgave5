package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
     Customer c1 = new Customer("Morten", "Nielsen", "MortenNie");
     Customer c2 = new Customer("Svend", "Åge", "SveÅg");
     Customer c3 = new Customer("Maria", "Holst", "MH");
     Customer c4 = new Customer("Egon", "Olsen", "EgonO");
     Customer c5 = new Customer("Per", "Holst", "PH");
     Customer c6 = new Customer("Jeanette", "Nielsen", "JeanetteNie");
     customers.add(c1);
     customers.add(c2);
     customers.add(c3);
     customers.add(c4);
     customers.add(c5);
     customers.add(c6);
     printCustomers();
    }

    public static void printCustomers() {

        for (Customer s: customers) {
            System.out.println(s);

        }



    }


}
