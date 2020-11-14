import java.util.Locale;
import java.util.ResourceBundle;
public class Local {

	public static void main(String[] args) {
		Locale locale= new Locale("en","US");
		ResourceBundle bundle1 = 
				   ResourceBundle.getBundle("ApplicationBundle") ;

				ResourceBundle bundle2 = 
				   ResourceBundle.getBundle("ApplicationBundle", 
				                            locale) ;

				System.out.println(bundle1.getString("bonjour.le.monde")) ;
				System.out.println(bundle2.getString("bonjour.le.monde")) ;
	}

}
