 import java.awt.Color;

public class Seats extends javax.swing.JFrame {
    
    int count, person, sum;
    String label;
    int A[]={0,0,0,0,0,0,0,0,0,0};                          
    int B[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int C[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int D[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int E[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int F[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int G[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int H[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int I[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  int J[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    public Seats()
    {
        initComponents();
        count = ticket.getSelectedIndex();
        person = count;
        price.setText("");
        next.setEnabled(false);
    }
    
    public void print()
    {
        price.setText("");
        sum = 0;
        amount.setText(sum+"");
        for(int i=0;i<10;i++)
        {
            if(A[i]==1)
            {
                label = price.getText();
                price.setText(label+" A"+(i+1));
                sum = sum + 1000;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(B[i]==1)
            {
                label = price.getText();
                price.setText(label+" B"+(i+1));
                sum = sum + 350;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(C[i]==1)
            {
                label = price.getText();
                price.setText(label+" C"+(i+1));
                sum = sum + 350;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(D[i]==1)
            {
                label = price.getText();
                price.setText(label+" D"+(i+1));
                sum = sum + 150;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(E[i]==1)
            {
                label = price.getText();
                price.setText(label+" E"+(i+1));
                sum = sum + 150;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(F[i]==1)
            {
                label = price.getText();
                price.setText(label+" F"+(i+1));
                sum = sum + 150;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(G[i]==1)
            {
                label = price.getText();
                price.setText(label+" G"+(i+1));
                sum = sum + 150;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(H[i]==1)
            {
                label = price.getText();
                price.setText(label+" H"+(i+1));
                sum = sum + 150;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            if(I[i]==1)
            {
                label = price.getText();
                price.setText(label+" I"+(i+1));
                sum = sum + 70;
                amount.setText(sum+"");
            }
        }
        for(int i=0;i<20;i++)
        {
            
            if(J[i]==1)
            {
                label = price.getText();
                price.setText(label+" J"+(i+1));
                sum = sum + 70;
                amount.setText(sum+"");
            }
        }
        if(count==0)
        {
            next.setEnabled(true);
        }
        else
        {
            next.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dd = new javax.swing.JLabel();
        time = new javax.swing.JComboBox<>();
        ticket = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        a6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        i11 = new javax.swing.JButton();
        i12 = new javax.swing.JButton();
        i13 = new javax.swing.JButton();
        i14 = new javax.swing.JButton();
        i15 = new javax.swing.JButton();
        i16 = new javax.swing.JButton();
        i17 = new javax.swing.JButton();
        i18 = new javax.swing.JButton();
        i19 = new javax.swing.JButton();
        i20 = new javax.swing.JButton();
        j11 = new javax.swing.JButton();
        j12 = new javax.swing.JButton();
        j13 = new javax.swing.JButton();
        j14 = new javax.swing.JButton();
        j15 = new javax.swing.JButton();
        j16 = new javax.swing.JButton();
        j17 = new javax.swing.JButton();
        j18 = new javax.swing.JButton();
        j19 = new javax.swing.JButton();
        j20 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        d8 = new javax.swing.JButton();
        d9 = new javax.swing.JButton();
        d10 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        e7 = new javax.swing.JButton();
        e8 = new javax.swing.JButton();
        e9 = new javax.swing.JButton();
        e10 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        f7 = new javax.swing.JButton();
        f8 = new javax.swing.JButton();
        f9 = new javax.swing.JButton();
        f10 = new javax.swing.JButton();
        g1 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        g7 = new javax.swing.JButton();
        g8 = new javax.swing.JButton();
        g9 = new javax.swing.JButton();
        g10 = new javax.swing.JButton();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        h9 = new javax.swing.JButton();
        h10 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        i1 = new javax.swing.JButton();
        i2 = new javax.swing.JButton();
        i3 = new javax.swing.JButton();
        i4 = new javax.swing.JButton();
        i5 = new javax.swing.JButton();
        i6 = new javax.swing.JButton();
        i7 = new javax.swing.JButton();
        i8 = new javax.swing.JButton();
        i9 = new javax.swing.JButton();
        i10 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        d11 = new javax.swing.JButton();
        d12 = new javax.swing.JButton();
        d13 = new javax.swing.JButton();
        d14 = new javax.swing.JButton();
        d15 = new javax.swing.JButton();
        d16 = new javax.swing.JButton();
        d17 = new javax.swing.JButton();
        d18 = new javax.swing.JButton();
        d19 = new javax.swing.JButton();
        d20 = new javax.swing.JButton();
        e11 = new javax.swing.JButton();
        e12 = new javax.swing.JButton();
        e13 = new javax.swing.JButton();
        e14 = new javax.swing.JButton();
        e15 = new javax.swing.JButton();
        e16 = new javax.swing.JButton();
        e17 = new javax.swing.JButton();
        e18 = new javax.swing.JButton();
        e19 = new javax.swing.JButton();
        e20 = new javax.swing.JButton();
        f11 = new javax.swing.JButton();
        f12 = new javax.swing.JButton();
        f13 = new javax.swing.JButton();
        f14 = new javax.swing.JButton();
        f15 = new javax.swing.JButton();
        f16 = new javax.swing.JButton();
        f17 = new javax.swing.JButton();
        f18 = new javax.swing.JButton();
        f19 = new javax.swing.JButton();
        f20 = new javax.swing.JButton();
        g11 = new javax.swing.JButton();
        g12 = new javax.swing.JButton();
        g13 = new javax.swing.JButton();
        g14 = new javax.swing.JButton();
        g15 = new javax.swing.JButton();
        g16 = new javax.swing.JButton();
        g17 = new javax.swing.JButton();
        g18 = new javax.swing.JButton();
        g19 = new javax.swing.JButton();
        g20 = new javax.swing.JButton();
        h11 = new javax.swing.JButton();
        h12 = new javax.swing.JButton();
        h13 = new javax.swing.JButton();
        h14 = new javax.swing.JButton();
        h15 = new javax.swing.JButton();
        h16 = new javax.swing.JButton();
        h17 = new javax.swing.JButton();
        h18 = new javax.swing.JButton();
        h19 = new javax.swing.JButton();
        h20 = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setResizable(false);

        jLabel1.setText("Movie :");

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setText("Name");
        name.setMaximumSize(new java.awt.Dimension(150, 20));
        name.setMinimumSize(new java.awt.Dimension(150, 20));
        name.setPreferredSize(new java.awt.Dimension(150, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("A / UA");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel5.setText("Screen :");

        screen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        screen.setText("SNo");
        screen.setMaximumSize(new java.awt.Dimension(58, 20));
        screen.setMinimumSize(new java.awt.Dimension(58, 20));
        screen.setPreferredSize(new java.awt.Dimension(58, 20));

        jLabel4.setText("Tickets :");

        jLabel7.setText("Timing :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Day ");

        dd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dd.setText("Date");
        dd.setMaximumSize(new java.awt.Dimension(91, 20));
        dd.setMinimumSize(new java.awt.Dimension(91, 20));
        dd.setPreferredSize(new java.awt.Dimension(91, 20));

        time.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "13:00", "17:00", "21:00" }));
        time.setMaximumSize(new java.awt.Dimension(80, 20));
        time.setMinimumSize(new java.awt.Dimension(80, 20));
        time.setPreferredSize(new java.awt.Dimension(80, 20));

        ticket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ticket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07 ", "08 ", "09 ", "10" }));
        ticket.setMaximumSize(new java.awt.Dimension(60, 20));
        ticket.setMinimumSize(new java.awt.Dimension(60, 20));
        ticket.setPreferredSize(new java.awt.Dimension(60, 20));
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(90, 30));
        back.setMinimumSize(new java.awt.Dimension(90, 30));
        back.setPreferredSize(new java.awt.Dimension(90, 30));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        next.setText("Pay");
        next.setMaximumSize(new java.awt.Dimension(90, 30));
        next.setMinimumSize(new java.awt.Dimension(90, 30));
        next.setPreferredSize(new java.awt.Dimension(90, 30));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel10.setText("Royal Recliner - Rs. 1000.00 (2P)");

        jLabel11.setText("Recliner - Rs. 350.00");

        jLabel12.setText("Club - Rs. 150.00");

        jLabel13.setText("Executive - Rs. 70.00");

        jLabel14.setText("Total :");

        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amount.setText("Amount");

        jLabel16.setText("(in Rs)");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("EXIT");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel17.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel17.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("EXIT");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel18.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel18.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel18.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SCREEN (EYES ON THIS WAY)");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setMaximumSize(new java.awt.Dimension(700, 20));
        jLabel19.setMinimumSize(new java.awt.Dimension(700, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(700, 20));

        jLabel20.setText("Royal Recliner - Rs. 1000.00 (2P)");

        jSeparator3.setMaximumSize(new java.awt.Dimension(1212, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(1212, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(1212, 10));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("A");
        jLabel21.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel21.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel21.setPreferredSize(new java.awt.Dimension(10, 30));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 30));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 30));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        a1.setText("1");
        a1.setMaximumSize(new java.awt.Dimension(70, 30));
        a1.setMinimumSize(new java.awt.Dimension(70, 30));
        a1.setPreferredSize(new java.awt.Dimension(70, 30));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);

        a2.setText("2");
        a2.setMaximumSize(new java.awt.Dimension(70, 30));
        a2.setMinimumSize(new java.awt.Dimension(70, 30));
        a2.setPreferredSize(new java.awt.Dimension(70, 30));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel1.add(a2);

        a3.setText("3");
        a3.setMaximumSize(new java.awt.Dimension(70, 30));
        a3.setMinimumSize(new java.awt.Dimension(70, 30));
        a3.setPreferredSize(new java.awt.Dimension(70, 30));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel1.add(a3);

        a4.setText("4");
        a4.setMaximumSize(new java.awt.Dimension(70, 30));
        a4.setMinimumSize(new java.awt.Dimension(70, 30));
        a4.setPreferredSize(new java.awt.Dimension(70, 30));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jPanel1.add(a4);

        a5.setText("5");
        a5.setMaximumSize(new java.awt.Dimension(70, 30));
        a5.setMinimumSize(new java.awt.Dimension(70, 30));
        a5.setPreferredSize(new java.awt.Dimension(70, 30));
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        jPanel1.add(a5);

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 30));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 30));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        a6.setText("6");
        a6.setMaximumSize(new java.awt.Dimension(70, 30));
        a6.setMinimumSize(new java.awt.Dimension(70, 30));
        a6.setPreferredSize(new java.awt.Dimension(70, 30));
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        jPanel2.add(a6);

        a7.setText("7");
        a7.setMaximumSize(new java.awt.Dimension(70, 30));
        a7.setMinimumSize(new java.awt.Dimension(70, 30));
        a7.setPreferredSize(new java.awt.Dimension(70, 30));
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        jPanel2.add(a7);

        a8.setText("8");
        a8.setMaximumSize(new java.awt.Dimension(70, 30));
        a8.setMinimumSize(new java.awt.Dimension(70, 30));
        a8.setPreferredSize(new java.awt.Dimension(70, 30));
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        jPanel2.add(a8);

        a9.setText("9");
        a9.setMaximumSize(new java.awt.Dimension(70, 30));
        a9.setMinimumSize(new java.awt.Dimension(70, 30));
        a9.setPreferredSize(new java.awt.Dimension(70, 30));
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        jPanel2.add(a9);

        a10.setText("10");
        a10.setMaximumSize(new java.awt.Dimension(70, 30));
        a10.setMinimumSize(new java.awt.Dimension(70, 30));
        a10.setPreferredSize(new java.awt.Dimension(70, 30));
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });
        jPanel2.add(a10);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("ENTRY");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel22.setMaximumSize(new java.awt.Dimension(90, 40));
        jLabel22.setMinimumSize(new java.awt.Dimension(90, 0));
        jLabel22.setPreferredSize(new java.awt.Dimension(90, 40));

        jLabel23.setText("Recliner - Rs. 350.00");

        jSeparator4.setMaximumSize(new java.awt.Dimension(1212, 10));
        jSeparator4.setMinimumSize(new java.awt.Dimension(1212, 10));
        jSeparator4.setPreferredSize(new java.awt.Dimension(1212, 10));

        jLabel24.setText("B");
        jLabel24.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel24.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel24.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("C");
        jLabel25.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel25.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel25.setPreferredSize(new java.awt.Dimension(10, 30));

        jPanel4.setMaximumSize(new java.awt.Dimension(510, 70));
        jPanel4.setMinimumSize(new java.awt.Dimension(510, 70));
        jPanel4.setPreferredSize(new java.awt.Dimension(510, 70));
        jPanel4.setLayout(new java.awt.GridLayout(2, 10, 10, 10));

        i11.setText("11");
        i11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i11ActionPerformed(evt);
            }
        });
        jPanel4.add(i11);

        i12.setText("12");
        i12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i12ActionPerformed(evt);
            }
        });
        jPanel4.add(i12);

        i13.setText("13");
        i13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i13ActionPerformed(evt);
            }
        });
        jPanel4.add(i13);

        i14.setText("14");
        i14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i14ActionPerformed(evt);
            }
        });
        jPanel4.add(i14);

        i15.setText("15");
        i15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i15ActionPerformed(evt);
            }
        });
        jPanel4.add(i15);

        i16.setText("16");
        i16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i16ActionPerformed(evt);
            }
        });
        jPanel4.add(i16);

        i17.setText("17");
        i17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i17ActionPerformed(evt);
            }
        });
        jPanel4.add(i17);

        i18.setText("18");
        i18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i18ActionPerformed(evt);
            }
        });
        jPanel4.add(i18);

        i19.setText("19");
        i19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i19ActionPerformed(evt);
            }
        });
        jPanel4.add(i19);

        i20.setText("20");
        i20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i20ActionPerformed(evt);
            }
        });
        jPanel4.add(i20);

        j11.setText("11");
        j11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j11ActionPerformed(evt);
            }
        });
        jPanel4.add(j11);

        j12.setText("12");
        j12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j12ActionPerformed(evt);
            }
        });
        jPanel4.add(j12);

        j13.setText("13");
        j13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j13ActionPerformed(evt);
            }
        });
        jPanel4.add(j13);

        j14.setText("14");
        j14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j14ActionPerformed(evt);
            }
        });
        jPanel4.add(j14);

        j15.setText("15");
        j15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j15ActionPerformed(evt);
            }
        });
        jPanel4.add(j15);

        j16.setText("16");
        j16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j16ActionPerformed(evt);
            }
        });
        jPanel4.add(j16);

        j17.setText("17");
        j17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j17ActionPerformed(evt);
            }
        });
        jPanel4.add(j17);

        j18.setText("18");
        j18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j18ActionPerformed(evt);
            }
        });
        jPanel4.add(j18);

        j19.setText("19");
        j19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j19ActionPerformed(evt);
            }
        });
        jPanel4.add(j19);

        j20.setText("20");
        j20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j20ActionPerformed(evt);
            }
        });
        jPanel4.add(j20);

        jLabel26.setText("Club - Rs. 150.00");

        jSeparator5.setMaximumSize(new java.awt.Dimension(1212, 10));
        jSeparator5.setMinimumSize(new java.awt.Dimension(1212, 10));
        jSeparator5.setPreferredSize(new java.awt.Dimension(1212, 10));

        jPanel5.setMaximumSize(new java.awt.Dimension(510, 70));
        jPanel5.setMinimumSize(new java.awt.Dimension(510, 70));
        jPanel5.setPreferredSize(new java.awt.Dimension(510, 70));
        jPanel5.setLayout(new java.awt.GridLayout(2, 10, 10, 10));

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel5.add(b1);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel5.add(b2);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel5.add(b3);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel5.add(b4);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel5.add(b5);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel5.add(b6);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel5.add(b7);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel5.add(b8);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel5.add(b9);

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel5.add(b10);

        c1.setText("1");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel5.add(c1);

        c2.setText("2");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel5.add(c2);

        c3.setText("3");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel5.add(c3);

        c4.setText("4");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        jPanel5.add(c4);

        c5.setText("5");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        jPanel5.add(c5);

        c6.setText("6");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        jPanel5.add(c6);

        c7.setText("7");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        jPanel5.add(c7);

        c8.setText("8");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        jPanel5.add(c8);

        c9.setText("9");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        jPanel5.add(c9);

        c10.setText("10");
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });
        jPanel5.add(c10);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("D");
        jLabel27.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel27.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel27.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("E");
        jLabel28.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel28.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel28.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("F");
        jLabel29.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel29.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel29.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("G");
        jLabel30.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel30.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel30.setPreferredSize(new java.awt.Dimension(10, 30));

        jPanel6.setMaximumSize(new java.awt.Dimension(510, 190));
        jPanel6.setMinimumSize(new java.awt.Dimension(510, 190));
        jPanel6.setPreferredSize(new java.awt.Dimension(510, 190));
        jPanel6.setLayout(new java.awt.GridLayout(5, 10, 10, 10));

        d1.setText("1");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        jPanel6.add(d1);

        d2.setText("2");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        jPanel6.add(d2);

        d3.setText("3");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        jPanel6.add(d3);

        d4.setText("4");
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });
        jPanel6.add(d4);

        d5.setText("5");
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });
        jPanel6.add(d5);

        d6.setText("6");
        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });
        jPanel6.add(d6);

        d7.setText("7");
        d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ActionPerformed(evt);
            }
        });
        jPanel6.add(d7);

        d8.setText("8");
        d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ActionPerformed(evt);
            }
        });
        jPanel6.add(d8);

        d9.setText("9");
        d9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d9ActionPerformed(evt);
            }
        });
        jPanel6.add(d9);

        d10.setText("10");
        d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10ActionPerformed(evt);
            }
        });
        jPanel6.add(d10);

        e1.setText("1");
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel6.add(e1);

        e2.setText("2");
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        jPanel6.add(e2);

        e3.setText("3");
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        jPanel6.add(e3);

        e4.setText("4");
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });
        jPanel6.add(e4);

        e5.setText("5");
        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });
        jPanel6.add(e5);

        e6.setText("6");
        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });
        jPanel6.add(e6);

        e7.setText("7");
        e7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e7ActionPerformed(evt);
            }
        });
        jPanel6.add(e7);

        e8.setText("8");
        e8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e8ActionPerformed(evt);
            }
        });
        jPanel6.add(e8);

        e9.setText("9");
        e9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e9ActionPerformed(evt);
            }
        });
        jPanel6.add(e9);

        e10.setText("10");
        e10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e10ActionPerformed(evt);
            }
        });
        jPanel6.add(e10);

        f1.setText("1");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel6.add(f1);

        f2.setText("2");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel6.add(f2);

        f3.setText("3");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        jPanel6.add(f3);

        f4.setText("4");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });
        jPanel6.add(f4);

        f5.setText("5");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });
        jPanel6.add(f5);

        f6.setText("6");
        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });
        jPanel6.add(f6);

        f7.setText("7");
        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });
        jPanel6.add(f7);

        f8.setText("8");
        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });
        jPanel6.add(f8);

        f9.setText("9");
        f9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f9ActionPerformed(evt);
            }
        });
        jPanel6.add(f9);

        f10.setText("10");
        f10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f10ActionPerformed(evt);
            }
        });
        jPanel6.add(f10);

        g1.setText("1");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        jPanel6.add(g1);

        g2.setText("2");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });
        jPanel6.add(g2);

        g3.setText("3");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        jPanel6.add(g3);

        g4.setText("4");
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });
        jPanel6.add(g4);

        g5.setText("5");
        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });
        jPanel6.add(g5);

        g6.setText("6");
        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });
        jPanel6.add(g6);

        g7.setText("7");
        g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ActionPerformed(evt);
            }
        });
        jPanel6.add(g7);

        g8.setText("8");
        g8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g8ActionPerformed(evt);
            }
        });
        jPanel6.add(g8);

        g9.setText("9");
        g9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g9ActionPerformed(evt);
            }
        });
        jPanel6.add(g9);

        g10.setText("10");
        g10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g10ActionPerformed(evt);
            }
        });
        jPanel6.add(g10);

        h1.setText("1");
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });
        jPanel6.add(h1);

        h2.setText("2");
        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });
        jPanel6.add(h2);

        h3.setText("3");
        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });
        jPanel6.add(h3);

        h4.setText("4");
        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });
        jPanel6.add(h4);

        h5.setText("5");
        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });
        jPanel6.add(h5);

        h6.setText("6");
        h6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6ActionPerformed(evt);
            }
        });
        jPanel6.add(h6);

        h7.setText("7");
        h7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h7ActionPerformed(evt);
            }
        });
        jPanel6.add(h7);

        h8.setText("8");
        h8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h8ActionPerformed(evt);
            }
        });
        jPanel6.add(h8);

        h9.setText("9");
        h9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h9ActionPerformed(evt);
            }
        });
        jPanel6.add(h9);

        h10.setText("10");
        h10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h10ActionPerformed(evt);
            }
        });
        jPanel6.add(h10);

        jLabel31.setText("Executive - Rs. 70.00");

        jSeparator6.setMaximumSize(new java.awt.Dimension(1212, 10));
        jSeparator6.setMinimumSize(new java.awt.Dimension(1212, 10));
        jSeparator6.setPreferredSize(new java.awt.Dimension(1212, 10));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("H");
        jLabel32.setMaximumSize(new java.awt.Dimension(10, 20));
        jLabel32.setMinimumSize(new java.awt.Dimension(10, 20));
        jLabel32.setPreferredSize(new java.awt.Dimension(10, 20));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("I");
        jLabel33.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel33.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel33.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("J");
        jLabel34.setMaximumSize(new java.awt.Dimension(10, 30));
        jLabel34.setMinimumSize(new java.awt.Dimension(10, 30));
        jLabel34.setPreferredSize(new java.awt.Dimension(10, 30));

        jPanel7.setMaximumSize(new java.awt.Dimension(510, 70));
        jPanel7.setMinimumSize(new java.awt.Dimension(510, 70));
        jPanel7.setPreferredSize(new java.awt.Dimension(510, 70));
        jPanel7.setLayout(new java.awt.GridLayout(2, 10, 10, 10));

        i1.setText("1");
        i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i1ActionPerformed(evt);
            }
        });
        jPanel7.add(i1);

        i2.setText("2");
        i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i2ActionPerformed(evt);
            }
        });
        jPanel7.add(i2);

        i3.setText("3");
        i3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i3ActionPerformed(evt);
            }
        });
        jPanel7.add(i3);

        i4.setText("4");
        i4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i4ActionPerformed(evt);
            }
        });
        jPanel7.add(i4);

        i5.setText("5");
        i5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i5ActionPerformed(evt);
            }
        });
        jPanel7.add(i5);

        i6.setText("6");
        i6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i6ActionPerformed(evt);
            }
        });
        jPanel7.add(i6);

        i7.setText("7");
        i7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i7ActionPerformed(evt);
            }
        });
        jPanel7.add(i7);

        i8.setText("8");
        i8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i8ActionPerformed(evt);
            }
        });
        jPanel7.add(i8);

        i9.setText("9");
        i9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i9ActionPerformed(evt);
            }
        });
        jPanel7.add(i9);

        i10.setText("10");
        i10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i10ActionPerformed(evt);
            }
        });
        jPanel7.add(i10);

        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        jPanel7.add(j1);

        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        jPanel7.add(j2);

        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        jPanel7.add(j3);

        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        jPanel7.add(j4);

        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        jPanel7.add(j5);

        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        jPanel7.add(j6);

        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });
        jPanel7.add(j7);

        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });
        jPanel7.add(j8);

        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        jPanel7.add(j9);

        j10.setText("10");
        j10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10ActionPerformed(evt);
            }
        });
        jPanel7.add(j10);

        jPanel8.setMaximumSize(new java.awt.Dimension(510, 70));
        jPanel8.setMinimumSize(new java.awt.Dimension(510, 70));
        jPanel8.setPreferredSize(new java.awt.Dimension(510, 70));
        jPanel8.setLayout(new java.awt.GridLayout(2, 10, 10, 10));

        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel8.add(b11);

        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel8.add(b12);

        b13.setText("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel8.add(b13);

        b14.setText("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel8.add(b14);

        b15.setText("15");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel8.add(b15);

        b16.setText("16");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel8.add(b16);

        b17.setText("17");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        jPanel8.add(b17);

        b18.setText("18");
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        jPanel8.add(b18);

        b19.setText("19");
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        jPanel8.add(b19);

        b20.setText("20");
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jPanel8.add(b20);

        c11.setText("11");
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });
        jPanel8.add(c11);

        c12.setText("12");
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });
        jPanel8.add(c12);

        c13.setText("13");
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });
        jPanel8.add(c13);

        c14.setText("14");
        c14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c14ActionPerformed(evt);
            }
        });
        jPanel8.add(c14);

        c15.setText("15");
        c15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c15ActionPerformed(evt);
            }
        });
        jPanel8.add(c15);

        c16.setText("16");
        c16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c16ActionPerformed(evt);
            }
        });
        jPanel8.add(c16);

        c17.setText("17");
        c17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c17ActionPerformed(evt);
            }
        });
        jPanel8.add(c17);

        c18.setText("18");
        c18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c18ActionPerformed(evt);
            }
        });
        jPanel8.add(c18);

        c19.setText("19");
        c19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c19ActionPerformed(evt);
            }
        });
        jPanel8.add(c19);

        c20.setText("20");
        c20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20ActionPerformed(evt);
            }
        });
        jPanel8.add(c20);

        jPanel9.setMaximumSize(new java.awt.Dimension(510, 190));
        jPanel9.setMinimumSize(new java.awt.Dimension(510, 190));
        jPanel9.setPreferredSize(new java.awt.Dimension(510, 190));
        jPanel9.setLayout(new java.awt.GridLayout(5, 10, 10, 10));

        d11.setText("11");
        d11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d11ActionPerformed(evt);
            }
        });
        jPanel9.add(d11);

        d12.setText("12");
        d12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12ActionPerformed(evt);
            }
        });
        jPanel9.add(d12);

        d13.setText("13");
        d13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d13ActionPerformed(evt);
            }
        });
        jPanel9.add(d13);

        d14.setText("14");
        d14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d14ActionPerformed(evt);
            }
        });
        jPanel9.add(d14);

        d15.setText("15");
        d15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d15ActionPerformed(evt);
            }
        });
        jPanel9.add(d15);

        d16.setText("16");
        d16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d16ActionPerformed(evt);
            }
        });
        jPanel9.add(d16);

        d17.setText("17");
        d17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d17ActionPerformed(evt);
            }
        });
        jPanel9.add(d17);

        d18.setText("18");
        d18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d18ActionPerformed(evt);
            }
        });
        jPanel9.add(d18);

        d19.setText("19");
        d19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d19ActionPerformed(evt);
            }
        });
        jPanel9.add(d19);

        d20.setText("20");
        d20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d20ActionPerformed(evt);
            }
        });
        jPanel9.add(d20);

        e11.setText("11");
        e11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e11ActionPerformed(evt);
            }
        });
        jPanel9.add(e11);

        e12.setText("12");
        e12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e12ActionPerformed(evt);
            }
        });
        jPanel9.add(e12);

        e13.setText("13");
        e13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e13ActionPerformed(evt);
            }
        });
        jPanel9.add(e13);

        e14.setText("14");
        e14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e14ActionPerformed(evt);
            }
        });
        jPanel9.add(e14);

        e15.setText("15");
        e15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e15ActionPerformed(evt);
            }
        });
        jPanel9.add(e15);

        e16.setText("16");
        e16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e16ActionPerformed(evt);
            }
        });
        jPanel9.add(e16);

        e17.setText("17");
        e17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e17ActionPerformed(evt);
            }
        });
        jPanel9.add(e17);

        e18.setText("18");
        e18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e18ActionPerformed(evt);
            }
        });
        jPanel9.add(e18);

        e19.setText("19");
        e19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e19ActionPerformed(evt);
            }
        });
        jPanel9.add(e19);

        e20.setText("20");
        e20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e20ActionPerformed(evt);
            }
        });
        jPanel9.add(e20);

        f11.setText("11");
        f11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f11ActionPerformed(evt);
            }
        });
        jPanel9.add(f11);

        f12.setText("12");
        f12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f12ActionPerformed(evt);
            }
        });
        jPanel9.add(f12);

        f13.setText("13");
        f13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f13ActionPerformed(evt);
            }
        });
        jPanel9.add(f13);

        f14.setText("14");
        f14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f14ActionPerformed(evt);
            }
        });
        jPanel9.add(f14);

        f15.setText("15");
        f15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f15ActionPerformed(evt);
            }
        });
        jPanel9.add(f15);

        f16.setText("16");
        f16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f16ActionPerformed(evt);
            }
        });
        jPanel9.add(f16);

        f17.setText("17");
        f17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f17ActionPerformed(evt);
            }
        });
        jPanel9.add(f17);

        f18.setText("18");
        f18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f18ActionPerformed(evt);
            }
        });
        jPanel9.add(f18);

        f19.setText("19");
        f19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f19ActionPerformed(evt);
            }
        });
        jPanel9.add(f19);

        f20.setText("20");
        f20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f20ActionPerformed(evt);
            }
        });
        jPanel9.add(f20);

        g11.setText("11");
        g11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g11ActionPerformed(evt);
            }
        });
        jPanel9.add(g11);

        g12.setText("12");
        g12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12ActionPerformed(evt);
            }
        });
        jPanel9.add(g12);

        g13.setText("13");
        g13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13ActionPerformed(evt);
            }
        });
        jPanel9.add(g13);

        g14.setText("14");
        g14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g14ActionPerformed(evt);
            }
        });
        jPanel9.add(g14);

        g15.setText("15");
        g15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g15ActionPerformed(evt);
            }
        });
        jPanel9.add(g15);

        g16.setText("16");
        g16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g16ActionPerformed(evt);
            }
        });
        jPanel9.add(g16);

        g17.setText("17");
        g17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g17ActionPerformed(evt);
            }
        });
        jPanel9.add(g17);

        g18.setText("18");
        g18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g18ActionPerformed(evt);
            }
        });
        jPanel9.add(g18);

        g19.setText("19");
        g19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g19ActionPerformed(evt);
            }
        });
        jPanel9.add(g19);

        g20.setText("20");
        g20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g20ActionPerformed(evt);
            }
        });
        jPanel9.add(g20);

        h11.setText("11");
        h11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h11ActionPerformed(evt);
            }
        });
        jPanel9.add(h11);

        h12.setText("12");
        h12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h12ActionPerformed(evt);
            }
        });
        jPanel9.add(h12);

        h13.setText("13");
        h13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h13ActionPerformed(evt);
            }
        });
        jPanel9.add(h13);

        h14.setText("14");
        h14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h14ActionPerformed(evt);
            }
        });
        jPanel9.add(h14);

        h15.setText("15");
        h15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h15ActionPerformed(evt);
            }
        });
        jPanel9.add(h15);

        h16.setText("16");
        h16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h16ActionPerformed(evt);
            }
        });
        jPanel9.add(h16);

        h17.setText("17");
        h17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h17ActionPerformed(evt);
            }
        });
        jPanel9.add(h17);

        h18.setText("18");
        h18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h18ActionPerformed(evt);
            }
        });
        jPanel9.add(h18);

        h19.setText("19");
        h19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h19ActionPerformed(evt);
            }
        });
        jPanel9.add(h19);

        h20.setText("20");
        h20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h20ActionPerformed(evt);
            }
        });
        jPanel9.add(h20);

        price.setText("abcdefghijklmnopqrstuvwxyz1234567890");

        refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\prati\\Documents\\NetBeansProjects\\MooV_Zone\\refresh.png")); // NOI18N
        refresh.setMaximumSize(new java.awt.Dimension(30, 30));
        refresh.setMinimumSize(new java.awt.Dimension(30, 30));
        refresh.setPreferredSize(new java.awt.Dimension(30, 30));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(time, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(161, 161, 161)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(163, 163, 163)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(164, 164, 164)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel16)
                            .addComponent(amount)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(price)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void i11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i11ActionPerformed
        if(count>0&&I[10]==0)
        {
            I[10]=1;
            i11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[10]==1)
        {   
            I[10]=0;
            i11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i11ActionPerformed

    private void j20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j20ActionPerformed
        if(count>0&&J[19]==0)
        {
            J[19]=1;
            j20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[19]==1)
        {   
            J[19]=0;
            j20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j20ActionPerformed

    private void i20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i20ActionPerformed
        if(count>0&&I[19]==0)
        {
            I[19]=1;
            i20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[19]==1)
        {   
            I[19]=0;
            i20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i20ActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        if(count>0&&H[0]==0)
        {
            H[0]=1;
            h1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[0]==1)
        {   
            H[0]=0;
            h1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h1ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        if(count>0&&B[10]==0)
        {
            B[10]=1;
            b11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[10]==1)
        {   
            B[10]=0;
            b11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b11ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        if(count>0&&B[19]==0)
        {
            B[19]=1;
            b20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[19]==1)
        {   
            B[19]=0;
            b20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b20ActionPerformed

    private void c20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20ActionPerformed
        if(count>0&&C[19]==0)
        {
            C[19]=1;
            c20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[19]==1)
        {   
            C[19]=0;
            c20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c20ActionPerformed

    private void d11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d11ActionPerformed
        if(count>0&D[10]==0)
        {
            D[10]=1;
            d11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[10]==1)
        {   
            D[10]=0;
            d11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d11ActionPerformed

    private void d20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d20ActionPerformed
        if(count>0&D[19]==0)
        {
            D[19]=1;
            d20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[19]==1)
        {   
            D[19]=0;
            d20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d20ActionPerformed

    private void e11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e11ActionPerformed
        if(count>0&E[10]==0)
        {
            E[10]=1;
            e11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[10]==1)
        {   
            E[10]=0;
            e11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e11ActionPerformed

    private void f11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f11ActionPerformed
        if(count>0&F[10]==0)
        {
            F[10]=1;
            f11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[10]==1)
        {   
            F[10]=0;
            f11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f11ActionPerformed

    private void f20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f20ActionPerformed
        if(count>0&F[19]==0)
        {
            F[19]=1;
            f20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[19]==1)
        {   
            F[19]=0;
            f20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f20ActionPerformed

    private void g11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g11ActionPerformed
        if(count>0&G[10]==0)
        {
            G[10]=1;
            g11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[10]==1)
        {   
            G[10]=0;
            g11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g11ActionPerformed

    private void h11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h11ActionPerformed
        if(count>0&H[10]==0)
        {
            H[10]=1;
            h11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[10]==1)
        {   
            H[10]=0;
            h11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h11ActionPerformed

    private void h20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h20ActionPerformed
        if(count>0&H[19]==0)
        {
            H[19]=1;
            h20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[19]==1)
        {   
            H[19]=0;
            h20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h20ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        if(count>0&G[1]==0)
        {
            G[1]=1;
            g2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[1]==1)
        {   
            G[1]=0;
            g2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g2ActionPerformed

    private void i7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i7ActionPerformed
        if(count>0&I[6]==0)
        {
            I[6]=1;
            i7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[6]==1)
        {   
            I[6]=0;
            i7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        if(count>0&J[7]==0)
        {
            J[7]=1;
            j8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[7]==1)
        {   
            J[7]=0;
            j8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j8ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        if(count>0&&A[0]==0)
        {
            A[0]=1;
            a1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[0]==1)
        {   
            A[0]=0;
            a1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        if(count>0&&A[1]==0)
        {
            A[1]=1;
            a2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[1]==1)
        {   
            A[1]=0;
            a2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        if(count>0&&A[2]==0)
        {
            A[2]=1;
            a3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[2]==1)
        {   
            A[2]=0;
            a3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        if(count>0&&A[3]==0)
        {
            A[3]=1;
            a4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[3]==1)
        {   
            A[3]=0;
            a4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        if(count>0&&A[4]==0)
        {
            A[4]=1;
            a5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[4]==1)
        {   
            A[4]=0;
            a5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        if(count>0&&A[5]==0)
        {
            A[5]=1;
            a6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[5]==1)
        {   
            A[5]=0;
            a6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        if(count>0&&A[6]==0)
        {
            A[6]=1;
            a7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[6]==1)
        {   
            A[6]=0;
            a7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        if(count>0&&A[7]==0)
        {
            A[7]=1;
            a8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[7]==1)
        {   
            A[7]=0;
            a8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        if(count>0&&A[8]==0)
        {
            A[8]=1;
            a9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[8]==1)
        {   
            A[8]=0;
            a9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        if(count>0&&A[9]==0)
        {
            A[9]=1;
            a10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&A[9]==1)
        {   
            A[9]=0;
            a10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_a10ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(count>0&&B[0]==0)
        {
            B[0]=1;
            b1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[0]==1)
        {   
            B[0]=0;
            b1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(count>0&&B[1]==0)
        {
            B[1]=1;
            b2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[1]==1)
        {   
            B[1]=0;
            b2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(count>0&&B[2]==0)
        {
            B[2]=1;
            b3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[2]==1)
        {   
            B[2]=0;
            b3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(count>0&&B[3]==0)
        {
            B[3]=1;
            b4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[3]==1)
        {   
            B[3]=0;
            b4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(count>0&&B[4]==0)
        {
            B[4]=1;
            b5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[4]==1)
        {   
            B[4]=0;
            b5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(count>0&&B[5]==0)
        {
            B[5]=1;
            b6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[5]==1)
        {   
            B[5]=0;
            b6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(count>0&&B[6]==0)
        {
            B[6]=1;
            b7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[6]==1)
        {   
            B[6]=0;
            b7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(count>0&&B[7]==0)
        {
            B[7]=1;
            b8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[7]==1)
        {   
            B[7]=0;
            b8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(count>0&&B[8]==0)
        {
            B[8]=1;
            b9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[8]==1)
        {   
            B[8]=0;
            b9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(count>0&&B[9]==0)
        {
            B[9]=1;
            b10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[9]==1)
        {   
            B[9]=0;
            b10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b10ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        if(count>0&&B[11]==0)
        {
            B[11]=1;
            b12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[11]==1)
        {   
            B[11]=0;
            b12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        if(count>0&&B[12]==0)
        {
            B[12]=1;
            b13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[12]==1)
        {   
            B[12]=0;
            b13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        if(count>0&&B[13]==0)
        {
            B[13]=1;
            b14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[13]==1)
        {   
            B[13]=0;
            b14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        if(count>0&&B[14]==0)
        {
            B[14]=1;
            b15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[14]==1)
        {   
            B[14]=0;
            b15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        if(count>0&&B[15]==0)
        {
            B[15]=1;
            b16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[15]==1)
        {   
            B[15]=0;
            b16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        if(count>0&&B[16]==0)
        {
            B[16]=1;
            b17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[16]==1)
        {   
            B[16]=0;
            b17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        if(count>0&&B[17]==0)
        {
            B[17]=1;
            b18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[17]==1)
        {   
            B[17]=0;
            b18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        if(count>0&&B[18]==0)
        {
            B[18]=1;
            b19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&B[18]==1)
        {   
            B[18]=0;
            b19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_b19ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        if(count>0&&C[0]==0)
        {
            C[0]=1;
            c1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[0]==1)
        {   
            C[0]=0;
            c1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        if(count>0&&C[1]==0)
        {
            C[1]=1;
            c2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[1]==1)
        {   
            C[1]=0;
            c2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        if(count>0&&C[2]==0)
        {
            C[2]=1;
            c3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[2]==1)
        {   
            C[2]=0;
            c3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        if(count>0&&C[3]==0)
        {
            C[3]=1;
            c4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[3]==1)
        {   
            C[3]=0;
            c4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        if(count>0&&C[4]==0)
        {
            C[4]=1;
            c5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[4]==1)
        {   
            C[4]=0;
            c5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        if(count>0&&C[5]==0)
        {
            C[5]=1;
            c6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[5]==1)
        {   
            C[5]=0;
            c6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        if(count>0&&C[6]==0)
        {
            C[6]=1;
            c7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[6]==1)
        {   
            C[6]=0;
            c7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        if(count>0&&C[7]==0)
        {
            C[7]=1;
            c8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[7]==1)
        {   
            C[7]=0;
            c8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        if(count>0&&C[8]==0)
        {
            C[8]=1;
            c9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[8]==1)
        {   
            C[8]=0;
            c9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c9ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        if(count>0&&C[9]==0)
        {
            C[9]=1;
            c10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[9]==1)
        {   
            C[9]=0;
            c10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c10ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        if(count>0&&C[10]==0)
        {
            C[10]=1;
            c11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[10]==1)
        {   
            C[10]=0;
            c11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c11ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        if(count>0&&C[11]==0)
        {
            C[11]=1;
            c12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[11]==1)
        {   
            C[11]=0;
            c12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c12ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
        if(count>0&&C[12]==0)
        {
            C[12]=1;
            c13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[12]==1)
        {   
            C[12]=0;
            c13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c13ActionPerformed

    private void c14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c14ActionPerformed
        if(count>0&&C[13]==0)
        {
            C[13]=1;
            c14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[13]==1)
        {   
            C[13]=0;
            c14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c14ActionPerformed

    private void c15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c15ActionPerformed
        if(count>0&&C[14]==0)
        {
            C[14]=1;
            c15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[14]==1)
        {   
            C[14]=0;
            c15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c15ActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c16ActionPerformed
        if(count>0&&C[15]==0)
        {
            C[15]=1;
            c16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[15]==1)
        {   
            C[15]=0;
            c16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c16ActionPerformed

    private void c17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c17ActionPerformed
        if(count>0&&C[16]==0)
        {
            C[16]=1;
            c17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[16]==1)
        {   
            C[16]=0;
            c17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c17ActionPerformed

    private void c18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c18ActionPerformed
        if(count>0&&C[17]==0)
        {
            C[17]=1;
            c18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[17]==1)
        {   
            C[17]=0;
            c18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c18ActionPerformed

    private void c19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c19ActionPerformed
        if(count>0&&C[18]==0)
        {
            C[18]=1;
            c19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&C[18]==1)
        {   
            C[18]=0;
            c19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_c19ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        if(count>0&D[0]==0)
        {
            D[0]=1;
            d1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[0]==1)
        {   
            D[0]=0;
            d1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        if(count>0&D[1]==0)
        {
            D[1]=1;
            d2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[1]==1)
        {   
            D[1]=0;
            d2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        if(count>0&D[2]==0)
        {
            D[2]=1;
            d3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[2]==1)
        {   
            D[2]=0;
            d3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        if(count>0&D[3]==0)
        {
            D[3]=1;
            d4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[3]==1)
        {   
            D[3]=0;
            d4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        if(count>0&D[4]==0)
        {
            D[4]=1;
            d5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[4]==1)
        {   
            D[4]=0;
            d5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d5ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        if(count>0&D[5]==0)
        {
            D[5]=1;
            d6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[5]==1)
        {   
            D[5]=0;
            d6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d6ActionPerformed

    private void d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ActionPerformed
        if(count>0&D[6]==0)
        {
            D[6]=1;
            d7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[6]==1)
        {   
            D[6]=0;
            d7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d7ActionPerformed

    private void d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ActionPerformed
        if(count>0&D[7]==0)
        {
            D[7]=1;
            d8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[7]==1)
        {   
            D[7]=0;
            d8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d8ActionPerformed

    private void d9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d9ActionPerformed
        if(count>0&D[8]==0)
        {
            D[8]=1;
            d9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[8]==1)
        {   
            D[8]=0;
            d9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d9ActionPerformed

    private void d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10ActionPerformed
        if(count>0&D[9]==0)
        {
            D[9]=1;
            d10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[9]==1)
        {   
            D[9]=0;
            d10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d10ActionPerformed

    private void d12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12ActionPerformed
        if(count>0&D[11]==0)
        {
            D[11]=1;
            d12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[11]==1)
        {   
            D[11]=0;
            d12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d12ActionPerformed

    private void d13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d13ActionPerformed
        if(count>0&D[12]==0)
        {
            D[12]=1;
            d13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[12]==1)
        {   
            D[12]=0;
            d13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d13ActionPerformed

    private void d14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d14ActionPerformed
        if(count>0&D[13]==0)
        {
            D[13]=1;
            d14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[13]==1)
        {   
            D[13]=0;
            d14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d14ActionPerformed

    private void d15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d15ActionPerformed
        if(count>0&D[14]==0)
        {
            D[14]=1;
            d15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[14]==1)
        {   
            D[14]=0;
            d15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d15ActionPerformed

    private void d16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d16ActionPerformed
        if(count>0&D[15]==0)
        {
            D[15]=1;
            d16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[15]==1)
        {   
            D[15]=0;
            d16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d16ActionPerformed

    private void d17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d17ActionPerformed
        if(count>0&D[16]==0)
        {
            D[16]=1;
            d17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[16]==1)
        {   
            D[16]=0;
            d17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d17ActionPerformed

    private void d18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d18ActionPerformed
        if(count>0&D[17]==0)
        {
            D[17]=1;
            d18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[17]==1)
        {   
            D[17]=0;
            d18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d18ActionPerformed

    private void d19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d19ActionPerformed
        if(count>0&D[18]==0)
        {
            D[18]=1;
            d19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&D[18]==1)
        {   
            D[18]=0;
            d19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_d19ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        if(count>0&E[0]==0)
        {
            E[0]=1;
            e1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[0]==1)
        {   
            E[0]=0;
            e1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        if(count>0&E[1]==0)
        {
            E[1]=1;
            e2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[1]==1)
        {   
            E[1]=0;
            e2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        if(count>0&E[2]==0)
        {
            E[2]=1;
            e3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[2]==1)
        {   
            E[2]=0;
            e3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e3ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        if(count>0&E[3]==0)
        {
            E[3]=1;
            e4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[3]==1)
        {   
            E[3]=0;
            e4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e4ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
        if(count>0&E[4]==0)
        {
            E[4]=1;
            e5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[4]==1)
        {   
            E[4]=0;
            e5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e5ActionPerformed

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        if(count>0&E[5]==0)
        {
            E[5]=1;
            e6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[5]==1)
        {   
            E[5]=0;
            e6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e6ActionPerformed

    private void e7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e7ActionPerformed
        if(count>0&E[6]==0)
        {
            E[6]=1;
            e7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[6]==1)
        {   
            E[6]=0;
            e7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e7ActionPerformed

    private void e8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e8ActionPerformed
        if(count>0&E[7]==0)
        {
            E[7]=1;
            e8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[7]==1)
        {   
            E[7]=0;
            e8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e8ActionPerformed

    private void e9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e9ActionPerformed
        if(count>0&E[8]==0)
        {
            E[8]=1;
            e9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[8]==1)
        {   
            E[8]=0;
            e9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e9ActionPerformed

    private void e10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e10ActionPerformed
        if(count>0&E[9]==0)
        {
            E[9]=1;
            e10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[9]==1)
        {   
            E[9]=0;
            e10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e10ActionPerformed

    private void e12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e12ActionPerformed
        if(count>0&E[11]==0)
        {
            E[11]=1;
            e12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[11]==1)
        {   
            E[11]=0;
            e12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e12ActionPerformed

    private void e13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e13ActionPerformed
        if(count>0&E[12]==0)
        {
            E[12]=1;
            e13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[12]==1)
        {   
            E[12]=0;
            e13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e13ActionPerformed

    private void e14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e14ActionPerformed
        if(count>0&E[13]==0)
        {
            E[13]=1;
            e14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[13]==1)
        {   
            E[13]=0;
            e14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e14ActionPerformed

    private void e15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e15ActionPerformed
        if(count>0&E[14]==0)
        {
            E[14]=1;
            e15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[14]==1)
        {   
            E[14]=0;
            e15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e15ActionPerformed

    private void e16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e16ActionPerformed
        if(count>0&E[15]==0)
        {
            E[15]=1;
            e16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[15]==1)
        {   
            E[15]=0;
            e16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e16ActionPerformed

    private void e17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e17ActionPerformed
        if(count>0&E[16]==0)
        {
            E[16]=1;
            e17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[16]==1)
        {   
            E[16]=0;
            e17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e17ActionPerformed

    private void e18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e18ActionPerformed
        if(count>0&E[17]==0)
        {
            E[17]=1;
            e18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[17]==1)
        {   
            E[17]=0;
            e18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e18ActionPerformed

    private void e19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e19ActionPerformed
        if(count>0&E[18]==0)
        {
            E[18]=1;
            e19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[18]==1)
        {   
            E[18]=0;
            e19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e19ActionPerformed

    private void e20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e20ActionPerformed
        if(count>0&E[19]==0)
        {
            E[19]=1;
            e20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&E[19]==1)
        {   
            E[19]=0;
            e20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_e20ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        if(count>0&F[0]==0)
        {
            F[0]=1;
            f1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[0]==1)
        {   
            F[0]=0;
            f1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        if(count>0&F[1]==0)
        {
            F[1]=1;
            f2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[1]==1)
        {   
            F[1]=0;
            f2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        if(count>0&F[2]==0)
        {
            F[2]=1;
            f3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[2]==1)
        {   
            F[2]=0;
            f3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f3ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        if(count>0&F[3]==0)
        {
            F[3]=1;
            f4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[3]==1)
        {   
            F[3]=0;
            f4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f4ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        if(count>0&F[4]==0)
        {
            F[4]=1;
            f5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[4]==1)
        {   
            F[4]=0;
            f5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f5ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        if(count>0&F[5]==0)
        {
            F[5]=1;
            f6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[5]==1)
        {   
            F[5]=0;
            f6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f6ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        if(count>0&F[6]==0)
        {
            F[6]=1;
            f7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[6]==1)
        {   
            F[6]=0;
            f7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f7ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed
        if(count>0&F[7]==0)
        {
            F[7]=1;
            f8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[7]==1)
        {   
            F[7]=0;
            f8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f8ActionPerformed

    private void f9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f9ActionPerformed
        if(count>0&F[8]==0)
        {
            F[8]=1;
            f9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[8]==1)
        {   
            F[8]=0;
            f9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f9ActionPerformed

    private void f10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f10ActionPerformed
        if(count>0&F[9]==0)
        {
            F[9]=1;
            f10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[9]==1)
        {   
            F[9]=0;
            f10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f10ActionPerformed

    private void f12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f12ActionPerformed
        if(count>0&F[11]==0)
        {
            F[11]=1;
            f12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[11]==1)
        {   
            F[11]=0;
            f12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f12ActionPerformed

    private void f13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f13ActionPerformed
        if(count>0&F[12]==0)
        {
            F[12]=1;
            f13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[12]==1)
        {   
            F[12]=0;
            f13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f13ActionPerformed

    private void f14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f14ActionPerformed
        if(count>0&F[13]==0)
        {
            F[13]=1;
            f14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[13]==1)
        {   
            F[13]=0;
            f14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f14ActionPerformed

    private void f15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f15ActionPerformed
        if(count>0&F[14]==0)
        {
            F[14]=1;
            f15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[14]==1)
        {   
            F[14]=0;
            f15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f15ActionPerformed

    private void f16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f16ActionPerformed
        if(count>0&F[15]==0)
        {
            F[15]=1;
            f16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[15]==1)
        {   
            F[15]=0;
            f16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f16ActionPerformed

    private void f17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f17ActionPerformed
        if(count>0&F[16]==0)
        {
            F[16]=1;
            f17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[16]==1)
        {   
            F[16]=0;
            f17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f17ActionPerformed

    private void f18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f18ActionPerformed
        if(count>0&F[17]==0)
        {
            F[17]=1;
            f18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[17]==1)
        {   
            F[17]=0;
            f18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f18ActionPerformed

    private void f19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f19ActionPerformed
        if(count>0&F[18]==0)
        {
            F[18]=1;
            f19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&F[18]==1)
        {   
            F[18]=0;
            f19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_f19ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        if(count>0&G[0]==0)
        {
            G[0]=1;
            g1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[0]==1)
        {   
            G[0]=0;
            g1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g1ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        if(count>0&G[2]==0)
        {
            G[2]=1;
            g3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[2]==1)
        {   
            G[2]=0;
            g3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g3ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        if(count>0&G[3]==0)
        {
            G[3]=1;
            g4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[3]==1)
        {   
            G[3]=0;
            g4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g4ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        if(count>0&G[4]==0)
        {
            G[4]=1;
            g5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[4]==1)
        {   
            G[4]=0;
            g5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g5ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        if(count>0&G[5]==0)
        {
            G[5]=1;
            g6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[5]==1)
        {   
            G[5]=0;
            g6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g6ActionPerformed

    private void g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ActionPerformed
        if(count>0&G[6]==0)
        {
            G[6]=1;
            g7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[6]==1)
        {   
            G[6]=0;
            g7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g7ActionPerformed

    private void g8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g8ActionPerformed
        if(count>0&G[7]==0)
        {
            G[7]=1;
            g8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[7]==1)
        {   
            G[7]=0;
            g8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g8ActionPerformed

    private void g9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g9ActionPerformed
        if(count>0&G[8]==0)
        {
            G[8]=1;
            g9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[8]==1)
        {   
            G[8]=0;
            g9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g9ActionPerformed

    private void g10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g10ActionPerformed
        if(count>0&G[9]==0)
        {
            G[9]=1;
            g10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[9]==1)
        {   
            G[9]=0;
            g10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g10ActionPerformed

    private void g12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12ActionPerformed
        if(count>0&G[11]==0)
        {
            G[11]=1;
            g12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[11]==1)
        {   
            G[11]=0;
            g12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g12ActionPerformed

    private void g13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13ActionPerformed
        if(count>0&G[12]==0)
        {
            G[12]=1;
            g13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[12]==1)
        {   
            G[12]=0;
            g13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g13ActionPerformed

    private void g14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g14ActionPerformed
        if(count>0&G[13]==0)
        {
            G[13]=1;
            g14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[13]==1)
        {   
            G[13]=0;
            g14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g14ActionPerformed

    private void g15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g15ActionPerformed
        if(count>0&G[14]==0)
        {
            G[14]=1;
            g15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[14]==1)
        {   
            G[14]=0;
            g15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g15ActionPerformed

    private void g16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g16ActionPerformed
        if(count>0&G[15]==0)
        {
            G[15]=1;
            g16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[15]==1)
        {   
            G[15]=0;
            g16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g16ActionPerformed

    private void g17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g17ActionPerformed
        if(count>0&G[16]==0)
        {
            G[16]=1;
            g17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[16]==1)
        {   
            G[16]=0;
            g17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g17ActionPerformed

    private void g18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g18ActionPerformed
        if(count>0&G[17]==0)
        {
            G[17]=1;
            g18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[17]==1)
        {   
            G[17]=0;
            g18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g18ActionPerformed

    private void g19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g19ActionPerformed
        if(count>0&G[18]==0)
        {
            G[18]=1;
            g19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[18]==1)
        {   
            G[18]=0;
            g19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g19ActionPerformed

    private void g20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g20ActionPerformed
        if(count>0&G[19]==0)
        {
            G[19]=1;
            g20.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&G[19]==1)
        {   
            G[19]=0;
            g20.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_g20ActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        if(count>0&H[1]==0)
        {
            H[1]=1;
            h2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[1]==1)
        {   
            H[1]=0;
            h2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h2ActionPerformed

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
        if(count>0&H[2]==0)
        {
            H[2]=1;
            h3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[2]==1)
        {   
            H[2]=0;
            h3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h3ActionPerformed

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
        if(count>0&H[3]==0)
        {
            H[3]=1;
            h4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[3]==1)
        {   
            H[3]=0;
            h4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h4ActionPerformed

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
        if(count>0&H[4]==0)
        {
            H[4]=1;
            h5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[4]==1)
        {   
            H[4]=0;
            h5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h5ActionPerformed

    private void h6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6ActionPerformed
        if(count>0&H[5]==0)
        {
            H[5]=1;
            h6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[5]==1)
        {   
            H[5]=0;
            h6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h6ActionPerformed

    private void h7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h7ActionPerformed
        if(count>0&H[6]==0)
        {
            H[6]=1;
            h7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[6]==1)
        {   
            H[6]=0;
            h7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h7ActionPerformed

    private void h8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h8ActionPerformed
        if(count>0&H[7]==0)
        {
            H[7]=1;
            h8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[7]==1)
        {   
            H[7]=0;
            h8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h8ActionPerformed

    private void h9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h9ActionPerformed
        if(count>0&H[8]==0)
        {
            H[8]=1;
            h9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[8]==1)
        {   
            H[8]=0;
            h9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h9ActionPerformed

    private void h10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h10ActionPerformed
        if(count>0&H[9]==0)
        {
            H[9]=1;
            h10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[9]==1)
        {   
            H[9]=0;
            h10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h10ActionPerformed

    private void h12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h12ActionPerformed
        if(count>0&H[11]==0)
        {
            H[11]=1;
            h12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[11]==1)
        {   
            H[11]=0;
            h12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h12ActionPerformed

    private void h13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h13ActionPerformed
        if(count>0&H[12]==0)
        {
            H[12]=1;
            h13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[12]==1)
        {   
            H[12]=0;
            h13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h13ActionPerformed

    private void h14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h14ActionPerformed
        if(count>0&H[13]==0)
        {
            H[13]=1;
            h14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[13]==1)
        {   
            H[13]=0;
            h14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h14ActionPerformed

    private void h15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h15ActionPerformed
        if(count>0&H[14]==0)
        {
            H[14]=1;
            h15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[14]==1)
        {   
            H[14]=0;
            h15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h15ActionPerformed

    private void h16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h16ActionPerformed
        if(count>0&H[15]==0)
        {
            H[15]=1;
            h16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[15]==1)
        {   
            H[15]=0;
            h16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h16ActionPerformed

    private void h17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h17ActionPerformed
        if(count>0&H[16]==0)
        {
            H[16]=1;
            h17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[16]==1)
        {   
            H[16]=0;
            h17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h17ActionPerformed

    private void h18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h18ActionPerformed
        if(count>0&H[17]==0)
        {
            H[17]=1;
            h18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[17]==1)
        {   
            H[17]=0;
            h18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h18ActionPerformed

    private void h19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h19ActionPerformed
        if(count>0&H[18]==0)
        {
            H[18]=1;
            h19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&H[18]==1)
        {   
            H[18]=0;
            h19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_h19ActionPerformed

    private void i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i1ActionPerformed
        if(count>0&I[0]==0)
        {
            I[0]=1;
            i1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[0]==1)
        {   
            I[0]=0;
            i1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i1ActionPerformed

    private void i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i2ActionPerformed
        if(count>0&I[1]==0)
        {
            I[1]=1;
            i2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[1]==1)
        {   
            I[1]=0;
            i2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i2ActionPerformed

    private void i3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i3ActionPerformed
        if(count>0&I[2]==0)
        {
            I[2]=1;
            i3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[2]==1)
        {   
            I[2]=0;
            i3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i3ActionPerformed

    private void i4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i4ActionPerformed
        if(count>0&I[3]==0)
        {
            I[3]=1;
            i4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[3]==1)
        {   
            I[3]=0;
            i4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i4ActionPerformed

    private void i5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i5ActionPerformed
        if(count>0&I[4]==0)
        {
            I[4]=1;
            i5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[4]==1)
        {   
            I[4]=0;
            i5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i5ActionPerformed

    private void i6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i6ActionPerformed
        if(count>0&I[5]==0)
        {
            I[5]=1;
            i6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[5]==1)
        {   
            I[5]=0;
            i6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i6ActionPerformed

    private void i8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i8ActionPerformed
        if(count>0&I[7]==0)
        {
            I[7]=1;
            i8.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[7]==1)
        {   
            I[7]=0;
            i8.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i8ActionPerformed

    private void i9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i9ActionPerformed
        if(count>0&I[8]==0)
        {
            I[8]=1;
            i9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[8]==1)
        {   
            I[8]=0;
            i9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i9ActionPerformed

    private void i10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i10ActionPerformed
        if(count>0&I[9]==0)
        {
            I[9]=1;
            i10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[9]==1)
        {   
            I[9]=0;
            i10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i10ActionPerformed

    private void i12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i12ActionPerformed
        if(count>0&I[11]==0)
        {
            I[11]=1;
            i12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[11]==1)
        {   
            I[11]=0;
            i12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i12ActionPerformed

    private void i13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i13ActionPerformed
        if(count>0&I[12]==0)
        {
            I[12]=1;
            i13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[12]==1)
        {   
            I[12]=0;
            i13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i13ActionPerformed

    private void i14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i14ActionPerformed
        if(count>0&I[13]==0)
        {
            I[13]=1;
            i14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[13]==1)
        {   
            I[13]=0;
            i14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i14ActionPerformed

    private void i15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i15ActionPerformed
        if(count>0&I[14]==0)
        {
            I[14]=1;
            i15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[14]==1)
        {   
            I[14]=0;
            i15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i15ActionPerformed

    private void i16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i16ActionPerformed
        if(count>0&I[15]==0)
        {
            I[15]=1;
            i16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[15]==1)
        {   
            I[15]=0;
            i16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i16ActionPerformed

    private void i17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i17ActionPerformed
        if(count>0&I[16]==0)
        {
            I[16]=1;
            i17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[16]==1)
        {   
            I[16]=0;
            i17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i17ActionPerformed

    private void i18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i18ActionPerformed
        if(count>0&I[17]==0)
        {
            I[17]=1;
            i18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[17]==1)
        {   
            I[17]=0;
            i18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i18ActionPerformed

    private void i19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i19ActionPerformed
        if(count>0&I[18]==0)
        {
            I[18]=1;
            i19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&I[18]==1)
        {   
            I[18]=0;
            i19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_i19ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        if(count>0&J[0]==0)
        {
            J[0]=1;
            j1.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[0]==1)
        {   
            J[0]=0;
            j1.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        if(count>0&J[1]==0)
        {
            J[1]=1;
            j2.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[1]==1)
        {   
            J[1]=0;
            j2.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        if(count>0&J[2]==0)
        {
            J[2]=1;
            j3.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[2]==1)
        {   
            J[2]=0;
            j3.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        if(count>0&J[3]==0)
        {
            J[3]=1;
            j4.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[3]==1)
        {   
            J[3]=0;
            j4.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        if(count>0&J[4]==0)
        {
            J[4]=1;
            j5.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[4]==1)
        {   
            J[4]=0;
            j5.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        if(count>0&J[5]==0)
        {
            J[5]=1;
            j6.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[5]==1)
        {   
            J[5]=0;
            j6.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j6ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        if(count>0&J[6]==0)
        {
            J[6]=1;
            j7.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[6]==1)
        {   
            J[6]=0;
            j7.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j7ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        if(count>0&J[8]==0)
        {
            J[8]=1;
            j9.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[8]==1)
        {   
            J[8]=0;
            j9.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j9ActionPerformed

    private void j10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10ActionPerformed
        if(count>0&J[9]==0)
        {
            J[9]=1;
            j10.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[9]==1)
        {   
            J[9]=0;
            j10.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j10ActionPerformed

    private void j11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j11ActionPerformed
        if(count>0&J[10]==0)
        {
            J[10]=1;
            j11.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[10]==1)
        {   
            J[10]=0;
            j11.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j11ActionPerformed

    private void j12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j12ActionPerformed
        if(count>0&J[11]==0)
        {
            J[11]=1;
            j12.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[11]==1)
        {   
            J[11]=0;
            j12.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j12ActionPerformed

    private void j13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j13ActionPerformed
        if(count>0&J[12]==0)
        {
            J[12]=1;
            j13.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[12]==1)
        {   
            J[12]=0;
            j13.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j13ActionPerformed

    private void j14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j14ActionPerformed
        if(count>0&J[13]==0)
        {
            J[13]=1;
            j14.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[13]==1)
        {   
            J[13]=0;
            j14.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j14ActionPerformed

    private void j15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j15ActionPerformed
        if(count>0&J[14]==0)
        {
            J[14]=1;
            j15.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[14]==1)
        {   
            J[14]=0;
            j15.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j15ActionPerformed

    private void j16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j16ActionPerformed
        if(count>0&J[15]==0)
        {
            J[15]=1;
            j16.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[15]==1)
        {   
            J[15]=0;
            j16.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j16ActionPerformed

    private void j17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j17ActionPerformed
        if(count>0&J[16]==0)
        {
            J[16]=1;
            j17.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[16]==1)
        {   
            J[16]=0;
            j17.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j17ActionPerformed

    private void j18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j18ActionPerformed
        if(count>0&J[17]==0)
        {
            J[17]=1;
            j18.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[17]==1)
        {   
            J[17]=0;
            j18.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j18ActionPerformed

    private void j19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j19ActionPerformed
        if(count>0&J[18]==0)
        {
            J[18]=1;
            j19.setBackground(new Color(153, 255, 51));
            --count;
        }
        else if(count<=person&&J[18]==1)
        {   
            J[18]=0;
            j19.setBackground(new Color(240, 240, 240));
            ++count;
        }
        print();
    }//GEN-LAST:event_j19ActionPerformed

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        count = ticket.getSelectedIndex();
        person = count;
        price.setText("");
        ticket.setEnabled(false);
    }//GEN-LAST:event_ticketActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new Slot().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        setVisible(false);
        new Payment().setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        setVisible(false);
        new Seats().setVisible(true);
    }//GEN-LAST:event_refreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Seats().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JLabel amount;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton back;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c18;
    private javax.swing.JButton c19;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JButton d1;
    private javax.swing.JButton d10;
    private javax.swing.JButton d11;
    private javax.swing.JButton d12;
    private javax.swing.JButton d13;
    private javax.swing.JButton d14;
    private javax.swing.JButton d15;
    private javax.swing.JButton d16;
    private javax.swing.JButton d17;
    private javax.swing.JButton d18;
    private javax.swing.JButton d19;
    private javax.swing.JButton d2;
    private javax.swing.JButton d20;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton d8;
    private javax.swing.JButton d9;
    private javax.swing.JLabel dd;
    private javax.swing.JButton e1;
    private javax.swing.JButton e10;
    private javax.swing.JButton e11;
    private javax.swing.JButton e12;
    private javax.swing.JButton e13;
    private javax.swing.JButton e14;
    private javax.swing.JButton e15;
    private javax.swing.JButton e16;
    private javax.swing.JButton e17;
    private javax.swing.JButton e18;
    private javax.swing.JButton e19;
    private javax.swing.JButton e2;
    private javax.swing.JButton e20;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton e8;
    private javax.swing.JButton e9;
    private javax.swing.JButton f1;
    private javax.swing.JButton f10;
    private javax.swing.JButton f11;
    private javax.swing.JButton f12;
    private javax.swing.JButton f13;
    private javax.swing.JButton f14;
    private javax.swing.JButton f15;
    private javax.swing.JButton f16;
    private javax.swing.JButton f17;
    private javax.swing.JButton f18;
    private javax.swing.JButton f19;
    private javax.swing.JButton f2;
    private javax.swing.JButton f20;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton f7;
    private javax.swing.JButton f8;
    private javax.swing.JButton f9;
    private javax.swing.JButton g1;
    private javax.swing.JButton g10;
    private javax.swing.JButton g11;
    private javax.swing.JButton g12;
    private javax.swing.JButton g13;
    private javax.swing.JButton g14;
    private javax.swing.JButton g15;
    private javax.swing.JButton g16;
    private javax.swing.JButton g17;
    private javax.swing.JButton g18;
    private javax.swing.JButton g19;
    private javax.swing.JButton g2;
    private javax.swing.JButton g20;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JButton g7;
    private javax.swing.JButton g8;
    private javax.swing.JButton g9;
    private javax.swing.JButton h1;
    private javax.swing.JButton h10;
    private javax.swing.JButton h11;
    private javax.swing.JButton h12;
    private javax.swing.JButton h13;
    private javax.swing.JButton h14;
    private javax.swing.JButton h15;
    private javax.swing.JButton h16;
    private javax.swing.JButton h17;
    private javax.swing.JButton h18;
    private javax.swing.JButton h19;
    private javax.swing.JButton h2;
    private javax.swing.JButton h20;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton h9;
    private javax.swing.JButton i1;
    private javax.swing.JButton i10;
    private javax.swing.JButton i11;
    private javax.swing.JButton i12;
    private javax.swing.JButton i13;
    private javax.swing.JButton i14;
    private javax.swing.JButton i15;
    private javax.swing.JButton i16;
    private javax.swing.JButton i17;
    private javax.swing.JButton i18;
    private javax.swing.JButton i19;
    private javax.swing.JButton i2;
    private javax.swing.JButton i20;
    private javax.swing.JButton i3;
    private javax.swing.JButton i4;
    private javax.swing.JButton i5;
    private javax.swing.JButton i6;
    private javax.swing.JButton i7;
    private javax.swing.JButton i8;
    private javax.swing.JButton i9;
    private javax.swing.JButton j1;
    private javax.swing.JButton j10;
    private javax.swing.JButton j11;
    private javax.swing.JButton j12;
    private javax.swing.JButton j13;
    private javax.swing.JButton j14;
    private javax.swing.JButton j15;
    private javax.swing.JButton j16;
    private javax.swing.JButton j17;
    private javax.swing.JButton j18;
    private javax.swing.JButton j19;
    private javax.swing.JButton j2;
    private javax.swing.JButton j20;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel name;
    private javax.swing.JButton next;
    private javax.swing.JLabel price;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel screen;
    private javax.swing.JComboBox<String> ticket;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}