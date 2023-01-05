import handlers.UtilsHandler;

public class Main {
    public static void main(String[] args) {
        UtilsHandler utilsHandler = new UtilsHandler();
        String var = utilsHandler.getStringWithLength(32);
        System.out.println(var);
    }
}