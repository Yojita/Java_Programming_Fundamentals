package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Names {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add(("Yojita"));
        namesList.add(("Devashish"));
        namesList.add(("Tushar"));
        namesList.add(("Kanak"));

        ListIterator<String> namesIterator = namesList.listIterator();
        System.out.println("Using List iterator to access list of names in forward ");
        while (namesIterator.hasNext()) {
            String listOfNames = namesIterator.next();
            System.out.println(listOfNames);
        }

        System.out.println("Using List iterator to access list of names in reverse ");
        while (namesIterator.hasPrevious()) {
            String listOfNamesInReverse = namesIterator.previous();
            System.out.println(listOfNamesInReverse);
        }

        LinkedList<String> listOfNames = new LinkedList<>();
        listOfNames.add("Yojita");
        listOfNames.add("Devashish");
        listOfNames.add("Tushar");
        listOfNames.add("Kanak");

        System.out.println("Using for loop to access list of names ");
        for (int index = 0; index < listOfNames.size(); index++) {
            System.out.println(listOfNames.get(index));
        }

        System.out.println("Removing first and last element of the list using advanced for loop ");
        listOfNames.remove(0);
        listOfNames.remove(listOfNames.size() - 1);
        for (String names : listOfNames) {
            System.out.println(names);
        }

        System.out.println("Add new names at the first and last position and print the list using an iterator ");
        listOfNames.addFirst("Yojita");
        listOfNames.addLast("Kanak");
        ListIterator<String> names = listOfNames.listIterator();
        while (names.hasNext()) {
            String stringOfNames = names.next();
            System.out.println(stringOfNames);
        }
    }
}
