import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConMoeda extends JFrame  {
    public  JTextField textReais;
    public  JComboBox comboBoxMoeda;
    public  JTextField textResuldadoMoeda;
    public JPanel moedaEfG;
    private JButton bntMoeda;


    private static final double EURO = 5.38;
    private static final double GUARANI = 0.70;

    private static final double FRANCO = 5.55;

public ConMoeda() {
    comboBoxMoeda.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          if(comboBoxMoeda.getSelectedIndex() == 0){
              Double vlrMoeda = Double.valueOf(textReais.getText()) * EURO;
              textResuldadoMoeda.setText(vlrMoeda.toString());
          }else if (comboBoxMoeda.getSelectedIndex() == 1){
              Double vlrMoeda = Double.valueOf(textReais.getText()) * FRANCO;
              textResuldadoMoeda.setText(vlrMoeda.toString());
          } else if (comboBoxMoeda.getSelectedIndex() == 2) {
              Double vlrMoeda = Double.valueOf(textReais.getText()) * GUARANI;
              textResuldadoMoeda.setText(vlrMoeda.toString());
          }


        }
    });
}
}
