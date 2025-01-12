package org.example.constructorsexamples;

public class BikeClientAPp {

    public static void main(String[] args) {

        //Bike bike = new Bike("R15", "1500CC", 125000.00, 6, "Petrol");
        Bike bike1 = new Bike("Yamaha ZMR", "2500CC");

        Bike bike2=new Bike(bike1);  //bike2---> bike1["Yamaha ZMR", "2500CC"]

    }

}
