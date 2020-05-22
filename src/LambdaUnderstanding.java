import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Animal {

    private String type;

    private boolean canJump;

    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public String getType(){
        return type;
    }

}



public class LambdaUnderstanding {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Fish", true, false));
        animals.add(new Animal("Dog", true, true));

        print(animals, () -> true);
    }

    private static void print(List<Animal> animals, Supplier<Boolean> filter){
        for (Animal animal: animals){
            System.out.println(animal.getType());
        }
    }

}

