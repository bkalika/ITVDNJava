package professional_renewed.lesson7_reflection.reflectionMethods;

public class Main {
    private static final class CatMethods{
        public String name = "Marsel";
        private int age = 5;
        short ears = 3;
        protected long tail = 30;

        public CatMethods(){}

        public CatMethods(int age){
            this.age = age;
        }

        public CatMethods(String name, int age, short ears, long tail){
            this.name = name;
            this.age = age;
            this.ears = ears;
            this.tail = tail;
        }

        public String getName(){
            return name;
        }
    }
}
