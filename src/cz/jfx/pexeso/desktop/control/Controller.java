package cz.jfx.pexeso.desktop.control;

import cz.jfx.pexeso.desktop.gui.MainFrame;

/**
 *
 * @author Felix
 */
public class Controller {

    private MainFrame frame;

    public Controller(MainFrame frame) {
        this.frame = frame;
    }

    public MainFrame getFrame() {
        return frame;
    }
}
