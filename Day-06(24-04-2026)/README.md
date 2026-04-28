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

        LinkedList <String> animals= new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        System.out.println("Animals: " + animals);

    }
}
```
# Example-2
```java
import java.util.HashMap;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args){
        HashSet <String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors : "+ colors);

        //hash map
        HashMap<String, Integer> ageMap= new HashMap<>();

        ageMap.put("Arisu", 25);

        ageMap.put("Osagi", 22);

        ageMap.put("Chisiya", 23);

        System.out.println("Age map: "+ ageMap);
        int Age= ageMap.get("Arisu");
        System.out.println("Arisu is " + Age+" years old");
    }

}
```
