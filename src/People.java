import java.util.HashMap;
import java.util.Map;

class People {

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getFavouriteColorByName("John").equals("Green"));
        System.out.println(people.getFavouriteColorByName("Ned").equals("Green"));
    }

    Map<String, String> nameToFavouriteColor = new HashMap<>();

    People() {
        nameToFavouriteColor.put("John", "Blue");
        nameToFavouriteColor.put("Sarah", "Green");
        nameToFavouriteColor.put("Alice", "Yellow");
    }

    String getFavouriteColorByName(String name) {
        return nameToFavouriteColor.get(name);
    }
}
