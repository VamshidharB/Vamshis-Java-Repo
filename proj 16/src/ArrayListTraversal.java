import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // 1. Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
        System.out.println();

        // 2. Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
        System.out.println();

        // 3. Using iterator
        System.out.println("Using iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // 4. Using forEach
        System.out.println("Using forEach:");
        stringList.forEach(element -> System.out.println(element));
        System.out.println();

        // 5. Using parallel stream
        System.out.println("Using parallel stream:");
        stringList.parallelStream().forEach(element -> System.out.println(element));
    }
}
