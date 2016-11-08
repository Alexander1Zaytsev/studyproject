package com.brainacad.studyproject.gui.view;

import javax.swing.*;

/**
 * Created by User on 08/11/2016.
 */
public abstract class RefreshableView {

    protected JPanel content = new JPanel();
    public abstract com.brainacad.studyproject.gui.view.View getName();
    public JPanel getContent() {
        return content;
    }
    public abstract void refresh();

}
