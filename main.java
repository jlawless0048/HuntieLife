
/**
 * Runs the game!
 *
 * Hunter Stewart
 * 1.0
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.Arrays;

public class main extends javax.swing.JFrame
{
    public static Scanner reader = new Scanner(System.in);
    public static Random lotto = new Random();
    public static int choice;
    public static boolean blah;
    
       public static void main(String [] args) throws IOException{
        int year = 0;
        int focus = 0;
        int friendnum = 0;
        int count = 0;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
        
        Character mainChar = Character.createCharacter();
        Character dad = new Character(Character.newFirstMaleName(), mainChar.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Male", lotto.nextInt(27) + 18, lotto.nextInt(100000));
        Character mom = new Character(Character.newFirstFemaleName(), dad.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Female", lotto.nextInt(17) + 18, lotto.nextInt(100000));
        
        int siblingNum = lotto.nextInt(4);
        Character[] siblings = new Character[siblingNum];    
        
        for (int i = siblingNum; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                siblings[i - 1] = new Character(Character.newFirstMaleName(), mainChar.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1); 
            }
            else {
                siblings[i - 1] = new Character(Character.newFirstFemaleName(), mainChar.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1);
            }
        }
        
        Character[] yourAge = new Character[50];
        
        for (int i = 50; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                yourAge[i - 1] = new Character(Character.newFirstMaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(2)-1 , lotto.nextInt(100000)); 
            }
            else {
                yourAge[i - 1] = new Character(Character.newFirstFemaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(2)-1, lotto.nextInt(100000));
            }
        }
        
        Character[] everyoneElse = new Character[100];
        
        for (int i = 100; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                everyoneElse[i - 1] = new Character(Character.newFirstMaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(50) + 1, lotto.nextInt(100000)); 
            }
            else {
                everyoneElse[i - 1] = new Character(Character.newFirstFemaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(50) + 1, lotto.nextInt(100000));
            }
        }
        
        Character[] friends = new Character[150];
        
        while (mainChar.isAlive()){
            if(mainChar.getHealth() <= 0){
                mainChar.kill();
            }
            if(lotto.nextInt(25) == 0 && mainChar.isAlive()){
                randomEvents.getEvent(mainChar);
            }
            if (mainChar.isAlive()){
   
                year++;
                mainChar.Age();
                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Name", mainChar.getName()},
                    {"Age", mainChar.getAge()},
                    {"Wealth", mainChar.getWealth()},
                    {"Job", mainChar.getJob()},
                    {"Looks", mainChar.getLooks()},
                    {"Smarts", mainChar.getSmarts()},
                    {"Atheleticism", mainChar.getAtheleticism()},
                    {"Health", mainChar.getHealth()}
                },
                new String [] {
                    "Stat", "Value"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false
                };
    
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
                dad.Age();
                mom.Age();
                for (int i = siblingNum; i > 0; i--){
                    siblings[i - 1].Age();
                }
                for (int i = 50; i > 0; i--){
                    yourAge[i - 1].Age();
                }
                for (int i = 100; i > 0; i--){
                    everyoneElse[i - 1].Age();
                }
                if (mainChar.getHealth() <= 0){
                    death.lessThanZeroDeath(mainChar);
                    mainChar.kill();
                }
                if (dad.getHealth() <= 0){
                    death.lessThanZeroDeath(dad);
                    dad.kill();
                }
                if (mom.getHealth() <= 0){
                    death.lessThanZeroDeath(mom);
                    mom.kill();
                }
                for (int i = siblingNum; i > 0; i--){
                    if (siblings[i - 1].getHealth() <= 0){
                        death.lessThanZeroDeath(siblings[i - 1]);
                        siblings[i - 1].kill();
                    }
                }
                for (int i = 50; i > 0; i--){
                    if (yourAge[i - 1].getHealth() <= 0){
                        death.lessThanZeroDeath(yourAge[i - 1]);
                        yourAge[i - 1].kill();
                    }
                }
                for (int i = 100; i > 0; i--){
                    if (everyoneElse[i - 1].getHealth() <= 0){
                        death.lessThanZeroDeath(everyoneElse[i - 1]);
                        everyoneElse[i - 1].kill();
                    }
                }
                if (mainChar.getAge() == 18 && mainChar.getSmarts() > 40){
                    choice = 0;
                    System.out.printf("You are 18, and smart enough to get in. Enroll in College?%n%n1.) Yes%n2.) No%n");
                    while(blah){
                        try{
                            Thread.sleep(200);
                        }
                        catch(InterruptedException e){ 
                        }
                    }
                    blah = true;
                    if (choice == 1){
                        System.out.println("You've Been Enrolled. Enjoy those student loans!");
                        mainChar.enroll();
                    }
                    else{
                        System.out.println("You've dodged those loans. Hopefully, it's worth it.");
                    }
                }
                if (dad.getAge() == 18 && dad.getSmarts() > 75){
                    dad.enroll();
                }
                if (mom.getAge() == 18 && mom.getSmarts() > 75){
                    mom.enroll();
                }
                for (int i = siblingNum ; i > 0; i--){
                    if (siblings[i - 1].getAge() == 18 && siblings[i - 1].getSmarts() > 65){
                        siblings[i - 1].enroll();
                    }
                }
                for (int i = siblingNum ; i > 0; i--){
                    if (everyoneElse[i - 1].getAge() == 18 && everyoneElse[i - 1].getSmarts() > 65){
                        everyoneElse[i - 1].enroll();
                    }
                }
                if (mainChar.isinCollege() && mainChar.getAge() == 23){
                    System.out.println("Congrats! You've graduated. Hopefully, this is worthwhile.");
                    mainChar.deEnroll();
                    mainChar.graduate();
                }
                if (dad.isinCollege() && dad.getAge() == 23){
                    dad.deEnroll();
                    dad.graduate();
                }
                if (mom.getAge() == 23 && mom.isinCollege()){
                    mom.deEnroll();
                    mom.graduate();
                }
                for (int i = siblingNum ; i > 0; i--){
                    if (siblings[i - 1].getAge() == 23 && siblings[i - 1].isinCollege()){
                        siblings[i - 1].deEnroll();
                        siblings[i - 1].graduate();
                    }
                }
                while(true){
                    
                    System.out.printf("%n1.) Next Year%n2.) Set Year Focus%n3.) See Family%n4.) See Random Others%n");
                    while(blah){
                        try{
                            Thread.sleep(200);
                        }
                        catch(InterruptedException e){ 
                        }
                    }
                        textArea1.selectAll();
                        textArea1.replaceSelection("");

                    blah = true;
                    if (choice == 1){
                        break;
                    }
                    if (choice == 2){
                        if(mainChar.getAge() < 13){
                            System.out.printf("%n1.) Play Outside%n2.) Read%n3.) Play Dress-Up%n4.) Do Chores%n");
                        }
                        else if(mainChar.getAge() < 18){
                            System.out.printf("%n1.) Practice Sports%n2.) Study%n3.) Put More Effort Into Clothing%n4.) Get A Part-Time Job%n");
                        }
                        else if(mainChar.getAge() < 23 && mainChar.isinCollege()){
                            System.out.printf("%n1.) Go to the Gym%n2.) Study%n3.) Put More Effort Into Clothing%n4.) Get A Part-Time Job%n");
                        }
                        else{
                            System.out.printf("%n1.) Go to the Gym%n2.) Read a Book%n3.) Try a new Look%n4.) Get A Job%n");
                        }
                        while(blah){
                        try{
                            Thread.sleep(200);
                        }
                        catch(InterruptedException e){ 
                        }
                    }
                    blah = true;
                        if(choice == 1){
                            focus = 1;
                        }
                        if(choice == 2){
                            focus = 2;
                        }
                        if(choice == 3){
                            focus = 3;
                        }
                        if(choice == 4){
                            focus = 4;
                        }
                        choice = 0;
                    }
                    if (choice == 3){
                        System.out.printf("%nParents:%n");
                        System.out.print(dad);
                        System.out.print(mom);
                        System.out.printf("%nSiblings:%n");
                        for (int i = siblingNum ; i > 0; i--){
                            System.out.print(siblings[i - 1]);
                        }
                        System.out.printf("%nFriends:%n");
                        for (int i = friendnum ; i > 0; i--){
                            System.out.print(friends[friendnum - 1]);
                        }
                        choice = 0;
                    }
                    if (choice == 4){
                        if(mainChar.getAge() < 10){
                            System.out.printf("%nYou are a bit too young to be goin out and about meeting new people...%n");
                        }
                        else
                        {
                        int num1 = 0;
                        int num2 = 0;
                        int num3 = 0;
                        while (true){
                            num1 = lotto.nextInt(50);
                            if(yourAge[num1].isAlive() && !Arrays.asList(friends).contains(yourAge[num1])){
                                break;                        
                            }
                        }
                        while (true){
                            num2 = lotto.nextInt(100);
                            if(everyoneElse[num2].isAlive() && !Arrays.asList(friends).contains(everyoneElse[num2])){
                                break;
                            }
                        }
                        while (true){
                            num3 = lotto.nextInt(100);
                            if(everyoneElse[num3].isAlive() && !Arrays.asList(friends).contains(everyoneElse[num3])){
                                break;
                            }
                        }
                        System.out.printf("%nFolks You Saw:%n");
                        System.out.print(yourAge[num1]);
                        System.out.print(everyoneElse[num2]);
                        System.out.print(everyoneElse[num3]);
                        System.out.printf("%n1.) Befriend Person 1%n2.) Befriend Person 2%n3.) Befriend Person 3%n4.) Leave Without Saying a Word%n");
                        while(blah){
                        try{
                            Thread.sleep(200);
                        }
                        catch(InterruptedException e){ 
                        }
                    }
                    blah = true;
                        if (choice == 1){
                            friends[friendnum] = yourAge[num1];
                            friendnum++;
                        }
                        else if (choice == 2){
                            friends[friendnum] = everyoneElse[num2];
                            friendnum++;
                        }
                        else if (choice == 3){
                            friends[friendnum] = everyoneElse[num3];
                            friendnum++;
                        }
                    }
                    }
                }
                if(mainChar.isAlive()){
                focusing.focusTime(focus, mainChar);
            }
                if(dad.isAlive()){
                    focusing.focusTime(lotto.nextInt(4) + 1, dad);
                }
                if(mom.isAlive()){
                    focusing.focusTime(lotto.nextInt(4) + 1, mom);
                }
                
                    for (int i = siblingNum; i > 0; i--){
                        if(siblings[i - 1].isAlive()){
                        focusing.focusTime(lotto.nextInt(4) + 1, siblings[i - 1]);
                    }
                    }
                    for (int i = 50; i > 0; i--){
                        if(yourAge[i - 1].isAlive()){
                        focusing.focusTime(lotto.nextInt(4) + 1, yourAge[i - 1]);
                    }
                    }
                    for (int i = 100; i > 0; i--){
                        if(everyoneElse[i - 1].isAlive()){
                        focusing.focusTime(lotto.nextInt(4) + 1, everyoneElse[i - 1]);
                    }
                    }
                    mainChar.yearlyPay();
                    if (mainChar.getAge() > 18){
                        mainChar.yearlyDeduction();
                    }
                    dad.yearlyPay();
                    if (dad.getAge() > 18){
                        dad.yearlyDeduction();
                    }
                    mom.yearlyPay();
                    if (mom.getAge() > 18){
                        mom.yearlyDeduction();
                    }
                    for (int i = siblingNum ; i > 0; i--){
                            siblings[i - 1].yearlyPay();
                            if(siblings[i - 1].getAge() > 18){
                                siblings[i - 1].yearlyDeduction();
                            }
                    }
                    for (int i = 100; i > 0; i--){
                            everyoneElse[i - 1].yearlyPay();
                            if (everyoneElse[i - 1].getAge() > 18){
                                everyoneElse[i - 1].yearlyDeduction();
                            }
                    }
            }
        }
        
        System.out.println("You are dead!"); 
        System.out.println(mainChar.getDeath());
        System.out.println(mainChar);
    }
    
        /**
         * Creates new form main
         */
    public main() {
            initComponents();
    }
    
    private void initComponents() {
    
            jScrollPane2 = new javax.swing.JScrollPane(textArea1);
            //jTable1 = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();
            jScrollPane3 = new javax.swing.JScrollPane();
            jTable2 = new javax.swing.JTable();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            textArea1 = new javax.swing.JTextArea();
            
            jScrollPane2.setViewportView(jTable1);
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            jLabel1.setText("Huntie Life 1.0");
    
            jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Name", null},
                    {"Age", null},
                    {"Wealth", null},
                    {"Job", null},
                    {"Looks", null},
                    {"Smarts", null},
                    {"Atheleticism", null},
                    {"Health", null}
                },
                new String [] {
                    "Stat", "Value"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false
                };
    
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane3.setViewportView(jTable2);
    
                   jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
            textArea1.setEditable(false);
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 10, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );
            //textArea1.getAccessibleContext().setAccessibleName("textOut");
             PrintStream printStream = new PrintStream(new CustomOutputStream(textArea1));
            System.setOut(printStream);
            System.setErr(printStream);
    
            pack();
            
            
    }                       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
        blah = false;
        choice = 1;
    }  
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        blah = false;
        choice = 2;
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {    
        blah = false;
        choice = 3;
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {     
        blah = false;
        choice = 4;
    }     
    public class CustomOutputStream extends OutputStream {
        private javax.swing.JTextArea textArea;
     
        public CustomOutputStream(javax.swing.JTextArea textArea) {
            this.textArea = textArea;
        }
     
        @Override
        public void write(int b) throws IOException {
            textArea.append(String.valueOf((char)b));
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
}
 
    // Variables declaration                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private static javax.swing.JTextArea  textArea1;
}
