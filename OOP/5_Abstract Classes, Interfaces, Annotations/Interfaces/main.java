public class main extends car{
    public static void main(String[] args) {
        // // car newCar=new car();

        // // c.acc();
        // // c.stop();
        // // c.brak();

        // media newMidia=new car();
        // newMidia.start();
        // newMidia.stop();


        niceCar car=new niceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        System.out.println("After update engine");
        car.start();

    }
    
}
