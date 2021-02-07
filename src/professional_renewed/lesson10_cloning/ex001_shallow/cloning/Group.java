package professional_renewed.lesson10_cloning.ex001_shallow.cloning;

public class Group {
    public int id;

    public Group(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Group{"+
                "id = " + id +
                '}';
    }
}
