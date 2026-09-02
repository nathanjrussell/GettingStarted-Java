package io.github.nathanjrussell;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        Person nathan = new Person(39,"Nathan","Russell");
        System.out.println(nathan.getAge());


        Person[] peopleArray = new Person[5];
        peopleArray[0] = nathan;
        peopleArray[1] = new Person(20,"Jiwoo","Hang");
        peopleArray[2] = new Person(19,"Marissa","McCubbin");
        peopleArray[3] = new Person(21,"Kamil","Zavala");
        peopleArray[4] = new Person(28,"Keaston","Edwards");

        for (Person person : peopleArray) {
            System.out.println("Here is a new person shown below!");
            System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            System.out.println("\tAge: " + person.getAge());
        }

    }
}