import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CarRepository baza = new CarRepository();
        GUI gui = new GUI();
        boolean run = true;


        mainLoop:
        while (run) {
            switch (gui.showMenuAndReadChoose()) {
                case "1":
                    gui.printCars(baza.cars);
                    break;
                case "2":
                    gui.showResult(baza.rentCar(gui.readPlate()));
                    break;
                case "3":
                    gui.showResult(baza.returnCar(gui.readPlate()));
                    break;
                case "4":
                    // System.exit(0);
                    break mainLoop;
                default:
                    gui.showWrongChoose();
                    break;

            }

        }
    }
}
