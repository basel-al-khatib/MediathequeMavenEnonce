package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class pritnCatalogue {
    public final List<Item> items = new LinkedList<>();

    public void accept(visiteur visitor) {
        for (Item item : items) {
            item.accept(visitor);
        }
    }
}