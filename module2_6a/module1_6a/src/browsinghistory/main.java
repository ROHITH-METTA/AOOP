package browsinghistory;

public class main {
    public main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.visitPage("homepage.com");
        history.visitPage("aboutus.com");
        history.displayCurrentPage();
        history.goBack();
        history.displayCurrentPage();
    }
}

