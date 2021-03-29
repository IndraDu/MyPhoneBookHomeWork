import myphone.PeopleContacts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<PeopleContacts> contact = new ArrayList<PeopleContacts>();
        contact.add(new PeopleContacts("Mom", "21111111"));
        contact.add(new PeopleContacts("Dad", "22222222"));
        contact.add(new PeopleContacts("Brother", "23333333"));
        contact.add(new PeopleContacts("Sister", "24444444"));
        contact.add(new PeopleContacts("Cousin", "25555555"));
        contact.add(new PeopleContacts("Neighbour", "26666666"));
        contact.add(new PeopleContacts("Cousin", "27777777"));

        Collections.sort(contact, Comparator.comparing(PeopleContacts -> PeopleContacts.name));
        for (PeopleContacts contacts : contact) {
            System.out.println("My contacts list: " + contacts.name + contacts.number);
        }
    }
}
