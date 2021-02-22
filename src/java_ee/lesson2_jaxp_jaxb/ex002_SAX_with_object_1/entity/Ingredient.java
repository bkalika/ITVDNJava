package java_ee.lesson2_jaxp_jaxb.ex002_SAX_with_object_1.entity;

public class Ingredient {
    private String title;

    public Ingredient(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
