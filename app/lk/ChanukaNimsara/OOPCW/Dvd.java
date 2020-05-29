package lk.ChanukaNimsara.OOPCW;

import java.util.Date;

public class Dvd extends LibraryItem {

    private String avilblLanguage;
    private String avilblSubtitles;
    private String producr;
    private String actrs;


    public Dvd(int ISBN, String Title, int Sector, Date Publication_Date, Date Borrowed_Date, String Current_Reader
            , String avilblLanguage, String avilblSubtitles, String producr, String actrs) {

        super(ISBN, Title, Sector, Publication_Date, Borrowed_Date, Current_Reader);
        this.avilblLanguage = avilblLanguage;
        this.avilblSubtitles = avilblSubtitles;
        this.producr = producr;
        this.actrs = actrs;

    }
    public String getAvilblLanguage() {
        return avilblLanguage;
    }

    public String getAvilblSubtitles() {
        return avilblSubtitles;
    }

    public String getProducr() {
        return producr;
    }

    public String getActrs() {
        return actrs;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Available Language :" +this.avilblLanguage);
        System.out.println("Available Subtitles :" +this.avilblSubtitles);
        System.out.println("Producer :" +this.producr);
        System.out.println("Actors :" +this.actrs);

    }

}
