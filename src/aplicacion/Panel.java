package aplicacion;


import java.awt.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


import javax.swing.*;




public class Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9203566610626554525L;

	public Panel() {
		
		this.setBackground(Color.BLACK);
		
		
		
		//****** CREACION FECHA ACTUAL********
		
		
		
		Font font = new Font("Calibri", Font.BOLD, 22);
		
		JLabel etqFechaActual=new JLabel("FECHA ACTUAL");	
		etqFechaActual.setFont(font);
		etqFechaActual.setForeground(Color.WHITE);
		etqFechaActual.setAlignmentX(CENTER_ALIGNMENT);
		
		
		String fechaHoy=getObtieneFecha();
		
		JLabel FechaActual=new JLabel(fechaHoy);
		FechaActual.setFont(font);
		FechaActual.setForeground(Color.ORANGE);
		FechaActual.setAlignmentX(CENTER_ALIGNMENT);
		
	
		//******** CREACION VENCIMIENTO ENLATADOS*******	
		
		
		
		JLabel etqFechaVencimiento=new JLabel("VENCIMIENTO ENLATADOS");
		etqFechaVencimiento.setFont(font);
		etqFechaVencimiento.setForeground(Color.WHITE);
		etqFechaVencimiento.setAlignmentX(CENTER_ALIGNMENT);
		
		
		String fechaVencimiento=getObtieneFechaVencimiento();
		
		JLabel FechaVencimiento=new JLabel(fechaVencimiento);
		FechaVencimiento.setFont(font);
		FechaVencimiento.setForeground(Color.ORANGE);
		FechaVencimiento.setAlignmentX(CENTER_ALIGNMENT);
		
		
		//***** CREACION VENCIMIENTO TRAGOS LISTOS*******
		
		
		
		JLabel etqTragosVencimiento=new JLabel("VENCIMIENTO TRAGOS LISTOS");
		etqTragosVencimiento.setFont(font);
		etqTragosVencimiento.setForeground(Color.WHITE);
		etqTragosVencimiento.setAlignmentX(CENTER_ALIGNMENT);
		
		
		String tragosVencimiento=getObtieneTragosVencimiento();
		
		JLabel TragosVencimiento=new JLabel(tragosVencimiento);
		TragosVencimiento.setFont(font);
		TragosVencimiento.setForeground(Color.ORANGE);
		TragosVencimiento.setAlignmentX(CENTER_ALIGNMENT);
		
	
		//******* CREACION VENCIMIENTO BOTELLAS *****************
		
		
		
		JLabel etqBotellasVencimiento=new JLabel("VENCIMIENTO BOTELLAS");
		etqBotellasVencimiento.setFont(font);
		etqBotellasVencimiento.setForeground(Color.WHITE);
		etqBotellasVencimiento.setAlignmentX(CENTER_ALIGNMENT);
		
		
		String botellasVencimiento=getObtieneBotellasVencimiento();
		
		JLabel BotellasVencimiento=new JLabel(botellasVencimiento);
		BotellasVencimiento.setFont(font);
		BotellasVencimiento.setForeground(Color.ORANGE);
		BotellasVencimiento.setAlignmentX(CENTER_ALIGNMENT);
					
		
		//******* CREACI�N LOTE****************
		
		
		
		JLabel etqLote=new JLabel("LOTE");
		etqLote.setFont(font);
		etqLote.setForeground(Color.WHITE);
		etqLote.setAlignmentX(CENTER_ALIGNMENT);	
		
		String numLote=getObtieneLote();
		
		JLabel Lote=new JLabel(numLote);
		Lote.setFont(font);
		Lote.setForeground(Color.ORANGE);
		Lote.setAlignmentX(CENTER_ALIGNMENT);
		
		
		//******* AGREGAMOS LOS JLABEL INDIVIDUALES A UN BOX GENERAL*******
			
		Box boxGeneral=Box.createVerticalBox();	
		
		//boxGeneral.setBackground(Color.BLUE);
		//boxGeneral.setOpaque(true);
		
		
		boxGeneral.add(Box.createVerticalStrut(15));
		boxGeneral.add(etqFechaActual);
		boxGeneral.add(FechaActual);
		boxGeneral.add(Box.createVerticalStrut(15));
		
		boxGeneral.add(etqFechaVencimiento);
		boxGeneral.add(FechaVencimiento);
		boxGeneral.add(Box.createVerticalStrut(15));
		boxGeneral.add(etqTragosVencimiento);
		boxGeneral.add(TragosVencimiento);
		boxGeneral.add(Box.createVerticalStrut(15));
		
		boxGeneral.add(etqBotellasVencimiento);
		boxGeneral.add(BotellasVencimiento);
		boxGeneral.add(Box.createVerticalStrut(15));
		
		boxGeneral.add(etqLote);
		boxGeneral.add(Lote);
		boxGeneral.add(Box.createVerticalStrut(15));
		
	
		
		
		//****** AGREGRAMOS EL BOX GENERAL AL PANEL********
			
		add(boxGeneral);
		
				
		
	}
	
	
	
	
	public String getObtieneFecha() {
		

		LocalDate fechaActual = LocalDate.now();
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String text = fechaActual.format(formatoFecha);
               
		return text;
	
		
	}
	
	public String getObtieneFechaVencimiento() {
		
		
		LocalDate localDateOf= LocalDate.now();
		
		LocalDate fechaVencimiento=localDateOf.plusDays(911);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String text=fechaVencimiento.format(formatoFecha);
		
	    return text;
	        	
		
	}
	
	public String getObtieneTragosVencimiento() {
		
		LocalDate localDateOf= LocalDate.now();
		
		LocalDate fechaVencimiento=localDateOf.plusDays(365*2);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String text=fechaVencimiento.format(formatoFecha);
		
	    return text;		
		
	}
	
	public String getObtieneBotellasVencimiento() {
		
		LocalDate localDateOf= LocalDate.now();
		
		LocalDate fechaVencimiento=localDateOf.plusDays(365);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String text=fechaVencimiento.format(formatoFecha);
		
	    return text;		
	
		
	}
	
	public String getObtieneLote() {
		
		LocalDate  FechaActual= LocalDate.now();
		
		int Lote=FechaActual.getDayOfYear();
		
		Formatter fmt = new Formatter();
		
		String text=fmt.format("%03d", Lote).toString();
		fmt.close();
		
		return text;
		
		
	}
	
}





