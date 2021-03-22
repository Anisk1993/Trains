package Train;

import CarriageType.PassegerCarriage.ClassOfPassengerCarriage;
import CarriageType.PassegerCarriage.PassengerRailwayCarriage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTrainTest {

    @Test
    void countingNumbersOfSeat() {
        int allPassengerCapacity = 0;
        List<PassengerRailwayCarriage> listOfCarriage = new ArrayList<>();
        PassengerRailwayCarriage carriage = new PassengerRailwayCarriage(ClassOfPassengerCarriage.SV);
        PassengerRailwayCarriage carriage1 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.COUPE);
        listOfCarriage.add(carriage);
        listOfCarriage.add(carriage1);

        for (PassengerRailwayCarriage railwayCarriage : listOfCarriage) {
            switch (railwayCarriage.getClassOfPassengerCarriage()) {
                case SV:
                    allPassengerCapacity += ClassOfPassengerCarriage.SV.getPassengerCapacity();
                    break;
                case COUPE:
                    allPassengerCapacity += ClassOfPassengerCarriage.COUPE.getPassengerCapacity();
                    break;
                case RESERVEDSEAT:
                    allPassengerCapacity += ClassOfPassengerCarriage.RESERVEDSEAT.getPassengerCapacity();
                    break;
            }

        }
        assertEquals(54, allPassengerCapacity);
    }
    @Test
    void countingNumbersOfBaggageCapacity() {
        List<PassengerRailwayCarriage> listOfCarriage = new ArrayList<>();
        PassengerRailwayCarriage carriage = new PassengerRailwayCarriage(ClassOfPassengerCarriage.RESERVEDSEAT);
        PassengerRailwayCarriage carriage1 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.SV);
        listOfCarriage.add(carriage);
        listOfCarriage.add(carriage1);

        int baggageCapacity = 0;

        for (PassengerRailwayCarriage railwayCarriage : listOfCarriage) {
            switch (railwayCarriage.getClassOfPassengerCarriage()) {
                case SV:
                    baggageCapacity += ClassOfPassengerCarriage.SV.getPassengerCapacity() *
                            ClassOfPassengerCarriage.SV.getBaggageForOnePassenger();
                    break;
                case COUPE:
                    baggageCapacity += ClassOfPassengerCarriage.COUPE.getPassengerCapacity() *
                            ClassOfPassengerCarriage.COUPE.getBaggageForOnePassenger();
                    break;
                case RESERVEDSEAT:
                    baggageCapacity += ClassOfPassengerCarriage.RESERVEDSEAT.getPassengerCapacity() *
                            ClassOfPassengerCarriage.RESERVEDSEAT.getBaggageForOnePassenger();
                    break;
            }

        }
        assertEquals(108, baggageCapacity);
    }
}