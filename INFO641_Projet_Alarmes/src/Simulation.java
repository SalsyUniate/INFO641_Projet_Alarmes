import javax.swing.*;  
import java.awt.event.*; 


public class Simulation {
	
     Simulation(){  
        JFrame f= new JFrame(); 
        f.setSize(800, 400);
        
        //Choix bâtiment
        final JLabel label1 = new JLabel("Bâtiment");          
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
          
          
          // Choix type d'alarme
          final JLabel label2 = new JLabel("type");          
          label2.setBounds(300, 30, 100, 20);  
          final DefaultListModel<String> l2 = new DefaultListModel<>();  
            l2.addElement("Incendie");  
            l2.addElement("Gaz toxique");  
            l2.addElement("Radiations");  
            final JList<String> list2 = new JList<>(l2);  
            list2.setBounds(300, 100, 100, 75);  
            
            f.add(list2); f.add(label2);  
            f.setSize(450,450);  
            f.setLayout(null);  
            f.setVisible(true);
            
            
         // Choix niveau d'alarme
            final JLabel label3 = new JLabel("niveau");          
            label3.setBounds(500, 30, 100, 20);  

            final DefaultListModel<String> l3 = new DefaultListModel<>();  
              l3.addElement("1");  
              l3.addElement("2");  
              l3.addElement("3");  
              final JList<String> list3 = new JList<>(l3);  
              list3.setBounds(500, 100, 100, 75);  
              
              f.add(list3); f.add(label3);  
              f.setSize(450,450);  
              f.setLayout(null);  
              f.setVisible(true);
              
              
           // Bouton de soumission
              JButton b=new JButton("Submit");  
              b.setBounds(650,100,80,30);  
              f.add(b);
              
          
              
              
          
          /*
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";                       
                 data = list1.getSelectedValue();   
                 label.setText(data);  
         
              }  
           });   */
     }  
public static void main(String args[])  
    {  
   new Simulation();  
    }}  

