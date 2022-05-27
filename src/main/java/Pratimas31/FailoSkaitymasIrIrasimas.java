package Pratimas31;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FailoSkaitymasIrIrasimas {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("src/main/java/Pratimas31/StringDuomenys.txt"));
        ArrayList<String> zodziai = new ArrayList<>();

        while (input.hasNext()) {
            zodziai.add(input.next());
        }
        input.close();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < zodziai.size(); i++) {
            int conter = 1;
            String zodis = zodziai.get(i);
            for (int j = i+1; j < zodziai.size(); j++) {
                if (zodis.equals(zodziai.get(j))) {
                    conter++;
                }
            }
            map.putIfAbsent(zodis, conter);

        }
       map.forEach((k,v) -> System.out.println("K: "+ k + ", V: " + v));
        writeToFile(map);
    }
    private static void writeToFile(HashMap<String, Integer> map) throws IOException{
        File file = new File("src/main/java/Pratimas31/StringDuomenysOutput.txt");



    }
}