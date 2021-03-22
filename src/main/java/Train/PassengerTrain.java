package Train;

import CarriageType.Locomotive.Locomotive;
import CarriageType.PassegerCarriage.ClassOfPassengerCarriage;
import CarriageType.PassegerCarriage.PassengerRailwayCarriage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class PassengerTrain {
    Locomotive locomotive;
    List<PassengerRailwayCarriage> composition;

    public PassengerTrain(Locomotive locomotive, List<PassengerRailwayCarriage> composition) {
        this.locomotive = locomotive;
        this.composition = composition;
    }

    public void countingNumbersOfSeatAndBaggage(List<PassengerRailwayCarriage> composition) {
        final Logger logger = LogManager.getLogger(PassengerTrain.class);
        logger.debug("Начало подсчета количества мест и багажа");
        int allPassengerCapacity = 0;
        int baggageCapacity = 0;

        for (PassengerRailwayCarriage carriage : composition) {
            switch (carriage.getClassOfPassengerCarriage()) {
                case SV:
                    allPassengerCapacity += ClassOfPassengerCarriage.SV.getPassengerCapacity();
                    baggageCapacity += ClassOfPassengerCarriage.SV.getPassengerCapacity() *
                            ClassOfPassengerCarriage.SV.getBaggageForOnePassenger();
                    break;
                case COUPE:
                    allPassengerCapacity += ClassOfPassengerCarriage.COUPE.getPassengerCapacity();
                    baggageCapacity += ClassOfPassengerCarriage.COUPE.getPassengerCapacity() *
                            ClassOfPassengerCarriage.COUPE.getBaggageForOnePassenger();
                    break;
                case RESERVEDSEAT:
                    allPassengerCapacity += ClassOfPassengerCarriage.RESERVEDSEAT.getPassengerCapacity();
                    baggageCapacity += ClassOfPassengerCarriage.RESERVEDSEAT.getPassengerCapacity() *
                            ClassOfPassengerCarriage.RESERVEDSEAT.getBaggageForOnePassenger();
                    break;
            }

        }
        logger.debug("Вывод значений на экран");
        System.out.println("Количество мест в составе: " + allPassengerCapacity +
                "\nКоличество багажа: " + baggageCapacity + " мест");
    }

    @Override
    public String toString() {
        return "locomotivePower = " + locomotive.getPower() + "\nSpeedClass: " + locomotive.getSpeedClass().toString() +
                "\n" + composition + "\n";
    }
}

