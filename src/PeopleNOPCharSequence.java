import java.util.HashMap;
import java.util.Map;

class PeopleNOPCharSequence {

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getFavouriteColorByName("John").equals("Green"));
        System.out.println(people.getFavouriteColorByName("Ned").equals("Green"));
    }

    Map<String, String> nameToFavouriteColor = new HashMap<>();

    PeopleNOPCharSequence() {
        nameToFavouriteColor.put("John", "Blue");
        nameToFavouriteColor.put("Sarah", "Green");
        nameToFavouriteColor.put("Alice", "Yellow");
    }

    String getFavouriteColorByName(String name) {
        return nameToFavouriteColor.getOrDefault(name, String.valueOf(new NullColour()));
    }

    class NullColour implements CharSequence {

        @Override
        public int length() {
            throw new IllegalStateException();
        }

        @Override
        public char charAt(int index) {
            throw new IllegalStateException();
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            throw new IllegalStateException();
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
}
