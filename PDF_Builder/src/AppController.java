import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;


public class AppController {

	private AppView view;
	private AppModel model;
	
	public AppController(AppView aview, AppModel amodel){
		view = aview;
		model = amodel;
		view.addCreateListener(new CreateListener());
	}
	
	class CreateListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try {
				model.buildPDF(view.getTitle(), view.getText());
			} catch (FileNotFoundException | DocumentException e1) {
				e1.printStackTrace();
				view.displayErrorMessage("Fail to create "+view.getTitle()+".pdf!!!");
			}
			
			view.displayConfirmationMessage(view.getTitle());
		}
	}
}
