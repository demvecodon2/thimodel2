package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("a", 30));
        peoples.add(new Person("b", 25));
        peoples.add(new Person("c", 35));
        // Sắp xếp danh sách dựa trên tuổi
        Collections.sort(peoples);
        // In danh sách đã sắp xếp
        for (Person person : peoples) {
            System.out.println(person);
        }
    }
}