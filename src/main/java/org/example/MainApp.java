package org.example;

import org.example.SoundUtil;
import org.example.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new);
    }

    public static class ToDoApp {
        private JFrame frame;
        private JTextField taskField;
        private DefaultListModel<Task> taskListModel;
        private JList<Task> taskList;

        public ToDoApp() {
            frame = new JFrame("Customized ToDo App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450, 400);

            taskField = new JTextField(20);
            JButton addButton = new JButton("Add Task");
            taskListModel = new DefaultListModel<>();
            taskList = new JList<>(taskListModel);
            taskList.setCellRenderer(new TaskRenderer());

            // Add Task Action
            addButton.addActionListener(e -> {
                String taskName = taskField.getText().trim();
                if (!taskName.isEmpty()) {
                    taskListModel.addElement(new Task(taskName));
                    taskField.setText("");
                    SoundUtil.playSound("ding.wav"); // Sound on add
                }
            });

            // Handle checkbox click to complete task
            taskList.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int index = taskList.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        Task task = taskListModel.get(index);
                        task.setCompleted(true);
                        taskListModel.remove(index); // remove from list
                        SoundUtil.playSound("success.wav"); // Sound on complete
                    }
                }
            });

            JPanel topPanel = new JPanel();
            topPanel.add(taskField);
            topPanel.add(addButton);

            frame.getContentPane().add(topPanel, BorderLayout.NORTH);
            frame.getContentPane().add(new JScrollPane(taskList), BorderLayout.CENTER);

            frame.setVisible(true);
        }
    }
}
