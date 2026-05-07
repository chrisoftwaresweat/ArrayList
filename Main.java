import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        //add
        animals.add("dog");
        animals.add("cat");
        animals.add("rat");

        for(int i = 0; i<animals.size(); i++){
            System.out.printf("%s ", animals.get(i));
        }
        System.out.println(); //dont mind

        //replace
        animals.set(0, "pig");
        animals.set(1, "cow");
        animals.set(2, "goat");

        for(int i = 0; i<animals.size(); i++){
            System.out.printf("%s ", animals.get(i));
        }
        System.out.println(); //dont mind

        //remove
        animals.remove(2);

        for(int i = 0; i<animals.size(); i++){
            System.out.printf("%s ", animals.get(i));
        }
        System.out.println(); //dont mind

        //clear
        animals.clear();

        System.out.println("Cleared");
        for(int i = 0; i<animals.size(); i++){
            System.out.printf("%s ", animals.get(i));
        }

    }
}
