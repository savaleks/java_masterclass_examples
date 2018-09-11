package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;
    private String color;

    //default constructor;
    Dog() {
    }

    Dog(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.color = c;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

    // Overriding the compare method to sort the age
    public int compare(Dog d, Dog d1) {
        return d.age - d1.age;
    }
}

class Example {

    public static void main(String args[]) {
        // Takes a list o Dog objects
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Rex", 3, "black"));
        list.add(new Dog("Sharik", 2, "black"));
        list.add(new Dog("Muchtar", 10, "brown"));
        list.add(new Dog("Alius", 4, "grey"));
        list.add(new Dog("Bailys", 1, "white"));
        Collections.sort(list);   // Sorts the array list

        System.out.print("Dog's sorting by name: ");

        for(Dog a: list)   // printing the sorted list of names
            System.out.print(a.getDogName() + ", ");

        // Sorts the array list using comparator
        Collections.sort(list, new Dog());
        System.out.println(" ");
        System.out.println("-------------");
        System.out.println("Dog's sorting by age:");

        for(Dog a: list)   // printing the sorted list of ages
            System.out.print(a.getDogName() +" : "+ a.getDogAge() + ", " + a.getColor() + ".\n");
    }
}