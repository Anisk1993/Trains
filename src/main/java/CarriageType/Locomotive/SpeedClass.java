package CarriageType.Locomotive;

public enum SpeedClass {
    HIGH_SPEED_TRAIN(140),
    FAST_PASSENGER_TRAIN(90),
    PASSENGER_TRAIN(50);
    private final int trainSpeed;

    SpeedClass(int trainSpeed) {
        this.trainSpeed = trainSpeed;
    }
}
