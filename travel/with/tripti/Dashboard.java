
package travel.with.tripti;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    JButton addPersonDetails,ViewPersonDetails,CheckPackage,BookPackage,ViewPackage,ViewBookedHotels,Destination;
    JButton ViewHotels,Payments,Calculator, Notepad,about,UpdatePersonDetails,DeletePersonDetails,BookHotels;
    String username;
    Dashboard (String username) {
         this.username = username;
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//extend the botha length and breadth of the frame 
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,63);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new  ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tohima",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,63,300,900);
        add(p2);
        
        addPersonDetails=new JButton("Add Person Details");
        addPersonDetails.setBounds(0,0,300,50);
        addPersonDetails.setBackground(new Color(0,0,102));
        addPersonDetails.setForeground(Color.WHITE);
        addPersonDetails.setFont(new Font("Tahima",Font.PLAIN,20));
        addPersonDetails.setMargin(new Insets(0,0,0,60));
        addPersonDetails.addActionListener(this);
         p2.add(addPersonDetails);
         
       UpdatePersonDetails=new JButton("Update Person Details");
        UpdatePersonDetails.setBounds(0,50,300,50);
        UpdatePersonDetails.setBackground(new Color(0,0,102));
        UpdatePersonDetails.setForeground(Color.WHITE);
        UpdatePersonDetails.setFont(new Font("Tahima",Font.PLAIN,20));
        UpdatePersonDetails.setMargin(new Insets(0,0,0,30));
        UpdatePersonDetails.addActionListener(this);
         p2.add(UpdatePersonDetails);
         
         ViewPersonDetails=new JButton("View Details");
        ViewPersonDetails.setBounds(0,100,300,50);
        ViewPersonDetails.setBackground(new Color(0,0,102));
        ViewPersonDetails.setForeground(Color.WHITE);
       ViewPersonDetails.setFont(new Font("Tahima",Font.PLAIN,20));
        ViewPersonDetails.setMargin(new Insets(0,0,0,130));
        ViewPersonDetails.addActionListener(this);
         p2.add(ViewPersonDetails);
         
        DeletePersonDetails=new JButton("Delete Personal Details");
       DeletePersonDetails.setBounds(0,150,300,50);
       DeletePersonDetails.setBackground(new Color(0,0,102));
       DeletePersonDetails.setForeground(Color.WHITE);
       DeletePersonDetails.setFont(new Font("Tahima",Font.PLAIN,20));
       DeletePersonDetails.setMargin(new Insets(0,0,0,40));
       DeletePersonDetails.addActionListener(this);
       p2.add(DeletePersonDetails);
         
        CheckPackage=new JButton("Check Packages");
       CheckPackage.setBounds(0,200,300,50);
       CheckPackage.setBackground(new Color(0,0,102));
       CheckPackage.setForeground(Color.WHITE);
       CheckPackage.setFont(new Font("Tahima",Font.PLAIN,20));
       CheckPackage.setMargin(new Insets(0,0,0,100));
       CheckPackage.addActionListener(this);
       p2.add(CheckPackage);
         
       BookPackage=new JButton("Book Packages");
       BookPackage.setBounds(0,250,300,50);
       BookPackage.setBackground(new Color(0,0,102));
       BookPackage.setForeground(Color.WHITE);
       BookPackage.setFont(new Font("Tahima",Font.PLAIN,20));
       BookPackage.setMargin(new Insets(0,0,0,100));
       BookPackage.addActionListener(this);
       p2.add(BookPackage);
         
        ViewPackage=new JButton("View Packages");
        ViewPackage.setBounds(0,300,300,50);
        ViewPackage.setBackground(new Color(0,0,102));
        ViewPackage.setForeground(Color.WHITE);
        ViewPackage.setFont(new Font("Tahima",Font.PLAIN,20));
        ViewPackage.setMargin(new Insets(0,0,0,100));
        ViewPackage.addActionListener(this);
        p2.add(ViewPackage);
         
       ViewHotels=new JButton("View Hotels");
        ViewHotels.setBounds(0,350,300,50);
        ViewHotels.setBackground(new Color(0,0,102));
        ViewHotels.setForeground(Color.WHITE);
        ViewHotels.setFont(new Font("Tahima",Font.PLAIN,20));
        ViewHotels.setMargin(new Insets(0,0,0,130));
        ViewHotels.addActionListener(this);
        p2.add(ViewHotels);
         
        BookHotels=new JButton("Book Hotels");
       BookHotels.setBounds(0,400,300,50);
       BookHotels.setBackground(new Color(0,0,102));
       BookHotels.setForeground(Color.WHITE);
       BookHotels.setFont(new Font("Tahima",Font.PLAIN,20));
       BookHotels.setMargin(new Insets(0,0,0,120));
       BookHotels.addActionListener(this);
       p2.add(BookHotels);
       
      ViewBookedHotels=new JButton(" View Booked Hotels");
       ViewBookedHotels.setBounds(0,450,300,50);
       ViewBookedHotels.setBackground(new Color(0,0,102));
       ViewBookedHotels.setForeground(Color.WHITE);
       ViewBookedHotels.setFont(new Font("Tahima",Font.PLAIN,20));
       ViewBookedHotels.setMargin(new Insets(0,0,0,60));
       ViewBookedHotels.addActionListener(this);
       p2.add(ViewBookedHotels);
        
     Destination=new JButton(" Destination");
       Destination.setBounds(0,500,300,50);
       Destination.setBackground(new Color(0,0,102));
       Destination.setForeground(Color.WHITE);
       Destination.setFont(new Font("Tahima",Font.PLAIN,20));
       Destination.setMargin(new Insets(0,0,0,140));
       Destination.addActionListener(this);
       p2.add(Destination);
       
        Payments=new JButton(" Payments");
       Payments.setBounds(0,550,300,50);
       Payments.setBackground(new Color(0,0,102));
       Payments.setForeground(Color.WHITE);
       Payments.setFont(new Font("Tahima",Font.PLAIN,20));
       Payments.setMargin(new Insets(0,0,0,140));
       Payments.addActionListener(this);
       p2.add(Payments);
        
        Calculator=new JButton("Calculator");
       Calculator.setBounds(0,600,300,50);
       Calculator.setBackground(new Color(0,0,102));
       Calculator.setForeground(Color.WHITE);
       Calculator.setFont(new Font("Tahima",Font.PLAIN,20));
       Calculator.setMargin(new Insets(0,0,0,140));
       Calculator.addActionListener(this);
       p2.add(Calculator);
        
       Notepad=new JButton("NotePad");
       Notepad.setBounds(0,650,300,40);
       Notepad.setBackground(new Color(0,0,102));
       Notepad.setForeground(Color.WHITE);
       Notepad.setFont(new Font("Tahima",Font.PLAIN,20));
       Notepad.setMargin(new Insets(0,0,0,150));
       Notepad.addActionListener(this);
       p2.add(Notepad);
       
       about=new JButton("About");
       about.setBounds(0,690,300,50);
       about.setBackground(new Color(0,0,102));
       about.setForeground(Color.WHITE);
       about.setFont(new Font("Tahima",Font.PLAIN,20));
       about.setMargin(new Insets(0,0,0,170));
       about.addActionListener(this);
       p2.add(about);
       
       ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5=i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
       ImageIcon i6=new ImageIcon(i5);
       JLabel image=new JLabel(i6);
       image.setBounds(0,0,1650,1000);
       add(image);
        
       JLabel text=new JLabel("Travel and Tourism Management System");
       text.setBounds(400,70,1200,70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Raleway",Font.PLAIN,55));
       
       image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==addPersonDetails)
        {
            new AddCustomer(username);
        }
        else if(ae.getSource()==ViewPersonDetails)
        {
            new ViewCustomer(username);
        }
        else if(ae.getSource()== UpdatePersonDetails)
        {
             new UpdateCustomer(username);
        }else if(ae.getSource()==CheckPackage)
        {
            new CheckPackage();
        }else if(ae.getSource()==BookPackage)
        {
            new BookPackage(username);
        }else if(ae.getSource()==ViewPackage)
        {
            new ViewPackage(username);
        }else if(ae.getSource()==ViewHotels)
        {
            new CheckHotels();
        }else if(ae.getSource()==Destination)
        {
            new Destination();
        }else if(ae.getSource()==ViewBookedHotels)
            
        {
            new ViewBookedHotel(username);
            
        }
        else if(ae.getSource()==BookHotels)
         {
              new BookHotel(username);
         }
       else if(ae.getSource()==Payments)
        {
            new Payment();
        }else if(ae.getSource()==Calculator)
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource()==Notepad)
        {
            try{
              Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }else if(ae.getSource() ==about)
            
        {
            new About();
        }else if(ae.getSource() ==DeletePersonDetails)
        {
            new DeleteDetails(username);
        }
    }
  public static void main(String [] args)
  {
      new Dashboard("");
  }
}
