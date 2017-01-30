import java.util.HashMap;
import java.util.Map;

class PeopleNullColour {

    public static void main(String[] args) {
        PeopleNullColour people = new PeopleNullColour();
        System.out.println(people.getFavouriteColorByName("John").equals("Green"));
        System.out.println(people.getFavouriteColorByName("Ned").equals("Green"));
    }

    Map<String, String> nameToFavouriteColor = new HashMap<>();

    PeopleNullColour() {
        nameToFavouriteColor.put("John", "Blue");
        nameToFavouriteColor.put("Sarah", "Green");
        nameToFavouriteColor.put("Alice", "Yellow");
        nameToFavouriteColor.put("Ned", null);
    }

    String getFavouriteColorByName(String name) {
        return nameToFavouriteColor.get(name);
    }
}
