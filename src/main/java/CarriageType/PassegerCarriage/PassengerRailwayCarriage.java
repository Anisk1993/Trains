package CarriageType.PassegerCarriage;

public class PassengerRailwayCarriage {

    private ClassOfPassengerCarriage classOfPassengerCarriage;

    public ClassOfPassengerCarriage getClassOfPassengerCarriage() {
        return classOfPassengerCarriage;
    }

    public PassengerRailwayCarriage(ClassOfPassengerCarriage classOfPassengerCarriage) {
        this.classOfPassengerCarriage = classOfPassengerCarriage;
    }



    @Override
    public String toString() {
        return "\n" + "Carriage: " + classOfPassengerCarriage.name() + ", Passenger capacity: "
                + classOfPassengerCarriage.getPassengerCapacity()
                + ", Baggage capacity: " + classOfPassengerCarriage.getBaggageForOnePassenger()
                * classOfPassengerCarriage.getPassengerCapacity();

    }
}