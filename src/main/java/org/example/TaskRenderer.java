package org.example;

import javax.swing.*;
import java.awt.*;

public class TaskRenderer extends JCheckBox implements ListCellRenderer<Task> {
    public Component getListCellRendererComponent(JList<? extends Task> list ,Task task, int index, boolean isSelected,boolean cellHasFocus){
        setText(task.getName());
        setSelected(task.isCompleted());

        //Custom font & color
        setFont(new Font("SansSerif", Font.BOLD,14));
        setBackground(isSelected ? Color.lightGray : Color.white);
        setForeground(task.isCompleted() ? Color.GREEN : Color.BLACK);

        return this;
    };

}
