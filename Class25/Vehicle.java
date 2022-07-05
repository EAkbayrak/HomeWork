package HomeWork.Class25;
/*
Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
 which should be returning a price of the Vehicle.

Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation
of  calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned
price car should include 10% discount, otherwise 20% discount.

The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */

public abstract class Vehicle {
    double vehiclePrice;

   abstract double calculateSalePrice();
}

class Sedan extends Vehicle{
    double length;

    public Sedan(double length, double vehiclePrice) {
        this.length = length;
        this.vehiclePrice=vehiclePrice;
    }

    //length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    @Override
    double calculateSalePrice() {
        if(length>20){
            vehiclePrice=vehiclePrice-(vehiclePrice*0.05);
        }else {
            vehiclePrice=vehiclePrice-(vehiclePrice*0.1);
        }
        return vehiclePrice;
    }
}

class Truck extends Vehicle{
    double weight;
    Truck(double weight, double vehiclePrice){
        this.weight=weight;
        this.vehiclePrice=vehiclePrice;
    }

//if weight>2000 then returned
//         price car should include 10% discount, otherwise 20% discount.
    @Override
    double calculateSalePrice() {
        if(weight > 2000){
            vehiclePrice=vehiclePrice-(vehiclePrice*0.1);
        }else {
            vehiclePrice=vehiclePrice-(vehiclePrice*0.2);
        }
         return vehiclePrice;
    }
}

class Mainss{
    public static void main(String[] args) {
        Sedan sedan= new Sedan(25,5000);
        System.out.println("The sedan's price went from £"+sedan.vehiclePrice+" to £"+sedan.calculateSalePrice());

        Truck truck = new Truck(600, 2500);
        System.out.println("The truck's price went from £"+truck.vehiclePrice+" to £"+truck.calculateSalePrice());

    }
}
