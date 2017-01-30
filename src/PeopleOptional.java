import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PeopleOptional {

    Map<String, String> nameToFavouriteColor = new HashMap<>();

    PeopleOptional() {
        nameToFavouriteColor.put("John", "Blue");
        nameToFavouriteColor.put("Sarah", "Green");
        nameToFavouriteColor.put("Alice", "Yellow");
    }

    public static void main(String[] args) {
        PeopleOptional people = new PeopleOptional();
        System.out.println(people.getFavouriteColorByName("John").map(colour -> colour.equals("Green")).orElse(false));
        System.out.println(people.getFavouriteColorByName("Ned").map(colour -> colour.equals("Green")).orElse(false));
    }

    Optional<String> getFavouriteColorByName(String name) {
        return Optional.ofNullable(nameToFavouriteColor.get(name));
    }
}
