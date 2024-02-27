import java.awt.*;
import java.awt.event.*;
// import java.awt.Component.*;
// import javax.lang.model.util.ElementScanner14;
import javax.swing.*;


class NewCalculator extends Frame 
{
    char op;
    int p;
    float result;
    TextField tf0 = new TextField();
    Label l0=new Label("Dev-Tech");
    Label l1=new Label("Enter");
    TextField tf1=new TextField();


    Button b1=new Button("+");
    
    Button b2=new Button("-");
    
    Button b3=new Button("*");
    
    Button b4=new Button("/");
    
    Button b5=new Button("%");
    
    Button b6=new Button("0");
    
    Button b7=new Button("1");
    
    Button b8=new Button("2");
    
    Button b9=new Button("3");
    
    Button b10=new Button("4");
    
    Button b11=new Button("5");
    
    Button b12=new Button("6");
    
    Button b13=new Button("7");
    
    Button b14=new Button("8");

    Button b15=new Button("9");
    
    Button b16=new Button("=");
    
    Button b17=new Button(".");
    
    Button b18=new Button("CE");

    Button b19=new Button("Exit");



    NewCalculator ()
    {
        setTitle("Devesh Calculator");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(410,580);
        setBackground(Color.DARK_GRAY);
        setLayout(null);
        

        // for put the frame in center123=
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int centerX = (screenWidth - frameWidth) / 2;
        int centerY = (screenHeight - frameHeight) / 2;
        setLocation(centerX, centerY);



        l0.setBounds(7,30,45,20);
        add(l0);
        l0.setBackground(Color.BLUE);
        l0.setFont(new Font("Serif", Font.BOLD, 10));


        l1.setBounds(60,90,70,40);
        add(l1);
        // l1.setBackground(Color.CYAN);
        l1.setFont(new Font("Serif", Font.BOLD, 25));


        tf1.setBounds(150,90,200,40);
        add(tf1);
        tf1.setBackground(Color.WHITE);
        tf1.setFont(new Font("Serif", Font.BOLD, 20));


        b1.setBounds(50,200,50,30);
        add(b1);
        b1.setBackground(Color.RED);
        b1.setFont(new Font("Serif", Font.BOLD, 25));


        b2.setBounds(115,200,50,30);
        add(b2);
        b2.setBackground(Color.ORANGE);
        b2.setFont(new Font("Serif", Font.BOLD, 25));


        b3.setBounds(180,200,50,30);
        add(b3);
        b3.setBackground(Color.BLUE);
        b3.setFont(new Font("Serif", Font.BOLD, 25));


        b4.setBounds(245,200,50,30);
        add(b4);
        b4.setBackground(Color.MAGENTA);
        b4.setFont(new Font("Serif", Font.BOLD, 25));


        b5.setBounds(310,200,50,30);
        add(b5);
        b5.setBackground(Color.YELLOW);
        b5.setFont(new Font("Serif", Font.BOLD, 25));


        b6.setBounds(50,280,50,30);
        add(b6);
        b6.setBackground(Color.RED);
        b6.setFont(new Font("Serif", Font.BOLD, 25));


        b7.setBounds(115,280,50,30);
        add(b7);
        b7.setBackground(Color.ORANGE);
        b7.setFont(new Font("Serif", Font.BOLD, 25));


        b8.setBounds(180,280,50,30);
        add(b8);
        b8.setBackground(Color.BLUE);
        b8.setFont(new Font("Serif", Font.BOLD, 25));


        b9.setBounds(245,280,50,30);
        add(b9);
        b9.setBackground(Color.MAGENTA);
        b9.setFont(new Font("Serif", Font.BOLD, 25));


        b10.setBounds(310,280,50,30);
        add(b10);
        b10.setBackground(Color.YELLOW);
        b10.setFont(new Font("Serif", Font.BOLD, 25));


        b11.setBounds(50,340,50,30);
        add(b11);
        b11.setBackground(Color.RED);
        b11.setFont(new Font("Serif", Font.BOLD, 25));


        b12.setBounds(115,340,50,30);
        add(b12);
        b12.setBackground(Color.ORANGE);
        b12.setFont(new Font("Serif", Font.BOLD, 25));


        b13.setBounds(180,340,50,30);
        add(b13);
        b13.setBackground(Color.BLUE);
        b13.setFont(new Font("Serif", Font.BOLD, 25));


        b14.setBounds(245,340,50,30);
        add(b14);
        b14.setBackground(Color.MAGENTA);
        b14.setFont(new Font("Serif", Font.BOLD, 25));


        b15.setBounds(310,340,50,30);
        add(b15);
        b15.setBackground(Color.YELLOW);
        b15.setFont(new Font("Serif", Font.BOLD, 25));


        b16.setBounds(50,420,115,40);
        add(b16);
        b16.setBackground(Color.GREEN);
        b16.setFont(new Font("Serif", Font.BOLD, 25));


        b17.setBounds(180,420,50,40);
        add(b17);
        b17.setBackground(Color.CYAN);
        b17.setFont(new Font("Serif", Font.BOLD, 30));


        b18.setBounds(245,420,115,40);
        add(b18);
        b18.setBackground(Color.RED);
        b18.setFont(new Font("Serif", Font.BOLD, 25));


        b19.setBounds(50,500,310,40);
        add(b19);
        b19.setBackground(Color.CYAN);
        b19.setFont(new Font("Serif", Font.BOLD, 25));

        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "+");
                //  calculateResult();
            }
        });


        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // calculateResult();
                tf1.setText(tf1.getText() + "-");
            }
        });


        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // calculateResult();
                tf1.setText(tf1.getText() + "*");
            }
        });


        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // calculateResult();
                tf1.setText(tf1.getText() + "/");
            }
        });


        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // calculateResult();
                tf1.setText(tf1.getText() + "%");
            }
        });


        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "0");
            }
        });


        b7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "1");
            }
        });


        b8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "2");
            }
        });


        b9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "3");
            }
        });


        b10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "4");
            }
        });


        b11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "5");
            }
        });


        b12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "6");
            }
        });


        b13.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "7");
            }
        });


        b14.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "8");
            }
        });


        b15.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + "9");
            }
        });


        b16.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                calculateResult();
            }
        });


        b17.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf1.setText(tf1.getText() + ".");
            }
        });

        
        b18.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String s = tf1.getText();
                if(s.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Some Values First");
                }
                tf1.setText("");
            }
        });


        b19.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                // new y().setVisible(true);
                dispose();
            }
        });

    }


    void calculateResult()
    {
        String s = tf1.getText();
        if(s.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Some Values First");
        }
        char[] c = s.toCharArray();
        int size = c.length;

        // Find the position of the operator
        for (int i = 0; i < size; i++) 
        {
            if (c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/' || c[i] == '%')
            {
                op = c[i]; 
                p = i;
                break;
            }
        }

        // Extract the digits before and after the operator
        char[] c1 = new char[p];
        char[] c2 = new char[size - p - 1];

        for (int i = 0; i < p; i++)
        {
            c1[i] = c[i];
        }

        for (int i = p + 1; i < size; i++)
        {
            c2[i - p - 1] = c[i];
        }

        // Parse the floating-point numbers
        float num1 = Float.parseFloat(new String(c1).trim());
        float num2 = Float.parseFloat(new String(c2).trim());

        // Perform the arithmetic operation
        switch (op)
        {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        String s0 = String.valueOf(result);
        tf1.setText(s0);
    }


    public static void main(String args[])
    {
        new NewCalculator ();
    }


}