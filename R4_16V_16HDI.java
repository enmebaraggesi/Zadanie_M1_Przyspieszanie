public class R4_16V_16HDI implements Engine{

    private double maxRPM = 4000;
    private double RPMPerSec = 172;
    private double dieselAlteration = 1.31;
    private double actualRPM = 0;

    @Override
    public double speedUp(double percent, double seconds) {
        this.actualRPM += (percent / 100) * (seconds * this.RPMPerSec);
        if (this.actualRPM >= this.maxRPM) {
            this.actualRPM = this.maxRPM;
            System.out.println("You have reached maximum power of this car");
        }
        return dieselAlteration * this.actualRPM;
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
