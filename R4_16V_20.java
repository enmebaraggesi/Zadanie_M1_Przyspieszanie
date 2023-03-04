public class R4_16V_20 implements Engine{

    private double maxRPM = 6000;
    private double RPMPerSec = 336;
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

    @Override
    public void setActualRPM(double actualRPM) {
        this.actualRPM = actualRPM;
    }

    @Override
    public double getActualRPM() {
        return actualRPM;
    }

}
