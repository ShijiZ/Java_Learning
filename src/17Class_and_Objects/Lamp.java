class Lamp {
    // instance variable
    private boolean isOn;

    //method
    public void turnOn(){
        isOn = true;
    }

    //method
    public void turnOff(){
        isOn = false;
    }

    //method
    public void displayLightStatus(){
        System.out.println("Light on? "+isOn);
    }
}

class ClassObjectsExample{
    public static void main(String[] args){

        Lamp l1 = new Lamp(), l2 = new Lamp();

        l1.turnOn();
        l2.turnOff();

        l1.displayLightStatus();
        l2.displayLightStatus();
    }
}

