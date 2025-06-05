package algo_Calc;

import sort_logic.BubbleSort;
import sort_logic.SelectionSort;
import sort_logic.QuickSort;
import sort_logic.InsertionSort;
import sort_logic.MergeSort;
import sort_logic.HeapSort;
import sort_logic.Sorter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sortingss {
    private JFrame frame;
    private JTextField textField;
    private int key;
    private String tname;
    private JTextArea textArea_1;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Sortingss window = new Sortingss();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Sortingss() {
        initialize();
    }

    public int vis(int k, String str) {
        key = k;
        tname = str;
        frame.setVisible(true);
        return 0;
    }

    private void addComponentToFrame(Component component) {
        frame.getContentPane().add(component);
    }

    private void setFrameLayout(LayoutManager layoutManager) {
        frame.getContentPane().setLayout(layoutManager);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 514, 329);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFrameLayout(null);

        textArea_1 = new JTextArea();
        textArea_1.setFont(new Font("Arial", Font.BOLD, 26));
        textArea_1.setBackground(Color.DARK_GRAY);
        textArea_1.setForeground(Color.WHITE);
        textArea_1.setBounds(102, 0, 304, 41);
        addComponentToFrame(textArea_1);

        textField = new JTextField();
        textField.setBounds(102, 102, 304, 22);
        addComponentToFrame(textField);
        textField.setColumns(10);

        JLabel lblEnterInput = new JLabel("Enter Input");
        lblEnterInput.setBounds(30, 105, 85, 16);
        addComponentToFrame(lblEnterInput);

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textArea.setBounds(102, 175, 304, 56);
        addComponentToFrame(textArea);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                int[] num = Utils.parseInput(str);
                String result = "";

                Sorter sorter = null;
                switch (key) {
                    case 1:
                        sorter = new BubbleSort();
                        break;
                    case 2:
                        sorter = new SelectionSort();
                        break;
                    case 3:
                        sorter = new QuickSort();
                        break;
                    case 4:
                        sorter = new InsertionSort();
                        break;
                    case 5:
                        sorter = new MergeSort();
                        break;
                    case 6:
                        sorter = new HeapSort();
                        break;
                }

                if (sorter != null) {
                    result = sorter.sort(num);
                }

                textArea.setText(result);
                textArea_1.setText(tname);
            }
        });
        btnSubmit.setBounds(210, 137, 97, 25);
        addComponentToFrame(btnSubmit);

        JLabel lblIntegerMustBe = new JLabel("Integer must be space separated in your input");
        lblIntegerMustBe.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblIntegerMustBe.setBounds(29, 48, 408, 41);
        addComponentToFrame(lblIntegerMustBe);

        JLabel lblYourOutput = new JLabel("Your Output");
        lblYourOutput.setBounds(30, 178, 112, 16);
        addComponentToFrame(lblYourOutput);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });

        btnExit.setBounds(210, 244, 97, 25);
        addComponentToFrame(btnExit);
    }
}
