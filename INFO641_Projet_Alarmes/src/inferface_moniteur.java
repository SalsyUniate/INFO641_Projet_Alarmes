import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class inferface_moniteur {
	
	public ArrayList<AlarmeEvent> traites;
	public ArrayList<AlarmeEvent> non_traites;
	public JFrame f; 
	
	
	 inferface_moniteur(ArrayList<AlarmeEvent> alarmesTraites,
			 				ArrayList<AlarmeEvent> alarmesNon_traites){  
		 traites = alarmesTraites;
		 non_traites = alarmesNon_traites;
		    
		    	 
	        f= new JFrame(); 
	        f.setSize(1000, 600);
	        JLabel nontraite = new JLabel("nontraite");
	      
	        
	       
	        final DefaultListModel<String> l1 = new DefaultListModel<>();  
	        for (int i = 0; i<non_traites.size(); i++) {
	        	l1.addElement(non_traites.get(i).getType());
	        
	        }

	          final JList<String> list1 = new JList<>(l1);  
	          list1.setBounds(100,100, 100, 75);  
	          
	          f.add(list1); 
	          f.setSize(450,450);  
	          f.setLayout(null);  
	          f.setVisible(true);  
	          
	       // Bouton Détails
              JButton b1=new JButton("Détails");  
              b1.setBounds(300,100,80,30);  
              f.add(b1);
              
              JButton b2=new JButton("Traiter");  
              b2.setBounds(300,200,80,30);  
              f.add(b2);
              
	 
              b1.addActionListener(new ActionListener() {  
            	  public void actionPerformed(ActionEvent e) {  
            		  
            		  
            		  JFrame fp = new JFrame();
            		  fp.setSize(800, 600);
            		  int index = list1.getSelectedIndex();
            		  final JLabel label1 = new JLabel("");          
          	        	label1.setBounds(50, 50, 300, 300); 
          	        	label1.setText(non_traites.get(index).toString());
          	        	fp.add(label1);
          	        	fp.setVisible(true);
          	        	
          	        	JButton bp = new JButton("Fermer");
          	        	bp.setLayout(null);
          	        	//bp.setBounds(100, 50, 150, 150);
          	        	fp.add(bp);
          	        	bp.addActionListener(new ActionListener() {
          	        		public void actionPerformed(ActionEvent e) {
          	        			fp.dispose();
          	        		}
          	        	});
          	        	
            	  };
	
});
              b2.addActionListener(new ActionListener() {
            	  public void actionPerformed(ActionEvent e) {
            		  int index = list1.getSelectedIndex();
            		  traites.add(non_traites.get(index));
            		  non_traites.remove(index);
            		  list1.removeAll();
            		  reset();
            		  f.revalidate();
            		  SwingUtilities.updateComponentTreeUI(f);
            	  }
              });
	 
	

}
public void reset(){
    DefaultListModel<String> l1 = new DefaultListModel<>();  
    for (int i = 0; i<non_traites.size(); i++) {
    	l1.addElement(non_traites.get(i).getType());
    
    }
    final JList<String> list1 = new JList<>(l1);  
    list1.setBounds(100,100, 100, 75);  
    
    f.add(list1); 
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);
}

}











