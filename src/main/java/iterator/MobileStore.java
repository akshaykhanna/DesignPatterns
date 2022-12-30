package iterator;

public class MobileStore {

    public double getTotalInventoryCost(Collection mobilesCollection) {
        Iterator mobilesIterator = mobilesCollection.createIterator();
        double totalCost = 0;
        while (mobilesIterator.hasNext()) {
            var mobile = (Mobile) (mobilesIterator.next());
            totalCost += mobile.totalCost();
        }
        return totalCost;
    }
}
