package arrays2.grocery;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); //ArrayList yra klase todel "()" iskviecia konstruktori;

    // sukurti elementus i ArrayList;
    public void addGroceryItem(String item) {
        groceryList.add(item); //automatiskai pridedam elementa i ArrayList, iskvieciant metoda;
    }
    // atspausdinti elementu sarasa;
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");//grazina rezultata kiek yra elementu;
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));// 'get' padeda isvesti elementus i konsole;
        }
    }
    // keisti elementus sarase;
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // 'set' keicia pozicija sarase;
        System.out.println("Grocery item " + (position+1) + " has been modified."); //'positio+1' todel kad kompiuteris skaiciuoja nuo 0;
    }
    // istrinti elementa sarase;
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);//nusakom elemento pozicija, kuri norime istrinti;
        groceryList.remove(position);
    }
    // randome elementa sarase pagal indeksa;
    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position >=0) {
            return groceryList.get(position);
        }

        return null;
    }
}

