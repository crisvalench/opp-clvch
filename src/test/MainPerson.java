package test;
import Entities.Person;
import expectionperson.DuplicateNameException;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Cristina", "Valenzuela", 21);
        Person person2 = new Person("Lizbeth", "Chachipanta", 22);

        Person person3 = new Person("Diana", "Sanunga", 20);

        Person person4 = new Person();
        person4.setName("Lola");
        person4.setLastName("Davila");


//        printPersonProperties(person1);
//        printPersonProperties(person2);
//        printPersonProperties(person3);
//        printPersonProperties(person4);

        List<Person> personList = new ArrayList<>();
        Person person5 = new Person("Cristina", "Noboa", 52);
        Person person6 = new Person("Lily", "Noboa", 52);
        try{
            addPerson(person1,personList);
            addPerson(person2,personList);
            addPerson(person3,personList);
            addPerson(person4,personList);
            addPerson(person5,personList);
            addPerson(person6,personList);

        }catch (DuplicateNameException de){
            System.out.println(de.getMessage());
        }
        for(Person people: personList){
            System.out.println(people);
        }

    }
    public static void addPerson(Person p, List<Person> personList) throws DuplicateNameException {
        for(Person per : personList){
            if(per.getName().equalsIgnoreCase(p.getName())){
                throw new DuplicateNameException("Person Name: " + p.getName() +" , already exists." + personList);
            }
        }
        personList.add(p);
    }

    public static void printPersonProperties(Person p){
        try{
            System.out.println("---------------------------------------------");
            System.out.println("Name: " + p.getName());
            System.out.println("LastName: " + p.getLastName().toUpperCase());
            System.out.println("Age: " + (p.getAge() + 1));
        }catch (NullPointerException npe){
            System.out.println("Person Attribute is null. Exception Message: " + npe.getMessage());
        }
    }
}
