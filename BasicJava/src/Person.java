public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }

    public static void main(String[] args) throws Exception {
        var Person = new Person("Surya", "Jakarta");
        Person.name = "Surya Basyarah";

        Person.sayHello("X");

        // var person1 = new Person("Surya", "Jakarta");
        var person2 = new Person("Surya");
        // var person3 = new Person();

        person2.sayHello();
    }
}
