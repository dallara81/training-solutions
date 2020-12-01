package gyakorlospaghetti;
// Gyakorlás, kísérletezés NEM saját kódon

package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * LayeredPaneDemo.java requires
 * components/images/dukeWaveRed.gif.
 *
 * The meat of the example is in OurActionListener, where you will find
 * calls to theses methods:
 *   moveToFront()
 *   moveToBack()
 *   setLayer()
 * and in the OurLayeredPane() constructor, where you will find calls to add
 * JComponents to the JLayeredPane.
 */
public class GyakorloSpaghettiAfter {

    public static void main(String[] args) {
        OurWindow.run();
    }
}

//============================================================================

class OurWindow extends JFrame {

    public static void run() {
        // Do all Swing manipulation, even initialization, in the event thread.
        SwingUtilities.invokeLater(new Runnable() { public void run() {
            new OurWindow().display();
        }});
    }

    private OurWindow() {
        super("LayeredPaneDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new OurContentPane());
    }

    void display() {
        pack();
        setVisible(true);
    }
}

//==============================================================================

class OurContentPane extends JPanel {

    OurContentPane() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        final OurLayeredPane layeredPane = new OurLayeredPane();

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(layeredPane.getControlPanel());

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(layeredPane);

        setOpaque(true); // Content panes must be opaque
    }
}

//==============================================================================

class OurLayeredPane extends JLayeredPane {

    OurLayeredPane() {
        setPreferredSize(new Dimension(300, 310));
        setBorder(BorderFactory.createTitledBorder("Move the Mouse to Move Duke"));
        controlPanel = new ControlPanel(new OurActionListener());
        addColoredPanels();
        duke = addDuke();
    }

    private final ControlPanel controlPanel;
    private final JComponent duke;

    enum ActionCommand { Layer, PositionInLayer }

    // These should be in JLayeredPane.
    // 0 is actually the front potition; higher numbers are farther back.
    public static final int FRONT_POSITION =  0;
    // -1 has special meaning; the resulting layer position will be nonnegative.
    public static final int  BACK_POSITION = -1;

    ControlPanel getControlPanel() { return controlPanel; }

    private void addColoredPanels() {
        // Add several overlapping, colored labels to the layered pane
        // using absolute positioning/sizing.
        for (Panel panel : Panel.values()) {
            // Add the component at the specified layer number.
            // Don't pass an int here and expect it to be autoboxed to Integer.
            // It won't be autoboxed because there is also a different method
            // that takes an int and doesn't do what we want.
            add(panel.component(), new Integer(panel.ordinal()));
        }
    }

    private JComponent addDuke() {
        // Create and add the Duke to the layered pane.
        final JComponent result = new DukeComponent();
        addMouseMotionListener(new OurMouseMotionListener());
        final int positionAsInt = controlPanel.getSelectedPosition();
        add(result, Panel.getDefault().ordinal(), positionAsInt);
        return result;
    }

    //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    private class OurMouseMotionListener extends MouseMotionAdapter {

        // Make Duke follow the cursor.
        public void mouseMoved(MouseEvent e) {
            duke.setLocation(DukeComponent.pointingAtDukesToe(e.getX(), e.getY()));
        }
    }

    //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    private class OurActionListener implements ActionListener {

        // Handle user interaction with the check box and combo box.
        public void actionPerformed(ActionEvent e) {
            final String command = e.getActionCommand();
            final int           layer = controlPanel.getSelectedLayer();
            final int positionInLayer = controlPanel.getSelectedPosition();
            switch (ActionCommand.valueOf(command)) {
                case Layer:
                    setLayer(duke, layer, positionInLayer);
                    break;
                case PositionInLayer:
                    switch (positionInLayer) {
                        case FRONT_POSITION:
                            moveToFront(duke);
                            break;
                        case BACK_POSITION:
                            moveToBack(duke);
                            break;
                        default:
                            // We don't use this case at all.
                            // We show all three cases only because this is a tutorial.
                            setLayer(duke, layer, positionInLayer);
                    }
                    break;
            }
            printPositions();
        }

        private void printPositions() {
            final int layer = getLayer(duke);
            final Panel panel = Panel.values()[layer];
            System.out.println("Positions within layer " + layer + " are now"
                    + " Duke: "        + getPosition(duke)
                    + " Colored box: " + getPosition(panel.component()));
        }
    }
}

//============================================================================

class ControlPanel extends JPanel {

    ControlPanel(ActionListener actionListener) {
        final String title = "Choose Duke's Layer and Position";
        setBorder(BorderFactory.createTitledBorder(title));
        layerList = new LayerListComboBox();
        layerList.addActionListener(actionListener);
        add(layerList);
        inFront = new PositionCheckBox();
        inFront.addActionListener(actionListener);
        add(inFront);
    }

    private final PositionCheckBox inFront;
    private final LayerListComboBox layerList;

    int getSelectedLayer() {
        return layerList.getSelectedIndex();
    }

    int getSelectedPosition() {
        return inFront.getSelectedPosition();
    }
}

//============================================================================

class LayerListComboBox extends JComboBox {

    LayerListComboBox() {
        super(Panel.namesForUI());
        setSelectedIndex(Panel.getDefault().ordinal());
        setActionCommand(OurLayeredPane.ActionCommand.Layer.name());
    }
}

//============================================================================

class PositionCheckBox extends JCheckBox {

    PositionCheckBox() {
        super("Front Position in Layer");
        setSelected(true);
        setActionCommand(OurLayeredPane.ActionCommand.PositionInLayer.name());
    }

    int getSelectedPosition() {
        return isSelected()
                ? OurLayeredPane.FRONT_POSITION
                : OurLayeredPane.BACK_POSITION;
    }
}

//============================================================================

class DukeComponent extends JLabel {

    DukeComponent() {
        final ImageIcon dukeIcon = createIcon("images/dukeWaveRed.gif");
        if (dukeIcon != null) {
            setIcon(dukeIcon);
            setBounds(15, 225,
                    dukeIcon.getIconWidth(),
                    dukeIcon.getIconHeight());
        } else {
            System.err.println("Duke icon not found; using black square instead.");
            setBounds(15, 225, 30, 30);
            setOpaque(true);
            setBackground(Color.BLACK);
        }
    }

    static Point pointingAtDukesToe(int x, int y) {
        return new Point(x - 40, y - 57);
    }

    /** Returns null if the path was invalid. */
    private static ImageIcon createIcon(String path) {
        final java.net.URL imgURL = LayeredPaneDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}

//============================================================================

enum Panel {

    Yellow, Magenta, Cyan, Red, Green;

    static Panel    getDefault() { return Cyan; }

    static String[] namesForUI() { return namesForUI; }

    ColoredPanel    component()  { return comps[ordinal()]; }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    private static final ColoredPanel[] comps;
    private static final String[] namesForUI;
    private static final Color[] colors = {
            Color.yellow,
            Color.magenta,
            Color.cyan,
            Color.red,
            Color.green
    };

    static {
        assert colors.length == values().length;
        namesForUI =  new String[values().length];
        makeNamesForUI();
        comps = new ColoredPanel[values().length];
        makeColoredPanels();
    }

    Color getColor() { return colors[ordinal()]; }

    String getName() { return namesForUI[ordinal()]; }

    private static void makeNamesForUI() {
        for (Panel panel : values()) {
            final int index = panel.ordinal();
            namesForUI[index] = index + ". " + panel.name();
        }
    }

    private static void makeColoredPanels() {
        // Starting at origin, each panel is translated over and down by offset.
        // so the result is a cascade of operlapping panels.
        final Point origin = new Point(10, 20);
        final int offset = 35;

        for (Panel panel : values()) {
            comps[panel.ordinal()] = new ColoredPanel(panel, origin);
            origin.translate(offset, offset);
        }
    }
}

//============================================================================

class ColoredPanel extends JLabel {

    ColoredPanel(Panel panelColor, Point origin) {
        super(panelColor.getName());
        setBackground(panelColor.getColor());
        setForeground(Color.black);
        setVerticalAlignment  (JLabel.TOP);
        setHorizontalAlignment(JLabel.CENTER);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBounds(origin.x, origin.y, 140, 140);
    }
}

//==========================================================================
}
