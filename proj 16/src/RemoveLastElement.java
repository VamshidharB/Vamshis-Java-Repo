import java.util.ArrayList;
import java.util.List;

public class RemoveLastElement {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Display the ArrayList before removing the last element
        System.out.println("Before removal: " + stringList);

        // Remove the last element
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Last element removed.");
        } else {
            System.out.println("ArrayList is already empty.");
        }

        // Display the ArrayList after removing the last element
        System.out.println("After removal: " + stringList);
    }
}
