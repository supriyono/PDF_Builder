import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class AppModel {

	public void buildPDF(String title, String data) throws FileNotFoundException, DocumentException{
		Document doc = new Document();
		
		PdfWriter.getInstance(doc, new FileOutputStream(title+".pdf"));
		
		doc.open();
		doc.add(new Paragraph(data));
		doc.close();
	}
}

