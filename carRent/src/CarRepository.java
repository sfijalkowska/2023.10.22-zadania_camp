public class CarRepository {
    Car[] cars = new Car[5];
    public CarRepository() {
        this.cars[0] = new Car("BMW", "1", 2020, 599, "KR11");
        this.cars[1] = new Car("BMW", "2", 2021, 499, "KR12");
        this.cars[2] = new Car("BMW", "3", 2022, 399, "KR13");
        this.cars[3] = new Car("BMW", "4", 2023, 299, "KR14");
        this.cars[4] = new Car("BMW", "5", 2019, 199, "KR15");
    }
    Car findCar(String plate) {
        for (Car car : this.cars) {
            if (car.plate.equals(plate)) {
                return car;
            }
        }
        return null;
    }
    boolean rentCar(String plate) {
        Car car = findCar(plate);
        if (car != null & car.rent == false) {
            car.rent = true;
            return true;
        } else {
            return false;
        }
    }
    boolean returnCar(String plate) {
        Car car = findCar(plate);
        if (car != null & car.rent == true) {
            car.rent = false;
            return true;
        } else {
            return false;
        }
    }
}