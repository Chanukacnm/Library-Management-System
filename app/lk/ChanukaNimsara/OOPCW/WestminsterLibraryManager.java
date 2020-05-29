package lk.ChanukaNimsara.OOPCW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class WestminsterLibraryManager implements LibraryManager {

    List<Book > addBooksToList = new ArrayList<>();
    List <Dvd > addDvdToList = new ArrayList<>();
    //List<Reader> addToReader = new ArrayList<>();


    @Override
    public void add_Book(Book BOOK) {



        addBooksToList.add(BOOK);

    }

    @Override
    public void add_Dvd(Dvd DVD) {

        addDvdToList.add(DVD);

    }

    @Override
    public void borrow_Book(Reader READER, LibraryItem LibraryItem) {

    }


    @Override
    public void return_Book(LibraryItem LibryItem) {

    }

    @Override
    public void delete_Book(LibraryItem LibryItem) {

        addBooksToList.remove(LibryItem);
    }

    @Override
    public void displayItem() {
        System.out.println(addBooksToList);
        System.out.println(addDvdToList);

    }

    

}
