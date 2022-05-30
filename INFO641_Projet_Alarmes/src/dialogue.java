import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;


public class dialogue {
	
	public ArrayList<AlarmeEvent> alarmesTraitees;
	public ArrayList<AlarmeEvent> alarmesATraiter;
	public ArrayList<AlarmeEvent> enAttente;
	
	public dialogue(ArrayList<AlarmeEvent> alarmes_a_traiter, 
						ArrayList<AlarmeEvent> alarmes_traitees, 
						ArrayList<AlarmeEvent> en_attente) {
		alarmesATraiter = alarmes_a_traiter;
		alarmesTraitees = alarmes_traitees;
		enAttente = en_attente;
		
		
		JFrame f= new JFrame(); 
        f.setSize(800, 400);
        SwingUtilities.updateComponentTreeUI(f);
		final JLabel label1 = new JLabel("ALARME : "+enAttente.get(0).getType());          
        label1.setBounds(50, 50, 200, 200); 
          f.setLayout(null);  
          f.setVisible(true); 
         
          JButton b=new JButton("ok");  
          b.setBounds(650,100,80,30);  
          f.add(b);
          f.add(label1);
          
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) { 
  
            	  alarmesATraiter.add(en_attente.get(0));
            	  
            	  new inferface_moniteur(alarmes_traitees, alarmes_a_traiter);
            	  f.dispose();
            	  
              };
		
	});

}
}
