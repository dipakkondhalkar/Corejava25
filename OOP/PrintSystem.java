/*🔸 Question 5: Print Job System – Print Types with Different Time Estimations
Description:
Create a class PrintJob with a method estimateTime() that is overridden by:
PhotoPrint (takes 5 seconds per page),
TextPrint (2 seconds per page),
DocumentPrint (3 seconds per page).
Each subclass should calculate estimated time based on numberOfPages.
Task:
Pass a PrintJob object to a method processPrint(PrintJob p) and display the estimated time.
Objective:
Use polymorphism via inheritance and implement behavior that varies depending on object type — all using basic Java classes.
*/


import java.util.*;

class PrintJob {
    int numberOfPages;

    PrintJob(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    int estimateTime() {
        return 0; // default, overridden by subclasses
    }
}

class PhotoPrint extends PrintJob {
    PhotoPrint(int numberOfPages) {
        super(numberOfPages);
    }

    int estimateTime() {
        return numberOfPages * 5; // 5 seconds per page
    }
}

class TextPrint extends PrintJob {
    TextPrint(int numberOfPages) {
        super(numberOfPages);
    }

    int estimateTime() {
        return numberOfPages * 2; // 2 seconds per page
    }
}

class DocumentPrint extends PrintJob {
    DocumentPrint(int numberOfPages) {
        super(numberOfPages);
    }

    int estimateTime() {
        return numberOfPages * 3; // 3 seconds per page
    }
}

class Printer {
    void processPrint(PrintJob p) {
        System.out.println("Estimated print time:  " + p.estimateTime() + " seconds");
    }
}

public class PrintSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.println("Enter number of pages for Photo Print:");
        int photoPages = sc.nextInt();
        printer.processPrint(new PhotoPrint(photoPages));

        System.out.println("Enter number of pages for Text Print:");
        int textPages = sc.nextInt();
        printer.processPrint(new TextPrint(textPages));

        System.out.println("Enter number of pages for Document Print:");
        int docPages = sc.nextInt();
        printer.processPrint(new DocumentPrint(docPages));
		
        sc.close();
    }
}
