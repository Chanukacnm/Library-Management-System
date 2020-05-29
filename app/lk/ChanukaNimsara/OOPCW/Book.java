package lk.ChanukaNimsara.OOPCW;

import java.util.Date;

public class Book extends LibraryItem {

    private String AuthrName;
    private String Publishr;
    private int TotNumbrOfPages;


    public Book(int ISBN, String Title, int Sector, Date Publication_Date, Date Borrowed_Date, String Current_Reader
            , String AuthrName, String Publishr, int TotNumbrOfPages) {

        super(ISBN, Title, Sector, Publication_Date, Borrowed_Date, Current_Reader);
        this.AuthrName = AuthrName;
        this.Publishr = Publishr;
        this.TotNumbrOfPages = TotNumbrOfPages;
    }

    public String getAuthrName() {
        return AuthrName;
    }

    public String getPublishr() {
        return Publishr;
    }

    public int getTotNumbrOfPages() {
        return TotNumbrOfPages;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The Author Name :" +this.AuthrName);
        System.out.println("The Publishr :" +this.Publishr);
        System.out.println("The Total Number Of Pages :" +this.TotNumbrOfPages);

    }


}