import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import java.util.*;

public class ListTests implements StringChecker {
    // checks if string is "Cat"
    public boolean checkString(String s) {
        if (s.compareTo("Cat") == 0) {
            return true;
        }
        return false;
    }

    @Test
    public void filterEmpty() {
        List<String> empty = new ArrayList<>();
        List<String> filtered = ListExamples.filter(empty, this);
        assertEquals(filtered, empty);
    }

    @Test
    public void filterNoCat() {
        List<String> nocat = new ArrayList<>();
        nocat.add("Dog");
        nocat.add("Horse");
        nocat.add("Rabbit");
        List<String> filtered = ListExamples.filter(nocat, this);
        // originally not checking for filtered size to correspond with the
        // number of cats in the arrayList
        assertEquals(numCats(nocat), filtered.size());
        for (String i : filtered) {
            assertEquals(i.compareTo("Cat"), 0);
        }
    }

    @Test
    public void filterCat() {
        List<String> maybecat = new ArrayList<>();
        maybecat.add("Dog");
        maybecat.add("Horse");
        maybecat.add("Cat");
        maybecat.add("Rabbit");
        List<String> cat = new ArrayList<>();
        cat.add("Cat");
        List<String> filtered = ListExamples.filter(maybecat, this);

        // originally not checking for filtered size to correspond with the
        // number of cats in the arrayList
        assertEquals(numCats(maybecat), filtered.size());
        for (String i : filtered) {
            assertEquals(i.compareTo("Cat"), 0);
        }
    }

    public int numCats(List<String> cats) {
        int counter = 0;
        for (String i : cats) {
            if (i.compareTo("Cat") == 0) {
                counter++;
            }
        }
        return counter;
    }
}
