package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class printCDsOnly {
    public final List<Item> items = new LinkedList<>();

    public void accept(visiteurCD visiteurcd) {
        for (Item item : items) {
            item.accept(visiteurcd);
        }
    }
}