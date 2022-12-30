package iterator;

import java.util.LinkedList;
import java.util.List;

public class SamsungMobileCollection implements Collection {

    private final List<Mobile> mobiles;

    public SamsungMobileCollection() {
        mobiles = new LinkedList<>();
    }

    @Override
    public Iterator createIterator() {
        return new SamsungMobileIterator(mobiles);
    }

    @Override
    public void add(Item item) {
        this.mobiles.add((Mobile) item);
    }
}
