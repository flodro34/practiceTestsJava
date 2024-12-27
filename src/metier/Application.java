package metier;

import model.Book;

public class Application {

        public static void main(String[] args) {

            //System.out.println("Hello world!");

//            Calculator c = new Calculator();
//            System.out.println(c.add(5,10));
//            System.out.println(c.subtract(10,4));

            Book b1 = new Book("Bilbo", "Tolkien");
            Book b2 = new Book("Le seigneur des anneaux", "Tolkien");

            System.out.println("contenu : " +  b1.toString());
            System.out.println("égalité ? : " + b1.equals(b2));
            System.out.println("hash de b1 : " + b1.hashCode());
            System.out.println("hash de b2 : " + b2.hashCode());
        }
    }

