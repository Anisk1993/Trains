package CarriageType.Locomotive;

public class Locomotive {
    private int power;
    private SpeedClass speedClass;

    public Locomotive(int power, SpeedClass speedClass) {
        this.power = power;
        this.speedClass = speedClass;
    }

    public int getPower() {
        return power;
    }

    public SpeedClass getSpeedClass() {
        return speedClass;
    }
}
