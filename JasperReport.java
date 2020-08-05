
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
* This is a sample code only. For implementation you can use jasperReport plugins or directly with the application.
* Note: Don't forget to include the library and of course use Java Swing.....
* Additional: For the jasperReport library and jasperReport plugins (for JDK 11 and above) I put it in this repo
*  :)
*/


public class JasperReport{

	public static void main (String [] args){		
        try{           
            String file = "src/report/karyawan.jrxml";            
            JasperReport jr = JasperCompileManager.compileReport(file);                              
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connected.getConnection());            
            JasperViewer.viewReport(jp);
        } catch (Exception ex) {
            
        }
	}	
}