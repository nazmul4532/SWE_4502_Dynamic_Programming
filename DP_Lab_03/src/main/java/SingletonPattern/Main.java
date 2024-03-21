package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Nazmul accessed the main function");
        logger.log("Nazmul is showing the application of the singleton pattern Logger instance");
    }
}
