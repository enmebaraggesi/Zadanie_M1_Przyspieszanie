public class Car {

    private Engine engine;
    private double maxSpeed; // Zarezerwowana zmienna dla ograniczenia prędkości
    private double speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("You sit in a new car. Current speed is 0kmph");
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void gainSpeed(double percent, double seconds) {
        double KMPH_PER_RPM = 0.032; // Stała przeniesienia obrotów na prędkość
        this.speed = KMPH_PER_RPM * engine.speedUp(percent, seconds);
        if (this.maxSpeed != 0 && this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed; // Ogranicznik przyspieszania
            System.out.println("You have reached max speed of this car");
        }
        System.out.println("Current speed is " + this.speed + "kmph");
    }

    public void brake(double percent) {
        this.speed *= 1 - (percent/100); // Hamowanie obniża prędkość jazdy
        engine.setActualRPM(engine.getActualRPM() * (1 - (percent/100))); // Hamowanie obniża obroty silnika
        if (this.speed < 0) {
            this.speed = 0;
            engine.setActualRPM(0);
        }
        System.out.println("After hitting a brake you decelerated to " + this.speed + "kmph");
    }
}
