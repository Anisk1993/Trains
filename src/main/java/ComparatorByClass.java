import CarriageType.PassegerCarriage.PassengerRailwayCarriage;

import java.util.Comparator;

public class ComparatorByClass implements Comparator<PassengerRailwayCarriage> {
    @Override
    public int compare(PassengerRailwayCarriage o1, PassengerRailwayCarriage o2) {
        return o1.getClassOfPassengerCarriage().compareTo(o2.getClassOfPassengerCarriage());
    }
}
