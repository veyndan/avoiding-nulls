import java.util.HashMap;
import java.util.Map;

public class PeopleException {

    Map<String, String> nameToFavouriteColor = new HashMap<>();

    PeopleException() {
        nameToFavouriteColor.put("John", "Blue");
        nameToFavouriteColor.put("Sarah", "Green");
        nameToFavouriteColor.put("Alice", "Yellow");
    }

    public static void main(String[] args) {
        PeopleException people = new PeopleException();
        try {
            System.out.println(people.getFavouriteColorByName("John").equals("Green"));
            System.out.println(people.getFavouriteColorByName("Ned").equals("Green"));
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    String getFavouriteColorByName(String name) throws NameNotFoundException {
        if (nameToFavouriteColor.containsKey(name)) {
            return nameToFavouriteColor.get(name);
        } else {
            throw new NameNotFoundException("There isn't anyone named " + name);
        }
    }

    public class NameNotFoundException extends Exception {

        public NameNotFoundException(String message) {
            super(message);
        }
    }
}
