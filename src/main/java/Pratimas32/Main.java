package Pratimas32;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    private static final String OUTPUT_FILE = "src/main/java/Pratimas32/listOfCars";

    public static void main(String[] args) throws IOException {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 2.5, 2.1, 2006));
        carList.add(new Car("Audi", 2, 1.6, 2003));
        carList.add(new Car("volvo", 2, 2.2, 2013));

        writeToFileFromArrayList(carList, new File(OUTPUT_FILE));
        ArrayList<Car> retrievedCar = getArrayListFromFile(new File(OUTPUT_FILE));
        retrievedCar.forEach(car -> System.out.println(car));

    }

    private  static  void writeToFileFromArrayList(ArrayList<Car> carList, File outputFile) throws IOException {
        String formatidString = "";

       for (Car car : carList ){
           formatidString += String.format("%s, %.2f, %.2f, %d \n",
                car.getModel(), car.getHeight(), car.getHeight(), car.getYear() );
       }
        FileUtils.writeStringToFile(outputFile, formatidString, StandardCharsets.UTF_8);

    }

    private static ArrayList<Car>  getArrayListFromFile(File outputFile) throws IOException {
        String textFromFile = FileUtils.readFileToString(outputFile, StandardCharsets.UTF_8);
        String [] lines = textFromFile.split("\n");

        ArrayList<Car> cars=new ArrayList<>();

        for (String line : lines){
            String [] atributs = line.split(",");

            Car car = new Car(atributs[0].trim(), Double.valueOf(atributs[1].trim()), Double.valueOf(atributs[2].trim()),
                    Integer.valueOf(atributs[3].trim()));
            cars.add(car);
        }
        return cars;
    }
}
