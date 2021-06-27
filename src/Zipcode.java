public class Zipcode extends ServiceCommunicator{



    public Zipcode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);

    }

    public static void main(String[] args) {
        System.out.println(new Zipcode("90404").get());
    }
}
