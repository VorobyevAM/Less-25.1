package person;

public class Person {

    private String firstName;

    private String family;

    public Person(String firstName, String family) {
        this.firstName = firstName;
        this.family = family;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
