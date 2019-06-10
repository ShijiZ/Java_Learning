public class LoggerImp {
    public static void main(String[] args){
        Logger logger = new Logger();
        logger.debug("debug with level "+logger.debugLevel);
        logger.debugLevel = 5;
        logger.info("info with debug level "+logger.debugLevel);
    }
}
