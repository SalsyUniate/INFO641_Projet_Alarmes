import javax.swing.*; 

public class inferface_moniteur {
	 inferface_moniteur(){  
	        JFrame f= new JFrame(); 
	        f.setSize(800, 400);
	        
	        //Choix bâtiment
	        final JLabel label1 = new JLabel("");          
	        label1.setBounds(100, 30, 100, 20); 
	        final DefaultListModel<String> l1 = new DefaultListModel<>();  
	          l1.addElement("Annecy");  
	          l1.addElement("Chambéry");  
	          l1.addElement("Bourget du Lac");  
	          final JList<String> list1 = new JList<>(l1);  
	          list1.setBounds(100,100, 100, 75);  
	          
	          f.add(list1); f.add(label1);  
	          f.setSize(450,450);  
	          f.setLayout(null);  
	          f.setVisible(true);  
	          
	       // Bouton Détail
              JButton b1=new JButton("Détail");  
              b1.setBounds(300,100,80,30);  
              f.add(b1);
              JButton b2=new JButton("Détail");  
              b2.setBounds(500,100,80,30);  
              f.add(b2);
	          

}
