package java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String title;
    private List<Ingredient> ingredients;

    public Sandwich(){
        ingredients = new ArrayList<>();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public String getTitle(){
        return title;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }
}
