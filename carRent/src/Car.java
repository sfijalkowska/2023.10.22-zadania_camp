public class Car {
    String brand;
    String model;
    int year;
    double price;
    String plate;
    boolean rent;

    public Car(String brand, String model, int year, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.plate = plate;
        this.rent = false;
    }
    //Metoda wyświetlająca auto
    String transformToString() {
        return "Brand: " + this.brand + " " + "Model: " + this.model + " " + "Year: " + this.year + " " +
                "Price: " + this.price + " " + "Plate: " + this.plate + " " + "Rent: " + this.rent + " ";
    }
}
