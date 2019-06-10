package package2;
import package1.Logger;

public class Main extends Logger{

    public static void main(String[] args){
        Main logger = new Main();

        // invokes debug() from Logger class
        logger.debug("Hello from the Main");
    }
}
