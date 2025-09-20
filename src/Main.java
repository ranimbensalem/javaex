//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("animal", "lion",5, true);
        Zoo myZoo = new Zoo("le zoo","tunis", 1);
        myZoo.animals[0]=lion;
        System.out.printf(myZoo.toString());
    }
}