

public class main {
    public static void main(String[] args) {
        logger logger1=logger.getInstance();
        logger logger2=logger.getInstance();

   
       System.out.println(logger1==logger2);
    }
}
