import java.time.LocalDate;
import java.time.Period;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    private int gasoline;
    private boolean engineState;

    private LocalDate manufactured;

    public LocalDate getManufactured() {
        return manufactured;
    }

    public void setManufactured(LocalDate manufactured) {
        this.manufactured = manufactured;
    }
    public int getAge() {
        return Period.between(getManufactured(), LocalDate.now()).getYears();
    }
    public static void main(String[] args){
        Car car54 = new Car();
        car54.setName("Car 54");
        car54.setSpeed(20);
        car54.setManufactured(LocalDate.of(1961,9,27));

        Car mach5 = new Car();
        mach5.setName("Porsche");
        mach5.setSpeed(300);
        mach5.setManufactured(LocalDate.of(2023,10,17));

        for (Car car: new Car[]{car54,mach5}){
            System.out.printf("%s is %d years old and is traveling at %d kmh\n", car.getName(), car.getAge(), car.getSpeed());
        }
    }
}
