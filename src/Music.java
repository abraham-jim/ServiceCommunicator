public class Music extends ServiceCommunicator {
    Music(String songTitleorArtistName){
        super("https://itunes.apple.com/search?term=" + songTitleorArtistName + "&limit=1");
    }

    public static void main(String[] args) {
        System.out.println(new Music("Sade").get());
    }
}
