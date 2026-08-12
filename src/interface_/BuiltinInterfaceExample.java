package interface_;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

class MyApp extends Frame{
	public MyApp() {
		setSize(300,300);
		setLayout(new FlowLayout() );
		setVisible(true);
		
		Button b1=new Button("Click this");
		add(b1);
		
	}
}

public class BuiltinInterfaceExample {

	public static void main(String[] args) {
		MyApp obj=new MyApp();


	}

}
