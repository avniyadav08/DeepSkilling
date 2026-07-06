public class WebApp implements Observer {

    @Override
    public void update(String price) {

        System.out.println("Web App : Stock Price = " + price);

    }

}