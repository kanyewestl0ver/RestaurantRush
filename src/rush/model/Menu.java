package rush.model;

import java.util.List;

/** Imutable list of menu items, implemented as List<MenuItem> */
public final class Menu {

    private final List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("Menu cannot be empty");
        }
        this.items = List.copyOf(items);
    }

    /** The base-setting menu: Salad, Burger, Pasta. */
    public static Menu standard() {
        return new Menu(List.of(
                new MenuItem("Salad", 900, 1),
                new MenuItem("Burger", 1500, 1),
                new MenuItem("Pasta", 1800, 2)));
    }

    public int size() {
        return items.size();
    }

    public MenuItem get(int index) {
        return items.get(index);
    }

    public List<MenuItem> getItems() {
        return items;
    }
}

