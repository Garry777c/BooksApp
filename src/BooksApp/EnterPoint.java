package BooksApp;

import java.util.ArrayList;

public class EnterPoint {


    public static void main(String[] args) {
        ArrayList <Book> listOfBooks = new ArrayList<>();

        for (int i = 1; i < 12; i++) {
            listOfBooks.add(new Book("Book"+i, "Author"+i, (int) ((Math.random()+Math.random())*100)));
        }

        System.out.println(listOfBooks.size());

        printTheList(listOfBooks);

        listOfBooks.get(2).setNumberOfPages(listOfBooks.get(2).getNumberOfPages()+10);

        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getNumberOfPages()<100){
                listOfBooks.remove(i);
                i--;
            }
        }

        listOfBooks.remove(listOfBooks.size()-1);

        Book[] bookArray = listOfBooks.toArray(new Book[0]);

        for(Book book : bookArray){
            System.out.println(book);
        }

        listOfBooks.clear();

    }

    static void printTheList(ArrayList <Book> list){
        for(Book book : list){
            System.out.println(book);
        }
    }




}
