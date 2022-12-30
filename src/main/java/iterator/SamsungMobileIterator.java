package iterator;

import java.util.List;

public class SamsungMobileIterator implements Iterator {
    private List<Mobile> mobiles;
    private int index;

    public SamsungMobileIterator(List<Mobile> mobiles) {
        this.index = 0;
        this.mobiles = mobiles;
    }

    @Override
    public boolean hasNext() {
        if(this.mobiles.isEmpty() || this.index >= this.mobiles.size())
            return false;
        return true;
    }

    @Override
    public Object next() {
        return this.mobiles.get(this.index++);
    }
}
