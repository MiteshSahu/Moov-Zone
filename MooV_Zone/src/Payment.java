import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
        upiID.setEnabled(false);
        Print.setEnabled(false);
        Done.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MooV_Zone = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        ShowDetails = new javax.swing.JPanel();
        Movie = new javax.swing.JLabel();
        MName = new javax.swing.JLabel();
        Mode = new javax.swing.JLabel();
        MMode = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        DD = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Timing = new javax.swing.JLabel();
        Screen = new javax.swing.JLabel();
        SNo = new javax.swing.JLabel();
        Seat = new javax.swing.JLabel();
        TotalSeat = new javax.swing.JLabel();
        lable = new javax.swing.JLabel();
        SeatNo = new javax.swing.JLabel();
        Details = new javax.swing.JPanel();
        Customer = new javax.swing.JLabel();
        CName = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        CNumber = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        AmountDetails = new javax.swing.JPanel();
        TransID = new javax.swing.JLabel();
        Total_Amt = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Payment = new javax.swing.JPanel();
        PMode = new javax.swing.JLabel();
        Cash = new javax.swing.JRadioButton();
        Upi = new javax.swing.JRadioButton();
        upiID = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        Separator2 = new javax.swing.JSeparator();
        Back = new javax.swing.JButton();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment");
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

        Separator1.setMaximumSize(new java.awt.Dimension(1300, 10));
        Separator1.setMinimumSize(new java.awt.Dimension(1300, 10));
        Separator1.setPreferredSize(new java.awt.Dimension(1300, 10));

        ShowDetails.setMaximumSize(new java.awt.Dimension(600, 320));
        ShowDetails.setMinimumSize(new java.awt.Dimension(600, 320));
        ShowDetails.setPreferredSize(new java.awt.Dimension(600, 320));

        Movie.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Movie.setText("Movie :");
        Movie.setMaximumSize(new java.awt.Dimension(100, 30));
        Movie.setMinimumSize(new java.awt.Dimension(100, 30));
        Movie.setPreferredSize(new java.awt.Dimension(100, 30));

        MName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MName.setText("Movie Name");
        MName.setMaximumSize(new java.awt.Dimension(300, 30));
        MName.setMinimumSize(new java.awt.Dimension(300, 30));
        MName.setPreferredSize(new java.awt.Dimension(300, 30));

        Mode.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Mode.setText("Mode :");
        Mode.setMaximumSize(new java.awt.Dimension(100, 30));
        Mode.setMinimumSize(new java.awt.Dimension(100, 30));
        Mode.setPreferredSize(new java.awt.Dimension(100, 30));

        MMode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MMode.setText("2D / 3D");
        MMode.setMaximumSize(new java.awt.Dimension(300, 30));
        MMode.setMinimumSize(new java.awt.Dimension(300, 30));
        MMode.setPreferredSize(new java.awt.Dimension(300, 30));

        Day.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Day.setText("Day :");
        Day.setMaximumSize(new java.awt.Dimension(100, 30));
        Day.setMinimumSize(new java.awt.Dimension(100, 30));
        Day.setPreferredSize(new java.awt.Dimension(100, 30));

        DD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DD.setText("Date & Day");
        DD.setMaximumSize(new java.awt.Dimension(300, 30));
        DD.setMinimumSize(new java.awt.Dimension(300, 30));
        DD.setPreferredSize(new java.awt.Dimension(300, 30));

        Time.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Time.setText("Time :");
        Time.setMaximumSize(new java.awt.Dimension(100, 30));
        Time.setMinimumSize(new java.awt.Dimension(100, 30));
        Time.setPreferredSize(new java.awt.Dimension(100, 30));

        Timing.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Timing.setText("Timing");
        Timing.setMaximumSize(new java.awt.Dimension(300, 30));
        Timing.setMinimumSize(new java.awt.Dimension(300, 30));
        Timing.setPreferredSize(new java.awt.Dimension(300, 30));

        Screen.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Screen.setText("Screen :");
        Screen.setMaximumSize(new java.awt.Dimension(100, 30));
        Screen.setMinimumSize(new java.awt.Dimension(100, 30));
        Screen.setPreferredSize(new java.awt.Dimension(100, 30));

        SNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SNo.setText("1");
        SNo.setMaximumSize(new java.awt.Dimension(300, 30));
        SNo.setMinimumSize(new java.awt.Dimension(300, 30));
        SNo.setPreferredSize(new java.awt.Dimension(300, 30));

        Seat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Seat.setText("Seats :");
        Seat.setMaximumSize(new java.awt.Dimension(100, 30));
        Seat.setMinimumSize(new java.awt.Dimension(100, 30));
        Seat.setPreferredSize(new java.awt.Dimension(100, 30));

        TotalSeat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TotalSeat.setText("10");
        TotalSeat.setMaximumSize(new java.awt.Dimension(30, 30));
        TotalSeat.setMinimumSize(new java.awt.Dimension(30, 30));
        TotalSeat.setPreferredSize(new java.awt.Dimension(30, 30));

        lable.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lable.setText("-");

        SeatNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SeatNo.setText("A1 A2 A3");
        SeatNo.setMaximumSize(new java.awt.Dimension(300, 30));
        SeatNo.setMinimumSize(new java.awt.Dimension(300, 30));
        SeatNo.setPreferredSize(new java.awt.Dimension(300, 30));

        javax.swing.GroupLayout ShowDetailsLayout = new javax.swing.GroupLayout(ShowDetails);
        ShowDetails.setLayout(ShowDetailsLayout);
        ShowDetailsLayout.setHorizontalGroup(
            ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowDetailsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Timing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ShowDetailsLayout.createSequentialGroup()
                        .addComponent(TotalSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lable)
                        .addGap(20, 20, 20)
                        .addComponent(SeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        ShowDetailsLayout.setVerticalGroup(
            ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowDetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Timing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable))
                .addGap(20, 20, 20))
        );

        Details.setMaximumSize(new java.awt.Dimension(600, 190));
        Details.setMinimumSize(new java.awt.Dimension(600, 190));
        Details.setPreferredSize(new java.awt.Dimension(600, 190));

        Customer.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Customer.setText("Customer Details :");
        Customer.setMaximumSize(new java.awt.Dimension(200, 30));
        Customer.setMinimumSize(new java.awt.Dimension(200, 30));
        Customer.setPreferredSize(new java.awt.Dimension(200, 30));

        CName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CName.setText("Customer Name :");
        CName.setMaximumSize(new java.awt.Dimension(180, 30));
        CName.setMinimumSize(new java.awt.Dimension(180, 30));
        CName.setPreferredSize(new java.awt.Dimension(180, 30));

        Name.setText("Name");
        Name.setMaximumSize(new java.awt.Dimension(300, 30));
        Name.setMinimumSize(new java.awt.Dimension(300, 30));
        Name.setPreferredSize(new java.awt.Dimension(300, 30));

        CNumber.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CNumber.setText("Contact Number :");
        CNumber.setMaximumSize(new java.awt.Dimension(180, 30));
        CNumber.setMinimumSize(new java.awt.Dimension(180, 30));
        CNumber.setPreferredSize(new java.awt.Dimension(180, 30));

        Number.setText("xxxxxxxxx");
        Number.setMaximumSize(new java.awt.Dimension(300, 30));
        Number.setMinimumSize(new java.awt.Dimension(300, 30));
        Number.setPreferredSize(new java.awt.Dimension(300, 30));

        javax.swing.GroupLayout DetailsLayout = new javax.swing.GroupLayout(Details);
        Details.setLayout(DetailsLayout);
        DetailsLayout.setHorizontalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DetailsLayout.createSequentialGroup()
                        .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DetailsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DetailsLayout.setVerticalGroup(
            DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        AmountDetails.setMaximumSize(new java.awt.Dimension(500, 200));
        AmountDetails.setMinimumSize(new java.awt.Dimension(500, 200));
        AmountDetails.setPreferredSize(new java.awt.Dimension(500, 200));

        TransID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TransID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TransID.setText("Transaction ID :");
        TransID.setMaximumSize(new java.awt.Dimension(180, 30));
        TransID.setMinimumSize(new java.awt.Dimension(180, 30));
        TransID.setPreferredSize(new java.awt.Dimension(180, 30));

        Total_Amt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Total_Amt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Total_Amt.setText("Total Amount :");
        Total_Amt.setMaximumSize(new java.awt.Dimension(180, 30));
        Total_Amt.setMinimumSize(new java.awt.Dimension(180, 30));
        Total_Amt.setPreferredSize(new java.awt.Dimension(180, 30));

        Amount.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Amount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Amount.setText("$$$$$");
        Amount.setMaximumSize(new java.awt.Dimension(200, 30));
        Amount.setMinimumSize(new java.awt.Dimension(200, 30));
        Amount.setPreferredSize(new java.awt.Dimension(200, 30));

        ID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ID.setText("~!@#$%^");
        ID.setMaximumSize(new java.awt.Dimension(200, 30));
        ID.setMinimumSize(new java.awt.Dimension(200, 30));
        ID.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout AmountDetailsLayout = new javax.swing.GroupLayout(AmountDetails);
        AmountDetails.setLayout(AmountDetailsLayout);
        AmountDetailsLayout.setHorizontalGroup(
            AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmountDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        AmountDetailsLayout.setVerticalGroup(
            AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmountDetailsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(AmountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        Payment.setMaximumSize(new java.awt.Dimension(500, 300));
        Payment.setMinimumSize(new java.awt.Dimension(500, 300));
        Payment.setPreferredSize(new java.awt.Dimension(500, 300));

        PMode.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PMode.setText("Payment Mode :");
        PMode.setMaximumSize(new java.awt.Dimension(180, 40));
        PMode.setMinimumSize(new java.awt.Dimension(180, 40));
        PMode.setPreferredSize(new java.awt.Dimension(180, 40));

        buttonGroup1.add(Cash);
        Cash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cash.setText("Cash");
        Cash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cash.setMaximumSize(new java.awt.Dimension(100, 30));
        Cash.setMinimumSize(new java.awt.Dimension(100, 30));
        Cash.setPreferredSize(new java.awt.Dimension(100, 30));
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        buttonGroup1.add(Upi);
        Upi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Upi.setText("UPI");
        Upi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Upi.setMaximumSize(new java.awt.Dimension(100, 30));
        Upi.setMinimumSize(new java.awt.Dimension(100, 30));
        Upi.setPreferredSize(new java.awt.Dimension(100, 30));
        Upi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpiActionPerformed(evt);
            }
        });

        upiID.setMaximumSize(new java.awt.Dimension(200, 30));
        upiID.setMinimumSize(new java.awt.Dimension(200, 30));
        upiID.setPreferredSize(new java.awt.Dimension(200, 30));

        Done.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Done.setText("Done");
        Done.setMaximumSize(new java.awt.Dimension(100, 40));
        Done.setMinimumSize(new java.awt.Dimension(100, 40));
        Done.setPreferredSize(new java.awt.Dimension(100, 40));
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentLayout = new javax.swing.GroupLayout(Payment);
        Payment.setLayout(PaymentLayout);
        PaymentLayout.setHorizontalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaymentLayout.createSequentialGroup()
                                .addComponent(Upi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(upiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        PaymentLayout.setVerticalGroup(
            PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Upi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Back.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Back.setText("Back");
        Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Back.setMaximumSize(new java.awt.Dimension(100, 40));
        Back.setMinimumSize(new java.awt.Dimension(100, 40));
        Back.setPreferredSize(new java.awt.Dimension(100, 40));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Print.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Print.setText("Print");
        Print.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Print.setMaximumSize(new java.awt.Dimension(100, 40));
        Print.setMinimumSize(new java.awt.Dimension(100, 40));
        Print.setPreferredSize(new java.awt.Dimension(100, 40));
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator2)
            .addComponent(Separator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MooV_Zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(550, 550, 550))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(AmountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new Seats().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        JOptionPane.showMessageDialog(null,"Payment Done k sath Print");
        setVisible(false);
        new Ticket().setVisible(true);
    }//GEN-LAST:event_PrintActionPerformed

    private void UpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpiActionPerformed
        upiID.setEnabled(true);
        Done.setEnabled(true);
    }//GEN-LAST:event_UpiActionPerformed

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        upiID.setEnabled(false);
        Done.setEnabled(true);
    }//GEN-LAST:event_CashActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        Print.setEnabled(true);
    }//GEN-LAST:event_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JPanel AmountDetails;
    private javax.swing.JButton Back;
    private javax.swing.JLabel CName;
    private javax.swing.JLabel CNumber;
    private javax.swing.JRadioButton Cash;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel DD;
    private javax.swing.JLabel Day;
    private javax.swing.JPanel Details;
    private javax.swing.JButton Done;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel MMode;
    private javax.swing.JLabel MName;
    private javax.swing.JLabel Mode;
    private javax.swing.JLabel MooV_Zone;
    private javax.swing.JLabel Movie;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number;
    private javax.swing.JLabel PMode;
    private javax.swing.JPanel Payment;
    private javax.swing.JButton Print;
    private javax.swing.JLabel SNo;
    private javax.swing.JLabel Screen;
    private javax.swing.JLabel Seat;
    private javax.swing.JLabel SeatNo;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JPanel ShowDetails;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Timing;
    private javax.swing.JLabel TotalSeat;
    private javax.swing.JLabel Total_Amt;
    private javax.swing.JLabel TransID;
    private javax.swing.JRadioButton Upi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lable;
    private javax.swing.JTextField upiID;
    // End of variables declaration//GEN-END:variables
}