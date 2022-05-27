package Universiteto1Laboras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Kandidatas kandidatas1 = new
//                Kandidatas("Simas", "Tumsys", "Studentas", 0,1000);
//        Kandidatas kandidatas2 = new
//                Kandidatas("Darius", "Milevicius", "Indzinierius", 0,1200);
//        Kandidatas kandidatas3 = new
//                Kandidatas("Edvinas", "Sciga", "Destytojas", 10,10000);
//        Kandidatas kandidatas4 = new
//                Kandidatas("Romas", "Vaitkevicius", "Statybininkas", 15,2500);

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("src/main/java/Universiteto1Laboras/Duomenys.csv"));

            // Reading first line..
            String[] names = reader.readLine().split(",");
            System.out.println(names[0]);
            // randam kiek yra studentu
            int totalStudents = names.length-1 ;
            ArrayList[] array = new ArrayList[totalStudents];
            System.out.println(array);
            // Initialize all students with default constructor.
            for(int i = 0; i < array.length; i++) {
                array[i] = new ArrayList();

            }

            //////////////
            // Start reading other data and setting up on objects..
            // Line 2..
            String[] joinDates = reader.readLine().split(",");
            // i = 0 gives us the string 'joinDates' which is in the first column.
            // so we have to skip it and start it from i = 1
//            for(int i = 1; i < joinDates.length; i++) {
//                // setting the objects data..
//                array[i - 1].setJoinDate(joinDates[i]);
//            }

            // And keep on doing this until SecondLang_Marks..

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
