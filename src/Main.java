import filterMap.SomeMetod;
import person.Person;

import java.util.*;

public class Main {

    private static SomeMetod someMetod = new SomeMetod();

    public static void main(String[] args) {

        Person person1 = new Person("Вася", "Иванов");
        Person person2 = new Person("Петр", "Петров");
        Person person3 = new Person("Сергей", "Печкин");
        Person person4 = new Person("Иван", "Васильев");
        Person person5 = new Person("Женя", "Печкин");


        Map<String, String> hashmap = new HashMap<>();

        hashmap.put(person1.getFirstName(), person1.getFamily());
        hashmap.put(person2.getFirstName(), person2.getFamily());
        hashmap.put(person3.getFirstName(), person3.getFamily());
        hashmap.put(person4.getFirstName(), person4.getFamily());
        hashmap.put(person5.getFirstName(), person5.getFamily());

        someMetod.isUnique(hashmap);


    }

}
