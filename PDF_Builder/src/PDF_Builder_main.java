
public class PDF_Builder_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppView theView = new AppView();
		AppModel theModel = new AppModel();
		AppController theController = new AppController(theView, theModel);
		
		theView.setVisible(true);
	}

}
