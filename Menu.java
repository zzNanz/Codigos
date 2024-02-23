import javax.swing.*;

public class Menu extends JFrame{
	
	private JMenuBar barra;
	private JMenu menu1, menu2, menu3;
	private JMenuItem item1, item2, item3, item4, item5;
	
	public Menu(){
		//Iniciando a barra
		barra = new JMenuBar();
		setJMenuBar(barra);
		
		//Comentario
		menu1 = new JMenu("Arquivo");
		barra.add(menu1);
		
		menu2 = new JMenu("Editar");
		barra.add(menu2);
		
		menu3 = new JMenu("Ajuda");
		barra.add(menu3);
		
		//Iniciando os itens do menu1
		item1 = new JMenuItem("Novo");
		menu1.add(item1);
		
		item2 = new JMenuItem("Sair");
		menu1.add(item2);
		
		item3 = new JMenuItem("Desfazer");
		menu2.add(item3);
		
		item4 = new JMenuItem("Refazer");
		menu2.add(item4);
		
		item5 = new JMenuItem("Sobre o App");
		menu3.add(item5);
	}
	
	public static void main(String args[]){
		Menu form = new Menu();
		
		form.setLayout(null);
		form.setBounds(0,0,600,400);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setLocationRelativeTo(null);
	}
}