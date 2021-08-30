import vehicle.Car;
import vehicle.Motorcycle;

public class Main {

    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = typeVehicle.CAR;

        if(typeVehicle == typeVehicle.CAR){
            Car car = new Car("Amarelo", "2021", 2.0, 4);
        }else if(typeVehicle == typeVehicle.MOTORCICLE){
            Motorcycle motorcycle = new Motorcycle("Branca", "2021", 250);
        }
    }
}
