class Vehicle {
    String brand;
    String color;
    int year;

    Vehicle() {
        this("Toyota", "Red", 2025);
    }

    Vehicle(String brand) {
        this(brand, "Black", 2025);
    }

    Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year  = year;
    }

    void display() {
        System.out.println(brand + " | " + color + " | " + year);
    }

    public static void main(String[] args) {
        Vehicle c1 = new Vehicle();
        Vehicle c2 = new Vehicle("Honda");
        Vehicle c3 = new Vehicle("BMW", "Red", 2025);

        c1.display();
        c2.display();
        c3.display();
    }
}
