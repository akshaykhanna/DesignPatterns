package iterator;

import java.lang.reflect.Array;
import java.util.List;

public class AppleMobilesIterator implements Iterator {
    private int pos;
    private Mobile mobiles[];

    public AppleMobilesIterator(Mobile[] mobiles) {
        pos = 0;
        this.mobiles = mobiles;
    }

    @Override
    public boolean hasNext() {
        if (pos >= this.mobiles.length || this.mobiles[pos] == null)
            return false;
        return true;
    }

    @Override
    public Mobile next() {
        return mobiles[this.pos++];
    }


}
