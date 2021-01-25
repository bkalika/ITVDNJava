package professional_renewed.lesson1_collections.ex004_comparable;

public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price){
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o){
        int tmp_speed = this.speed - ((Animal)o).speed;
        int tmp_price = this.price - ((Animal)o).price;
        int tmp_weight = this.weight - ((Animal)o).weight;

        if (tmp_speed == 0){
            if (tmp_price == 0){
                if (tmp_weight == 0){
                    return this.breed.compareTo(((Animal)o).breed);
                } else {
                    return tmp_weight;
                }
            } else {
                return tmp_price;
            }
        } else {
            return tmp_speed;
        }
    }
}
