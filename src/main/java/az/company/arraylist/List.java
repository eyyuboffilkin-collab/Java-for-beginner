package az.company.arraylist;

import java.util.ArrayList;

public class List {
    static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Java");
        tasks.add("GitHub");
        tasks.add("Python");

        System.out.println("Tasks list: ");

        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
