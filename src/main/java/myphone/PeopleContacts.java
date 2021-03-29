package myphone;

public class PeopleContacts {

    public String name;
    public int number;

    public PeopleContacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public PeopleContacts(String name, String number) {
    }

    public String getName(){
            return name;
        }
    public int getNumber() {
            return number;
        }
}

