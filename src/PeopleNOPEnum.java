import java.util.HashMap;
import java.util.Map;

public class PeopleNOPEnum {

    Map<String, Colour> nameToFavouriteColor = new HashMap<>();

    PeopleNOPEnum() {
        nameToFavouriteColor.put("John", Colour.BLUE);
        nameToFavouriteColor.put("Sarah", Colour.GREEN);
        nameToFavouriteColor.put("Alice", Colour.YELLOW);
    }

    public static void main(String[] args) {
        PeopleNOPEnum people = new PeopleNOPEnum();
        System.out.println(people.getFavouriteColorByName("John").equals("Green"));
        System.out.println(people.getFavouriteColorByName("Ned").equals("Green"));
    }

    Colour getFavouriteColorByName(String name) {
        return nameToFavouriteColor.getOrDefault(name, Colour.UNDEFINED);
    }

    enum Colour {
        BLUE, GREEN, YELLOW, UNDEFINED
    }
}
