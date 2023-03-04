public class R4_16V_14 implements Engine{

    private double maxRPM = 5250;
    private double RPMPerSec = 234;
    private double actualRPM = 0;

    @Override
    public double speedUp(double percent, double seconds) {
        this.actualRPM += (percent / 100) * (seconds * this.RPMPerSec);
        if (this.actualRPM >= this.maxRPM) {
            this.actualRPM = this.maxRPM;
            System.out.println("You have reached maximum power of this car");
        }
        return this.actualRPM;
    }

    public void setActualRPM(double actualRPM) {
        this.actualRPM = actualRPM;
    }

    public double getActualRPM() {
        return actualRPM;
    }
}
