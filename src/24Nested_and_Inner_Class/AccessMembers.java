class Car {
    String carName;
    String carType;

    public Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    private String getCarName(){
        return this.carName;
    }

    class Engine{
        String engineType;
        void setEngine(){
            // Access car type of Car
            if (Car.this.carType.equals("4WD")){
                // Invoking method getCarName of Car
                if (Car.this.carName.equals("Crysler")){
                    this.engineType = "Bigger";
                }
                else{
                    this.engineType = "Smaller";
                }
            }
            else{
                this.engineType = "Bigger";
            }
        }

        String getEngineType(){
            return this.engineType;
        }
    }

}

public class AccessMembers {
    public static void main(String[] args){
        Car car1 = new Car("Mazda","8WD");
        Car.Engine engine1 = car1.new Engine();
        engine1.setEngine();
        System.out.println("Engine type for car1 is "+engine1.getEngineType());

        Car car2 = new Car("Crysler","4WD");
        Car.Engine engine2 = car2.new Engine();
        engine2.setEngine();
        System.out.println("Engine type for car2 is "+engine2.getEngineType());
    }
}
