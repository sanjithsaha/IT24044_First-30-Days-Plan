# Example-1
```java
import java.util.Queue;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        q.poll();

        for (int num : q) {
            System.out.println(num);
        }
    }
}
```
# Example-2
```java
import java.util.Queue;
import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Watermelon");
        q.add("Lychee");
        q.add("Mango");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
```
