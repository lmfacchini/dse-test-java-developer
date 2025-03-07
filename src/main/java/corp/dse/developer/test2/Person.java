package corp.dse.developer.test2;


import java.util.Objects;

public record Person(String name, int age, String document) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(document, person.document);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(document);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", document='" + document + '\'' +
                '}';
    }
}
