package iterator;


public class AppleMobilesCollection implements Collection {
    private int index;
    Mobile appleMobiles[];


    public AppleMobilesCollection(int size) {
        this.appleMobiles = new Mobile[size];
        index = 0;
    }

    @Override
    public Iterator createIterator() {
        return new AppleMobilesIterator(this.appleMobiles);
    }

    @Override
    public void add(Item item) {
        this.appleMobiles[index++] = (Mobile) item;
    }
}
