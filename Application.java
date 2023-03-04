public class Application {
    public static void main(String[] args) {
        
        // Tworzę silniki
        Engine petrol14 = new R4_16V_14();
        Engine petrol20 = new R4_16V_20();
        Engine diesel16 = new R4_16V_16HDI();
        Engine diesel20 = new R4_FAP_20HDI();

        // Samochód 1
        Car peugeot307_14 = new Car(petrol14);
        peugeot307_14.gainSpeed(100, 10);
        peugeot307_14.gainSpeed(100, 10);
        peugeot307_14.gainSpeed(100, 10);

        System.out.println();

        // Samochód 2
        Car peugeot307_20 = new Car(petrol20);
        peugeot307_20.gainSpeed(25, 5);
        peugeot307_20.gainSpeed(50, 5);
        peugeot307_20.gainSpeed(75, 5);
        peugeot307_20.gainSpeed(100, 5);
        peugeot307_20.brake(70);

        System.out.println();

        // Samochód 3
        Car peugeot307_16diesel = new Car(diesel16);
        peugeot307_16diesel.gainSpeed(70, 20);
        peugeot307_16diesel.brake(100);

        System.out.println();

        // Samochód 4
        Car peugeot307_20diesel = new Car(diesel20);
        peugeot307_20diesel.gainSpeed(100, 60);
        peugeot307_20diesel.brake(50);
        peugeot307_20diesel.gainSpeed(75, 3);
        peugeot307_20diesel.gainSpeed(50, 5);

    }
}
