import javax.swing.*;  
import java.awt.event.*; 
import java.util.ArrayList;


public class Simulation {
	
	public ArrayList<AlarmeEvent> non_traites;
	public ArrayList<AlarmeEvent> alarmesTraitees;
	public ArrayList<AlarmeEvent> enAttente;
	
     public Simulation(ArrayList<AlarmeEvent> alarmesNon_traites, ArrayList<AlarmeEvent> alarmes_traitees, ArrayList<AlarmeEvent> en_attente){  
    	 non_traites = alarmesNon_traites;
    	 alarmesTraitees = alarmes_traitees;
    	 enAttente = en_attente;
    	 
    	 
    	 
        JFrame f= new JFrame(); 
        f.setSize(1000, 600);
        SwingUtilities.updateComponentTreeUI(f);
        
        
     // Bouton de soumission
        JButton b=new JButton("Submit");  
        b.setBounds(700,100,80,30);  
        f.add(b);
        b.setVisible(true);
        
        
     // Choix bâtiment
        final JLabel label1 = new JLabel("Bâtiment");          
        label1.setBounds(100, 30, 100, 20); 
        final DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Annecy");  
          l1.addElement("Chambéry");  
          l1.addElement("Bourget du Lac");  
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 100, 50);  
          
          f.add(list1); f.add(label1);  
          f.setLayout(null);  
          f.setVisible(true); 
          
          
       // Choix type d'alarme
          final JLabel label2 = new JLabel("type");          
          label2.setBounds(300, 30, 100, 20);  
          final DefaultListModel<String> l2 = new DefaultListModel<>();  
            l2.addElement("Incendie");  
            l2.addElement("Gaz toxique");  
            l2.addElement("Radiations");  
            final JList<String> list2 = new JList<>(l2);  
            list2.setBounds(300, 100, 100, 50);  
            
            f.add(list2); f.add(label2);  

            
            
         // Choix niveau d'alarme
            final JLabel label3 = new JLabel("niveau");          
            label3.setBounds(500, 30, 100, 20);  

            final DefaultListModel<String> l3 = new DefaultListModel<>();  
              l3.addElement("1");  
              l3.addElement("2");  
              l3.addElement("3");  
              final JList<String> list3 = new JList<>(l3);  
              list3.setBounds(500, 100, 100, 50);  
              
              f.add(list3); f.add(label3);  

              
           
              
              
          // Soumission du choix
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String event = "";                       
                 event = list2.getSelectedValue();  
                 	if (event =="Incendie") {
                 		incendies AlarmeI = new incendies(list1.getSelectedValue(), list2.getSelectedValue(), Integer.parseInt(list3.getSelectedValue()));
                 		
                 		en_attente.add(AlarmeI);

                  	    new dialogue(alarmesNon_traites, alarmes_traitees, en_attente);
                 		
                 	};
                 	if (event == "Radiations") {
                 		JLabel LabelRad = new JLabel("niveau de radiations");
                 		LabelRad.setBounds(200, 200, 200, 100); 
                 		
                 		JTextField textNvRad = new JTextField();
                 		textNvRad.setBounds(200,300,100,20);
                 		
                 		f.add(textNvRad); f.add(LabelRad);
                 		
                 		JButton bRad=new JButton("Submit");  
                        bRad.setBounds(200,350,80,30);  
                        f.add(bRad);
                        
                        SwingUtilities.updateComponentTreeUI(f);
                        
                        radiations AlarmeR = new radiations(list1.getSelectedValue(), list2.getSelectedValue(), Integer.parseInt(list3.getSelectedValue()), Integer.parseInt(textNvRad.getText()));
                        en_attente.add(AlarmeR);
                        
                        new dialogue(alarmesNon_traites, alarmes_traitees, en_attente);

                        
                 	};
                 	if (event == "Gaz toxique") {
                 		JLabel LabelGaz = new JLabel("type de gaz émis");
                 		LabelGaz.setBounds(200, 200, 200, 100); 
                 		JTextField textGazEmis = new JTextField();
                 		textGazEmis.setBounds(200, 300, 100, 20);
                 		f.add(textGazEmis); f.add(LabelGaz);
                 		
                 		JButton bGaz=new JButton("Submit");  
                        bGaz.setBounds(200,350,80,30);  
                        f.add(bGaz);
                        
                        SwingUtilities.updateComponentTreeUI(f);
                        
                        gaz_toxiques AlarmeG = new gaz_toxiques(list1.getSelectedValue(), list2.getSelectedValue(), Integer.parseInt(list3.getSelectedValue()), textGazEmis.getText());
                        enAttente.add(AlarmeG);
                        new dialogue(alarmesNon_traites, alarmes_traitees, en_attente);

                        
                 	};
 
         
              }  
           });   

     }  
//public static void main(String args[])  
   // {  
  // new Simulation();  
    //}

}  

