package edu.daniel.firstlesson;

public class MyClass {
    public static void main(String[] args) {  // main method

        // declaring variables
        String myName = "Daniel";
        int bornYear =  2003;
        boolean married = false;

        bornYear = 2004; // changing the var value

        String firstName = "Daniel";
        String lastName = "Oliveira";

        String completeName = completeName(firstName, lastName);  // using methods
        System.out.println(completeName);
    }

    // declaring methods
    public static String completeName (String firstName, String lastname){
        return firstName + " " + lastname;
    }
}
