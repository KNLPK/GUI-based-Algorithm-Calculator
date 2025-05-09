package algo_Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Frame window = new Frame();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Frame() {
        initialize();
    }

    private void initialize() {
        Sortingss obj = new Sortingss();
        frame = new JFrame();
        frame.setBounds(100, 100, 456, 324);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnBubbleSort = new JButton("Bubble Sort");
        btnBubbleSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(1, "BUBBLE SORT");
                frame.setVisible(false);
            }
        });
        btnBubbleSort.setBounds(43, 48, 128, 25);
        frame.getContentPane().add(btnBubbleSort);

        JButton btnInsertionSort = new JButton("Insertion Sort");
        btnInsertionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(4, "INSERTION SORT");
                frame.setVisible(false);
            }
        });
        btnInsertionSort.setBounds(253, 48, 128, 25);
        frame.getContentPane().add(btnInsertionSort);

        JButton btnSelectionSort = new JButton("Selection Sort");
        btnSelectionSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(2, "SELECTION SORT");
                frame.setVisible(false);
            }
        });
        btnSelectionSort.setBounds(43, 116, 128, 25);
        frame.getContentPane().add(btnSelectionSort);

        JButton btnMergeSort = new JButton("Merge Sort");
        btnMergeSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(5, "MERGE SORT");
                frame.setVisible(false);
            }
        });
        btnMergeSort.setBounds(253, 116, 128, 25);
        frame.getContentPane().add(btnMergeSort);

        JButton btnQuickSort = new JButton("Quick Sort");
        btnQuickSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(3, "QUICK SORT");
                frame.setVisible(false);
            }
        });
        btnQuickSort.setBounds(43, 178, 128, 25);
        frame.getContentPane().add(btnQuickSort);

        JButton btnHeapSort = new JButton("Max Heap Sort");
        btnHeapSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obj.vis(6, "HEAP SORT");
                frame.setVisible(false);
            }
        });
        
        btnHeapSort.setBounds(253, 178, 128, 25);
        frame.getContentPane().add(btnHeapSort);
    }
}
