import java.util.Comparator;
import java.util.Objects;

public class Object{

    public static void main(String[] args) {
        // Create two objects for comparison
        MyClass obj1 = new MyClass("Hello");
        MyClass obj2 = new MyClass("Hello");

        // Using a custom comparator
        Comparator<MyClass> myClassComparator = Comparator.comparing(myObj -> myObj.value);
        boolean isEqualUsingComparator = myClassComparator.compare(obj1, obj2) == 0;
        System.out.println("Using Comparator: " + isEqualUsingComparator);
    }

    static class MyClass {
        private String value;

        public MyClass(String value) {
            this.value = value;
        }
    }
}