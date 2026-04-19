# The code of Example 01
```java
public class Car {
    String color;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Car's Color : " + color);
        System.out.println("Car's Model : " + model);
        System.out.println("Car's Year  : " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        myCar.model = "Toyota";
        myCar.year = 2025;
        myCar.displayInfo();
    }
}
