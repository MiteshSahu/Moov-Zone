import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Slot extends javax.swing.JFrame {

    DateFormat datef,dayf,time,date1f;
    Date dateobj;
    int count =0,check1=0,check2=0,check3=0;
   
    public Slot() {
        initComponents();
        Next.setEnabled(false);
        
        datef = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        dayf = new SimpleDateFormat("EEEE");
        date1f = new SimpleDateFormat("dd/MM/yy");
        time = new SimpleDateFormat("HH:mm:ss");
        dateobj = new Date();  
        
        ldate.setText(date1f.format(dateobj));
        lday.setText(dayf.format(dateobj));
        ltime.setText(time.format(dateobj));
        l1.setText(datef.format(dateobj));
        l1.setVisible(false);
        
        if(lday.getText().equals("Monday"))
        {
            day4.setEnabled(false);
            day5.setEnabled(false);
            day6.setEnabled(false);
            day7.setEnabled(false);
        }
        if(lday.getText().equals("Tuesday"))
        {
            day5.setEnabled(false);
            day6.setEnabled(false);
            day7.setEnabled(false);
            day1.setEnabled(false);
        }
        if(lday.getText().equals("Wednesday"))
        {
            day6.setEnabled(false);
            day7.setEnabled(false);
            day1.setEnabled(false);
            day2.setEnabled(false);
        }
        if(lday.getText().equals("Thursday"))
        {
            day7.setEnabled(false);
            day1.setEnabled(false);
            day2.setEnabled(false);
            day3.setEnabled(false);
        }
        if(lday.getText().equals("Friday"))
        {
            day1.setEnabled(false);
            day2.setEnabled(false);
            day3.setEnabled(false);
            day4.setEnabled(false);
        }
        if(lday.getText().equals("Saturday"))
        {
            day2.setEnabled(false);
            day3.setEnabled(false);
            day4.setEnabled(false);
            day5.setEnabled(false);
        }
        if(lday.getText().equals("Sunday"))
        {
            day3.setEnabled(false);
            day4.setEnabled(false);
            day5.setEnabled(false);
            day6.setEnabled(false);
        }     
}
    
    public void timeDifference(String s1,String s2,String dayName,int count1)
    {
         SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
           //System.out.println("+++"+dayName);
        try {
            d1 = format.parse(s1);
            d2 = format.parse(s2);
            long diff = d2.getTime() - d1.getTime();
            long diffSeconds = diff / 1000 ;
            //System.out.println(diffSeconds + " seconds.");
            String currDay = lday.getText();
            count=count1;
            if(currDay.equals(dayName))
            {
                if(diffSeconds<0)
                {
                    count++;
                    //System.out.print(count);
                    if(count ==1)
                    {
                        btime1.setEnabled(false);
                        btime1.setForeground(Color.GRAY);
                    }
                    if(count==2)
                    {
                        btime2.setEnabled(false);
                        btime2.setForeground(Color.GRAY);
                    }
                    if(count==3)
                    {
                        btime3.setEnabled(false);
                        btime3.setForeground(Color.GRAY);
                    }
                    if(count==4)
                    {
                        btime4.setEnabled(false);
                        btime4.setForeground(Color.GRAY);
                        l2.setText("Not Available Today");
                    }
                }
            }
            else 
            {
                //System.out.println("else");
                btime1.setEnabled(true);
                btime2.setEnabled(true);
                btime3.setEnabled(true);
                btime4.setEnabled(true);
                btime1.setForeground(Color.BLACK);
                btime2.setForeground(Color.BLACK);
                btime3.setForeground(Color.BLACK);
                btime4.setForeground(Color.BLACK);
                l2.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        MooV_Zone = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        Movie = new javax.swing.JLabel();
        ldate = new javax.swing.JLabel();
        lday = new javax.swing.JLabel();
        ltime = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        SDay = new javax.swing.JLabel();
        day1 = new javax.swing.JRadioButton();
        day2 = new javax.swing.JRadioButton();
        day3 = new javax.swing.JRadioButton();
        day4 = new javax.swing.JRadioButton();
        day5 = new javax.swing.JRadioButton();
        day6 = new javax.swing.JRadioButton();
        day7 = new javax.swing.JRadioButton();
        Panel2 = new javax.swing.JPanel();
        STime = new javax.swing.JLabel();
        btime1 = new javax.swing.JRadioButton();
        btime2 = new javax.swing.JRadioButton();
        btime3 = new javax.swing.JRadioButton();
        btime4 = new javax.swing.JRadioButton();
        Panel3 = new javax.swing.JPanel();
        SMode = new javax.swing.JLabel();
        mode1 = new javax.swing.JRadioButton();
        mode2 = new javax.swing.JRadioButton();
        mode3 = new javax.swing.JRadioButton();
        mode4 = new javax.swing.JRadioButton();
        Separator2 = new javax.swing.JSeparator();
        Back = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slot");
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        setResizable(false);

        MooV_Zone.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        MooV_Zone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MooV_Zone.setText("MooV_Zone");
        MooV_Zone.setMaximumSize(new java.awt.Dimension(200, 40));
        MooV_Zone.setMinimumSize(new java.awt.Dimension(200, 40));
        MooV_Zone.setPreferredSize(new java.awt.Dimension(200, 40));

        Movie.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Movie.setText(" Movie Name ");
        Movie.setMaximumSize(new java.awt.Dimension(400, 30));
        Movie.setMinimumSize(new java.awt.Dimension(400, 30));
        Movie.setPreferredSize(new java.awt.Dimension(400, 30));

        ldate.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        ldate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ldate.setText("Date -");
        ldate.setMaximumSize(new java.awt.Dimension(110, 30));
        ldate.setMinimumSize(new java.awt.Dimension(110, 30));
        ldate.setPreferredSize(new java.awt.Dimension(110, 30));

        lday.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lday.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lday.setText("Day -");
        lday.setMaximumSize(new java.awt.Dimension(110, 30));
        lday.setMinimumSize(new java.awt.Dimension(110, 30));
        lday.setPreferredSize(new java.awt.Dimension(110, 30));

        ltime.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        ltime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ltime.setText("Time -");
        ltime.setMaximumSize(new java.awt.Dimension(110, 30));
        ltime.setMinimumSize(new java.awt.Dimension(110, 30));
        ltime.setPreferredSize(new java.awt.Dimension(110, 30));

        Panel1.setMaximumSize(new java.awt.Dimension(400, 490));
        Panel1.setMinimumSize(new java.awt.Dimension(400, 490));
        Panel1.setPreferredSize(new java.awt.Dimension(400, 490));

        SDay.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        SDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SDay.setText("Show Day");
        SDay.setMaximumSize(new java.awt.Dimension(400, 40));
        SDay.setMinimumSize(new java.awt.Dimension(400, 40));
        SDay.setPreferredSize(new java.awt.Dimension(400, 40));

        buttonGroup1.add(day1);
        day1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day1.setText("Monday");
        day1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        day1.setMaximumSize(new java.awt.Dimension(200, 30));
        day1.setMinimumSize(new java.awt.Dimension(200, 30));
        day1.setPreferredSize(new java.awt.Dimension(200, 30));
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day2);
        day2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day2.setText("Tuesday");
        day2.setMaximumSize(new java.awt.Dimension(200, 30));
        day2.setMinimumSize(new java.awt.Dimension(200, 30));
        day2.setPreferredSize(new java.awt.Dimension(200, 30));
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day3);
        day3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day3.setText("WednesDay");
        day3.setMaximumSize(new java.awt.Dimension(200, 30));
        day3.setMinimumSize(new java.awt.Dimension(200, 30));
        day3.setPreferredSize(new java.awt.Dimension(200, 30));
        day3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day4);
        day4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day4.setText("Thursday");
        day4.setMaximumSize(new java.awt.Dimension(200, 30));
        day4.setMinimumSize(new java.awt.Dimension(200, 30));
        day4.setPreferredSize(new java.awt.Dimension(200, 30));
        day4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day5);
        day5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day5.setText("Friday");
        day5.setMaximumSize(new java.awt.Dimension(200, 30));
        day5.setMinimumSize(new java.awt.Dimension(200, 30));
        day5.setPreferredSize(new java.awt.Dimension(200, 30));
        day5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day6);
        day6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day6.setText("Saturday");
        day6.setMaximumSize(new java.awt.Dimension(200, 30));
        day6.setMinimumSize(new java.awt.Dimension(200, 30));
        day6.setPreferredSize(new java.awt.Dimension(200, 30));
        day6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(day7);
        day7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        day7.setText("Sunday");
        day7.setMaximumSize(new java.awt.Dimension(200, 30));
        day7.setMinimumSize(new java.awt.Dimension(200, 30));
        day7.setPreferredSize(new java.awt.Dimension(200, 30));
        day7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(day5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(day6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(day7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(day7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Panel2.setMaximumSize(new java.awt.Dimension(400, 490));
        Panel2.setMinimumSize(new java.awt.Dimension(400, 490));
        Panel2.setPreferredSize(new java.awt.Dimension(400, 490));

        STime.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        STime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STime.setText(" Show Time ");
        STime.setMaximumSize(new java.awt.Dimension(400, 40));
        STime.setMinimumSize(new java.awt.Dimension(400, 40));
        STime.setPreferredSize(new java.awt.Dimension(400, 40));

        buttonGroup3.add(btime1);
        btime1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btime1.setText("09:00:00 ");
        btime1.setMaximumSize(new java.awt.Dimension(200, 30));
        btime1.setMinimumSize(new java.awt.Dimension(200, 30));
        btime1.setPreferredSize(new java.awt.Dimension(200, 30));
        btime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btime1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(btime2);
        btime2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btime2.setText("13:00:00 ");
        btime2.setMaximumSize(new java.awt.Dimension(200, 30));
        btime2.setMinimumSize(new java.awt.Dimension(200, 30));
        btime2.setPreferredSize(new java.awt.Dimension(200, 30));
        btime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btime2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(btime3);
        btime3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btime3.setText("17:00:00");
        btime3.setMaximumSize(new java.awt.Dimension(200, 30));
        btime3.setMinimumSize(new java.awt.Dimension(200, 30));
        btime3.setPreferredSize(new java.awt.Dimension(200, 30));
        btime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btime3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(btime4);
        btime4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btime4.setText("21:00:00");
        btime4.setMaximumSize(new java.awt.Dimension(200, 30));
        btime4.setMinimumSize(new java.awt.Dimension(200, 30));
        btime4.setPreferredSize(new java.awt.Dimension(200, 30));
        btime4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btime4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(STime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btime4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btime1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btime2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btime3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(STime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        Panel3.setMaximumSize(new java.awt.Dimension(400, 490));
        Panel3.setMinimumSize(new java.awt.Dimension(400, 490));
        Panel3.setPreferredSize(new java.awt.Dimension(400, 490));

        SMode.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        SMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SMode.setText("Select Mode");
        SMode.setMaximumSize(new java.awt.Dimension(400, 40));
        SMode.setMinimumSize(new java.awt.Dimension(400, 40));
        SMode.setPreferredSize(new java.awt.Dimension(400, 40));

        buttonGroup2.add(mode1);
        mode1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mode1.setText("Hindi 2D");
        mode1.setMaximumSize(new java.awt.Dimension(200, 30));
        mode1.setMinimumSize(new java.awt.Dimension(200, 30));
        mode1.setPreferredSize(new java.awt.Dimension(200, 30));
        mode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(mode2);
        mode2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mode2.setText("Hindi 3D");
        mode2.setMaximumSize(new java.awt.Dimension(200, 30));
        mode2.setMinimumSize(new java.awt.Dimension(200, 30));
        mode2.setPreferredSize(new java.awt.Dimension(200, 30));
        mode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(mode3);
        mode3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mode3.setText("English 2D");
        mode3.setMaximumSize(new java.awt.Dimension(200, 30));
        mode3.setMinimumSize(new java.awt.Dimension(200, 30));
        mode3.setPreferredSize(new java.awt.Dimension(200, 30));
        mode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(mode4);
        mode4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mode4.setText("English 3D");
        mode4.setMaximumSize(new java.awt.Dimension(200, 30));
        mode4.setMinimumSize(new java.awt.Dimension(200, 30));
        mode4.setPreferredSize(new java.awt.Dimension(200, 30));
        mode4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addComponent(SMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mode2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(mode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(mode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(mode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(mode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        Back.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Back.setText("Back");
        Back.setMaximumSize(new java.awt.Dimension(100, 40));
        Back.setMinimumSize(new java.awt.Dimension(100, 40));
        Back.setPreferredSize(new java.awt.Dimension(100, 40));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Next.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Next.setText("Next");
        Next.setMaximumSize(new java.awt.Dimension(100, 40));
        Next.setMinimumSize(new java.awt.Dimension(100, 40));
        Next.setPreferredSize(new java.awt.Dimension(100, 40));
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        l1.setText("l1");

        l2.setText("l2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MooV_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(550, 550, 550))
            .addComponent(Separator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(ltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MooV_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        check1=1;
        String dayName="Monday";
            btime1.setEnabled(true);
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
            //System.out.print(s1);
            //System.out.print(s21);       
            String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            //System.out.print(s1);
            //System.out.print(s22);
             String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
            //System.out.print(s1);
            //System.out.print(s23);
             String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            //System.out.print(s1);
            //System.out.print(s24);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day1ActionPerformed

    private void day7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day7ActionPerformed
        check1=1;
        String dayName="Sunday";
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
            String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
            String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day7ActionPerformed

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        check1=1;
        String dayName="Tuesday";
        String s1 = l1.getText();
        String s21,s22,s23,s24;
        String s2Date1 = ldate.getText();
        String s2Time1 = btime1.getText();
        s21 = s2Date1.concat(" "+s2Time1);
        String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            s23 = s2Date3.concat(" "+s2Time3);
            String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day2ActionPerformed

    private void day3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day3ActionPerformed
        check1=1;
         String dayName="Wednesday";
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
            String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
             String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day3ActionPerformed

    private void day4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day4ActionPerformed
        check1=1;
        String dayName="Thursday";
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
             String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
             String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day4ActionPerformed

    private void day5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day5ActionPerformed
        check1=1;
        String dayName="Friday";
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
            String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
            String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day5ActionPerformed

    private void day6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day6ActionPerformed
        check1=1;
         String dayName="Saturday";
            String s1 = l1.getText();
            String s2Date1 = ldate.getText();
            String s2Time1 = btime1.getText();
            String s21 = s2Date1.concat(" "+s2Time1);
            String s2Date2 = ldate.getText();
            String s2Time2 = btime2.getText();
            String s22 = s2Date2.concat(" "+s2Time2);
            String s2Date3 = ldate.getText();
            String s2Time3 = btime3.getText();
            String s23 = s2Date3.concat(" "+s2Time3);
            String s2Date4 = ldate.getText();
            String s2Time4 = btime4.getText();
            String s24 = s2Date4.concat(" "+s2Time4);
            count =0;
            timeDifference(s1,s21,dayName,count);
            timeDifference(s1,s22,dayName,count);
            timeDifference(s1,s23,dayName,count);
            timeDifference(s1,s24,dayName,count);   
    }//GEN-LAST:event_day6ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        setVisible(false);
        new Seats().setVisible(true);
    }//GEN-LAST:event_NextActionPerformed

    private void btime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btime1ActionPerformed
        check2 =1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_btime1ActionPerformed

    private void btime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btime2ActionPerformed
        check2=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_btime2ActionPerformed

    private void btime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btime3ActionPerformed
        check2=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_btime3ActionPerformed

    private void btime4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btime4ActionPerformed
        check2=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_btime4ActionPerformed

    private void mode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode1ActionPerformed
        check3=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_mode1ActionPerformed

    private void mode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode2ActionPerformed
        check3=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_mode2ActionPerformed

    private void mode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode3ActionPerformed
        check3=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_mode3ActionPerformed

    private void mode4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode4ActionPerformed
        check3=1;
        if(check1==1&&check2==1&&check3==1)
            Next.setEnabled(true);
    }//GEN-LAST:event_mode4ActionPerformed
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel MooV_Zone;
    private javax.swing.JLabel Movie;
    private javax.swing.JButton Next;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JLabel SDay;
    private javax.swing.JLabel SMode;
    private javax.swing.JLabel STime;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JRadioButton btime1;
    private javax.swing.JRadioButton btime2;
    private javax.swing.JRadioButton btime3;
    private javax.swing.JRadioButton btime4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton day1;
    private javax.swing.JRadioButton day2;
    private javax.swing.JRadioButton day3;
    private javax.swing.JRadioButton day4;
    private javax.swing.JRadioButton day5;
    private javax.swing.JRadioButton day6;
    private javax.swing.JRadioButton day7;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel lday;
    private javax.swing.JLabel ltime;
    private javax.swing.JRadioButton mode1;
    private javax.swing.JRadioButton mode2;
    private javax.swing.JRadioButton mode3;
    private javax.swing.JRadioButton mode4;
    // End of variables declaration//GEN-END:variables

    private void Switch(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Switch(DateFormat dayf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}