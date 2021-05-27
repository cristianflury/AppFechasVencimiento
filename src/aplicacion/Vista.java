package aplicacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.SwingConstants;

import javax.swing.JSeparator;


public class Vista extends JFrame {


	private static final long serialVersionUID = 5491672040527458245L;
	private JPanel contentPane;

	public Vista() {
		setResizable(false);
		setFont(new Font("ADAM.CG PRO", Font.PLAIN, 12));
		setTitle("REGIONAL TRADE");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vista.class.getResource("/aplicacion/LOGO NUEVO.png")));
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 540,470);
		contentPane = new JPanel();
	
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(15, 0, 0, 0));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel etqFechaActual = new JLabel("FECHA ACTUAL");
		etqFechaActual.setForeground(new Color(255, 255, 224));
		etqFechaActual.setAlignmentX(Component.CENTER_ALIGNMENT);
		etqFechaActual.setHorizontalAlignment(SwingConstants.CENTER);
		etqFechaActual.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(Color.WHITE);
		
		verticalBox.add(etqFechaActual);
		contentPane.add(verticalBox);
		
		FuncionesFechas fecha=new FuncionesFechas();
		
		
		
		JLabel fechaActual = new JLabel(fecha.getObtieneFecha());
		fechaActual.setForeground(new Color(255, 140, 0));
		fechaActual.setAlignmentX(Component.CENTER_ALIGNMENT);
		fechaActual.setFont(new Font("Times New Roman", Font.BOLD, 22));
		verticalBox.add(fechaActual);
		
		JSeparator separator = new JSeparator();
		verticalBox.add(separator);
		
		Component verticalStrut = Box.createVerticalStrut(15);
		verticalBox.add(verticalStrut);
		
		JLabel etqEnlatados = new JLabel("VENCIMIENTO ENLATADOS");
		etqEnlatados.setForeground(new Color(255, 255, 224));
		etqEnlatados.setBackground(Color.ORANGE);
		etqEnlatados.setFont(new Font("Times New Roman", Font.BOLD, 22));
		etqEnlatados.setAlignmentX(Component.CENTER_ALIGNMENT);
		etqEnlatados.setHorizontalAlignment(SwingConstants.CENTER);
		verticalBox.add(etqEnlatados);
		
		JLabel enlatadosVencimiento = new JLabel(fecha.getObtieneFechaVencimiento());
		enlatadosVencimiento.setForeground(new Color(255, 140, 0));
		enlatadosVencimiento.setFont(new Font("Times New Roman", Font.BOLD, 22));
		enlatadosVencimiento.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(enlatadosVencimiento);
		
		JSeparator separator_7 = new JSeparator();
		verticalBox.add(separator_7);
		
		Component verticalStrut_1 = Box.createVerticalStrut(15);
		verticalBox.add(verticalStrut_1);
		
		JLabel etqTragosListos = new JLabel("VENCIMIENTO TRAGOS LISTOS");
		etqTragosListos.setForeground(new Color(255, 255, 224));
		etqTragosListos.setAlignmentX(Component.CENTER_ALIGNMENT);
		etqTragosListos.setFont(new Font("Times New Roman", Font.BOLD, 22));
		verticalBox.add(etqTragosListos);
		
		JLabel vencimientoTragos = new JLabel(fecha.getObtieneTragosVencimiento());
		vencimientoTragos.setForeground(new Color(255, 140, 0));
		vencimientoTragos.setFont(new Font("Times New Roman", Font.BOLD, 22));
		vencimientoTragos.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(vencimientoTragos);
		
		JSeparator separator_8 = new JSeparator();
		verticalBox.add(separator_8);
		
		Component verticalStrut_2 = Box.createVerticalStrut(15);
		verticalBox.add(verticalStrut_2);
		
		JLabel etqBotellas = new JLabel("VENCIMIENTO BOTELLAS");
		etqBotellas.setForeground(new Color(255, 255, 224));
		etqBotellas.setFont(new Font("Times New Roman", Font.BOLD, 22));
		etqBotellas.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(etqBotellas);
		
		JLabel vencimientoBotellas = new JLabel(fecha.getObtieneBotellasVencimiento());
		vencimientoBotellas.setForeground(new Color(255, 140, 0));
		vencimientoBotellas.setFont(new Font("Times New Roman", Font.BOLD, 22));
		vencimientoBotellas.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(vencimientoBotellas);
		
		JSeparator separator_9 = new JSeparator();
		verticalBox.add(separator_9);
		
		Component verticalStrut_3 = Box.createVerticalStrut(15);
		verticalBox.add(verticalStrut_3);
		
		JLabel etqVencimientoFrascos = new JLabel("VENCIMIENTO FRASCOS");
		etqVencimientoFrascos.setHorizontalAlignment(SwingConstants.CENTER);
		etqVencimientoFrascos.setForeground(new Color(255, 255, 224));
		etqVencimientoFrascos.setFont(new Font("Times New Roman", Font.BOLD, 22));
		etqVencimientoFrascos.setBackground(Color.ORANGE);
		etqVencimientoFrascos.setAlignmentX(0.5f);
		verticalBox.add(etqVencimientoFrascos);
		
		JLabel vencimientoFrascos = new JLabel(fecha.getObtieneFechaVencimiento());
		vencimientoFrascos.setForeground(new Color(255, 140, 0));
		vencimientoFrascos.setFont(new Font("Times New Roman", Font.BOLD, 22));
		vencimientoFrascos.setAlignmentX(0.5f);
		verticalBox.add(vencimientoFrascos);
		
		JSeparator separator_1 = new JSeparator();
		verticalBox.add(separator_1);
		
		Component verticalStrut_4 = Box.createVerticalStrut(15);
		verticalBox.add(verticalStrut_4);
		
		JLabel etqLote = new JLabel("LOTE");
		etqLote.setForeground(new Color(255, 255, 224));
		etqLote.setFont(new Font("Times New Roman", Font.BOLD, 22));
		etqLote.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(etqLote);
		
		JLabel Lote = new JLabel(fecha.getObtieneLote());
		Lote.setForeground(new Color(255, 140, 0));
		Lote.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Lote.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(Lote);
		
		
		
	}

}
