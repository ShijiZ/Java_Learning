class MotherBoard2{
    String model;
    public MotherBoard2(String model){
        this.model = model;
    }

    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            if (MotherBoard2.this.model.equals("MSI")){
                return 4;
            }
            else{
                return usb2 + usb3;
            }
        }
    }
}

public class StaticInnerClass2 {
    public static void main(String[] args){
        MotherBoard2.USB usb = new MotherBoard2.USB();
        System.out.println("Total Ports = "+usb.getTotalPorts());
    }
}