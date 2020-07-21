import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() { 
		this.setVisible(true);
		this.setSize(500, 526);
		this.setTitle("Mi ventana");
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.calculadora(); 
		//this.login();
		this.gato();
	}
	
	public void calculadora()
	{
		Calculadora c = new Calculadora();
		
		this.add(c); 
		this.validate(); 
	}
	
	public void login() {
		Login l = new Login();
		this.add(l);
		this.validate();
	}
	
	public void gato()
	{
		Gato g = new Gato();
		this.add(g);
		this.validate();
	}

}
