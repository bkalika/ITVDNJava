package professional_renewed.lesson3_maps.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, Animal> nm = new TreeMap<>();

        nm.put("Ivan", new Animal(7000));

        Animal pet = new Animal(8000);
        nm.put("Alex", pet);
        nm.put("Edward", new Animal(5000));
        nm.put("Edward", new Animal(6000));

        System.out.println(nm);

        System.out.println(nm.get("Alex"));
        System.out.println(nm.containsKey("Edward"));
        System.out.println(nm.containsValue(new Animal(8000)));
        System.out.println(nm.containsValue(pet));

        Set<String> nameKeys = nm.keySet();
        Collection<Animal> petsPrice = nm.values();
        System.out.println(nameKeys);
        System.out.println(petsPrice);

        Set<Map.Entry<String, Animal>> keysAndValues = nm.entrySet();
        System.out.println(keysAndValues);
        for (Map.Entry<String, Animal> temp : keysAndValues){
            temp.setValue(new Animal(10000));
        }
        System.out.println(keysAndValues);
    }
}

class Animal {
    private int price;

    Animal(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "" + this.price;
    }
}
