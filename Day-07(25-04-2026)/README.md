# Example-1
```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Example1 {
    public static void main(String[] args){

        //Creating a List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits "+ fruits);
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit " + firstFruit);
        //Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits List: "+fruits);

        LinkedList <String> colors= new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors : "+ colors);
        System.out.println("First color is  : "+ colors.get(0));
        //Remove an element in lined list
        colors.remove("Green");;
        System.out.println("Colors After remove Green : "+ colors);

    }
}
```
# Example-2
```java
import java.util.HashSet;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); //Duplicate not added;

        System.out.println("Fruits Set: "+fruits);
        fruits.remove("Cherry");
        System.out.println("After removal Cherry Fruits list: "+fruits);

        //TreeSet
        TreeSet <Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5); // duplicate will not be added

        System.out.println("Number List Tree set: "+ numbers);

        //checking if an element exits
        if(numbers.contains(5))
        {
            System.out.println("5 is present in the set");
        }

        numbers.remove(4);
        System.out.println("After removing 4 "+ numbers);
    }
}
```
