package org.example.constructorsexamples;

public class Bike {

    String bikeName;
    String engineCC;
    double price;
    int numberOfgears;
    String bikeType;

    public Bike() {
        System.out.println("Bike Object is Created");
    }

    public Bike(String bikeName, String engineCC, double price, int numberOfgears, String bikeType) {
        System.out.println("I am Inside 5 Param Constructor");
        this.bikeName = bikeName;
        this.engineCC = engineCC;
        this.price = price;
        this.numberOfgears = numberOfgears;
        this.bikeType = bikeType;

        System.out.println(bikeName);
        System.out.println(engineCC);
        System.out.println(price);
        System.out.println(numberOfgears);
        System.out.println(bikeType);
    }

    public Bike(String bikeName, String engineCC) {
        System.out.println("I am Inside 2 Param Constructor");
        this.bikeName = bikeName;
        this.engineCC = engineCC;
        System.out.println(bikeName);
        System.out.println(engineCC);

    }

    public Bike(Bike bike) {
        this.bikeName = bike.bikeName;
        this.engineCC = bike.engineCC;
        System.out.println(this.bikeName);
        System.out.println(this.engineCC);
    }
}
