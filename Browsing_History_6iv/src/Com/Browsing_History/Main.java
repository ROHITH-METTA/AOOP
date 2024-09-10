package Com.Browsing_History;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory history = new BrowserHistory();
        history.visitPage("https://www.example.com");
        history.visitPage("https://www.google.com");
        history.displayCurrentPage();  
        history.goBack();  
        history.goForward();  
        history.visitPage("https://www.openai.com");
        history.displayCurrentPage();
        history.goBack(); 
        history.displayCurrentPage();
	}

}
