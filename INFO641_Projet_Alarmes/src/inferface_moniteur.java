import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class inferface_moniteur {
	
	public ArrayList<AlarmeEvent> traites;
	public ArrayList<AlarmeEvent> non_traites;
	
	
	 inferface_moniteur(ArrayList<AlarmeEvent> alarmesTraites,
			 				ArrayList<AlarmeEvent> alarmesNon_traites){  
		 traites = alarmesTraites;
		 non_traites = alarmesNon_traites;
		    
		    	 
	        JFrame f= new JFrame(); 
	        f.setSize(1000, 600);
	        JLabel nontraite = new JLabel("nontraite");
	      
	        
	        
	     // Choix bâtiment
	        
	        final JLabel label1 = new JLabel("");          
	        label1.setBounds(50, 50, 300, 300); 
	        final DefaultListModel<String> l1 = new DefaultListModel<>();  
	        for (int i = 0; i<non_traites.size(); i++) {
	        	l1.addElement(non_traites.get(i).getType());
	        
	        }

	          final JList<String> list1 = new JList<>(l1);  
	          list1.setBounds(100,100, 100, 75);  
	          
	          f.add(list1); f.add(label1);  
	          f.setSize(450,450);  
	          f.setLayout(null);  
	          f.setVisible(true);  
	          
	       // Bouton Détails
              JButton b1=new JButton("Détails");  
              b1.setBounds(300,100,80,30);  
              f.add(b1);
              
              JButton b2=new JButton("Traiter");  
              b2.setBounds(500,100,80,30);  
              f.add(b2);
	          
	 
	 
	 b1.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) {  
       	  label1.setText(list1.getSelectedValue().toString());
         };
	
	
	
});
	 
	

}}
