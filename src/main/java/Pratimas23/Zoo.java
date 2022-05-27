package Pratimas23;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {
    private HashMap<String, Integer> animuls;

    public Zoo() {
        animuls = new HashMap<>();
    }

    public void addAnimals(String specy, int number) {
        animuls.put(specy, number);
    }

    public int getNumberOfAllAnimals() {
        int cont = 0;

        for (int animalsCont : animuls.values()) {
            cont += animalsCont;
        }
        return cont;
    }

    public Map<String, Integer> getAnimalsCont() {
        return animuls;
    }

    public Map<String, Integer> getAnimalsConterSorted() {
        return animuls.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));


    }

}
