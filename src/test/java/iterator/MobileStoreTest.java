package iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MobileStoreTest {

    private MobileStore mobileStore;
    private Collection applMobilesCollection;

    @BeforeEach
    void setUp() {
        mobileStore = new MobileStore();
        applMobilesCollection = new AppleMobilesCollection(5);
        applMobilesCollection.add(new Mobile("AM1", "Iphone X", 15, 30000));
        applMobilesCollection.add(new Mobile("AM2", "Iphone XI", 25, 40000));
        applMobilesCollection.add(new Mobile("AM3", "Iphone XII", 30, 55000));
    }

    @Test
    void shouldGetTotalCostOfAppleMobilesInStore() {
        double actualCost = mobileStore.getTotalInventoryCost(applMobilesCollection);
        int expectedCost = 3100000;// 15 * 30000 + 25 * 40000 + 30 * 55000;
        Assertions.assertEquals(expectedCost, actualCost);
    }
    @Test
    void shouldGetTotalCostOfSamsungMobilesInStore() {
        var samsungMobileCollection = new SamsungMobileCollection();
        samsungMobileCollection.add(new Mobile("SAM1", "Galaxy X", 15, 20000));
        samsungMobileCollection.add(new Mobile("SAM2", "Galaxy XI", 25, 30000));
        samsungMobileCollection.add(new Mobile("SAM3", "Galaxy XII", 30, 45000));

        double actualCost = mobileStore.getTotalInventoryCost(samsungMobileCollection);
        int expectedCost = 2400000; // 15 * 20000 + 25 * 30000 + 30 * 45000;
        Assertions.assertEquals(expectedCost, actualCost);
    }

}