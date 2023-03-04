public interface Engine {
    double speedUp(double percent, double seconds);
    void setActualRPM(double actualRPM);
    double getActualRPM();
}
