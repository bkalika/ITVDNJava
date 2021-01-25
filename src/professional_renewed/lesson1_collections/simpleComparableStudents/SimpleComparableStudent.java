package professional_renewed.lesson1_collections.simpleComparableStudents;

import java.util.Arrays;

public class SimpleComparableStudent implements Comparable{
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group){
        this.firstName = firstName;
        this.group = group;
    }

    public String toString(){
        return "firstName = " + firstName + ", group = " + group;
    }

    public int compareTo(Object o){
        if (this.group == ((SimpleComparableStudent)o).group){
            return (this.firstName.compareTo(((SimpleComparableStudent)o).firstName));
        } else {
            return this.group - ((SimpleComparableStudent)o).group;
        }
    }
}

class Main{
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Bohdan", 300),
                new SimpleComparableStudent("Bohdan", 300),
                new SimpleComparableStudent("Igor", 300),
                new SimpleComparableStudent("Peter", 300),
        };

        Arrays.sort(myStudents);

        for(SimpleComparableStudent i : myStudents ){
            System.out.println(i.toString());
        }
    }
}
