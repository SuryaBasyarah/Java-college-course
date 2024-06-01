public class Method {
    public static void main(String[] args) {
        // sayHelloWorld();
        // sayHello("Surya", "Putra");
        // sayHello("Surya");

        System.out.println(sum(100, 200));
        int[] angka = {90, 80, 70, 90};
        sayCongrats("Surya", angka);
        System.out.println(factorialRecursive(3));
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + ' ' + lastName);
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus.");
        }
        else {
            System.out.println(name + " tidak lulus.");
        }
    }

    static int factorialRecursive(int value) {
        if (value == 1)
            return 1;
        else
            return value * factorialRecursive(value - 1);
            
    }
}
