import CarriageType.PassegerCarriage.ClassOfPassengerCarriage;
import CarriageType.PassegerCarriage.PassengerRailwayCarriage;
import CarriageType.Locomotive.Locomotive;
import Train.PassengerTrain;
import CarriageType.Locomotive.SpeedClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dispatcher {
    private static final Logger logger = LogManager.getLogger(Dispatcher.class);
    public static void main(String[] args) {
//Создание локомотива
        logger.debug("Создание поезда");
        logger.info("Почти создался");
        Locomotive locomotive = new Locomotive(1500, SpeedClass.HIGH_SPEED_TRAIN);
        PassengerRailwayCarriage carriage1 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.RESERVEDSEAT);
        PassengerRailwayCarriage carriage2 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.SV);
        PassengerRailwayCarriage carriage3 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.COUPE);
        PassengerRailwayCarriage carriage4 = new PassengerRailwayCarriage(ClassOfPassengerCarriage.SV);

//Создание пассажирского поезда
        List<PassengerRailwayCarriage> composition = new ArrayList<>();
        composition.add(carriage1);
        composition.add(carriage2);
        composition.add(carriage3);
        composition.add(carriage4);

//Сортировка вагонов по классу
        Collections.sort(composition, new ComparatorByClass());

        PassengerTrain train = new PassengerTrain(locomotive, composition);
        System.out.println();
        System.out.println(train);
        train.countingNumbersOfSeatAndBaggage(composition);

    }

}

