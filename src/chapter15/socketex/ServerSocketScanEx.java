package chapter15.socketex;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class ServerSocketScanEx extends JFrame implements ActionListener, Runnable {
    private JButton jbtn_scan;
    private JTextField jtf_ip;
    private JList jlist_result;
    private JLabel jlabel_ip;
    private DefaultListModel listmodel;
    private int index;
    private String ip;
    public ServerSocketScanEx(String message){
        super(message);
        jbtn_scan = new JButton("서버 스캔");
        listmodel = new DefaultListModel();
        jlist_result = new JList(listmodel);
        jlist_result.setVisibleRowCount(10);

        JPanel jPanel_south = new JPanel();
        jPanel_south.add(jbtn_scan);

        jbtn_scan.addActionListener(this);
        JScrollPane jsp = new JScrollPane(jlist_result);
        add(jsp, BorderLayout.CENTER);
        add(jPanel_south, BorderLayout.SOUTH);

        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ew){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj == jbtn_scan){
                listmodel.insertElementAt(ip, index);
                jlist_result.setSelectedIndex(index);
                index++;
                Thread t = new Thread(this);
                t.start();
        }
    }

    @Override
    public void run() {
        ServerSocket s = null;
        for(int i =1; i<65536;i++){
            try {
                s = new ServerSocket(i);
            } catch (java.io.IOException e) {
                listmodel.insertElementAt(i + "번 포트가 사용중입니다.", index);
                jlist_result.setSelectedIndex(index);
            }
        }
        listmodel.insertElementAt("서버 스캔이 끝났습니다.", index);
        jlist_result.setSelectedIndex(index);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ServerSocketScanEx("ServerPort Scanner");
    }
    
}
