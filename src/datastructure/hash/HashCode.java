package src.datastructure.hash;

public class HashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Kim");
        Person person2 = new Person(new String("Kim"));
        Person person3 = person2;

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        /* 결과값
            3565735997
            1735600054
            1735600054
         */
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Person anotherObj = (Person) obj;
        return (this.name.equals(anotherObj.name));
    }
}
