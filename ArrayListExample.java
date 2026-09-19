import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creation of ArrayList
        ArrayList<String> obj1 = new ArrayList<String>();

        // Adding elements to ArrayList
        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("Steve");
        obj1.add("Anuj");

        // Displaying ArrayList elements
        System.out.println("\nCurrently the array list obj1 has following elements: " + obj1);

        // Append elements at the end
        obj1.add("Babu");
        obj1.add("Kamal");

        // Creation of second ArrayList
        ArrayList<String> obj2 = new ArrayList<String>();

        obj2.add("Bob");
        obj2.add("Raj");

        // Adding ArrayList obj2 into obj1
        obj1.addAll(obj2);

        System.out.println("\nArrayList obj1 after add All: " + obj1);

        // Add elements at the given index
        obj1.add(0, "Rahul");
        obj1.add(1, "Justin");

        System.out.println(
            "\nArrayList obj1 after add element at the given index: " + obj1
        );

        // Search an element
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the Search element:");
        String search = input.nextLine();

        System.out.println(
            "\nArrayList obj1 contains the string " + search + ": "
            + obj1.contains(search)
        );

        // Remove elements from ArrayList
        obj1.remove("Chaitanya");
        obj1.remove("Harry");

        System.out.println(
            "\nCurrent array list of obj1 after removing elements: " + obj1
        );

        // Remove element from given index
        obj1.remove(1);

        System.out.println(
            "\nCurrent array list of obj1 after removing element through index: "
            + obj1
        );

        // Display all strings starting with given letter
        System.out.println(
            "\nEnter the letter to display all the strings starting with given letter:"
        );

        search = input.nextLine();

        ArrayList<String> obj3 = new ArrayList<String>();

        for (int i = 0; i < obj1.size(); i++) {

            if (obj1.get(i).startsWith(search.toUpperCase())) {
                obj3.add(obj1.get(i));
            }
        }

        if (obj3.size() > 0) {

            System.out.println(
                "\nArrayList obj1 contains all the strings starting with given "
                + search + ": " + obj3
            );

        } else {

            System.out.println(
                "\nNo Name starts with \"" + search
                + "\" letter in ArrayList obj1"
            );
        }

        input.close();
    }
}