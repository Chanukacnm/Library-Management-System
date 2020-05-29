package lk.ChanukaNimsara.OOPCW;

import java.util.Date;

public abstract class LibraryItem {


    private int IsbN;
    private String Titl;
    private int Sectr;
    private Date PublicDate;
    private Date BorrwDate;
    private String CurrReader;



    public LibraryItem(int IsbN, String Titl, int Sectr, Date publicDate, Date BorrwDate, String CurrReader) {
        super();
        this.IsbN = IsbN;
        this.Titl = Titl;
        this.Sectr = Sectr;
        this.PublicDate = publicDate;
        this.BorrwDate = BorrwDate;
        this.CurrReader = CurrReader;
    }

    public int getIsbN() {
        return IsbN;
    }

    public String getTitl() {
        return Titl;
    }

    public int getSectr() {
        return Sectr;
    }

    public Date getPublicDate() {
        return PublicDate;
    }

    public Date getBorrwDate() {
        return BorrwDate;
    }

    public String getCurrReader() {
        return CurrReader;
    }

    public void display(){
        System.out.println("The IsbN :" +this.IsbN);
        System.out.println("The Titl :" +this.Titl);
        System.out.println("The Sectr :" +this.Sectr);
        System.out.println("The Publication Date :" +this.PublicDate);
        System.out.println("The Borrowed Date :" +this.BorrwDate);
        System.out.println("The Current Reader :" +this.CurrReader);

    }


}
