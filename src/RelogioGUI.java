import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RelogioGUI extends JFrame {

    Calendar calendario;
    SimpleDateFormat formatoTempo;
    SimpleDateFormat formatoDia;
    SimpleDateFormat formatoData;
    JLabel labelDia;
    JLabel labelTempo;
    JLabel labelData;
    String time;
    String data;
    String dia;

    RelogioGUI() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("RelogioJava");
        this.setSize(300, 250);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setResizable(false);

        formatoTempo = new SimpleDateFormat("hh:mm:ss a");
        formatoDia = new SimpleDateFormat("EEEE");
        formatoData = new SimpleDateFormat("dd/MM/yyyy ");

        labelTempo = new JLabel();
        labelDia = new JLabel();
        labelData = new JLabel();

        labelTempo.setFont(new Font("Arial", Font.PLAIN, 50));
        labelDia.setFont(new Font("Arial", Font.PLAIN, 40));
        labelData.setFont(new Font("Arial", Font.PLAIN, 40));
        labelTempo.setForeground(Color.black);
        labelTempo.setBackground(Color.CYAN);
        labelTempo.setOpaque(true);


        this.add(labelTempo);
        this.add(labelDia);
        this.add(labelData);
        setTime();
    }

    public void setTime() {

        while (true) {
            time = formatoTempo.format(Calendar.getInstance().getTime());
            labelTempo.setText(this.time);

            dia = formatoDia.format(Calendar.getInstance().getTime());
            labelDia.setText(this.dia);

            data = formatoData.format(Calendar.getInstance().getTime());
            labelData.setText(this.data);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
