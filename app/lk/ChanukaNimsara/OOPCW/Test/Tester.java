package lk.ChanukaNimsara.OOPCW.Test;

import lk.ChanukaNimsara.OOPCW.Book;
import lk.ChanukaNimsara.OOPCW.Dvd;
import lk.ChanukaNimsara.OOPCW.LibraryItem;
import lk.ChanukaNimsara.OOPCW.Reader;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tester {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    }

    public static void display(LibraryItem LI){
        LI.display();
    }


}

