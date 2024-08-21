package browsinghistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history;
    private String currentPage;

    public BrowserHistory() {
        history = new ArrayDeque<>();
        currentPage = null;
    }

    public void visitPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
        System.out.println("Visited page: " + page);
    }

    public void goBack() {
        if (history.isEmpty()) {
            System.out.println("No previous page.");
        } else {
            currentPage = history.pop();
            System.out.println("Went back to page: " + currentPage);
        }
    }

    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No current page.");
        }
    }
}
