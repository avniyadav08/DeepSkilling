public class MobileApp implements Observer {

    @Override
    public void update(String price) {

        System.out.println("Mobile App : Stock Price = " + price);

    }

}