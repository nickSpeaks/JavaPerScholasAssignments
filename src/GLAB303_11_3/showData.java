package bootcamp11.Assignments.GLAB303_11_3;

import java.util.ArrayList;
import java.util.Iterator;

public class showData {
    public static void main(String[] args) {

        // instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist) {

            // invoking getter method for getting Data
            System.out.println(showValue.getNumber() + " " + showValue.getName() +
                    " " + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}

//1 cartoon null John
//2 suspense null brothers
//3 Kids null Alex
//4 Action null Max
//5 Java FullStack Programming Alex