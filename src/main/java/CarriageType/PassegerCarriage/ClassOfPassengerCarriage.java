package CarriageType.PassegerCarriage;

public enum ClassOfPassengerCarriage {

    SV(18, 3),
    COUPE(36, 2),
    RESERVEDSEAT(54, 1);

    private final int passengerCapacity;
    private final int baggageForOnePassenger;


    ClassOfPassengerCarriage(int passengerCapacity, int baggageForOnePassenger) {
        this.passengerCapacity = passengerCapacity;
        this.baggageForOnePassenger = baggageForOnePassenger;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getBaggageForOnePassenger() {
        return baggageForOnePassenger;
    }

    @Override
    public String toString() {
        return passengerCapacity + "\n";
    }
}
