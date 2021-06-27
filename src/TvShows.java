public class TvShows  extends ServiceCommunicator{

    // Constructor
    TvShows( String tvShowName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
    }

    public static void main(String[] args) {
        System.out.println(new TvShows("atlanta").get());
    }
}
