package aplicacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class FuncionesFechas {
	
	

	public String getObtieneFecha() {

		LocalDate fechaActual = LocalDate.now();

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String text = fechaActual.format(formatoFecha);

		return text;

	}

	public String getObtieneFechaVencimiento() {

		LocalDate localDateOf = LocalDate.now();

		LocalDate fechaVencimiento = localDateOf.plusDays(911);

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String text = fechaVencimiento.format(formatoFecha);

		return text;

	}

	public String getObtieneTragosVencimiento() {

		LocalDate localDateOf = LocalDate.now();

		LocalDate fechaVencimiento = localDateOf.plusDays(365 * 2);

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String text = fechaVencimiento.format(formatoFecha);

		return text;

	}

	public String getObtieneBotellasVencimiento() {

		LocalDate localDateOf = LocalDate.now();

		LocalDate fechaVencimiento = localDateOf.plusDays(365);

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String text = fechaVencimiento.format(formatoFecha);

		return text;

	}

	public String getObtieneLote() {

		LocalDate FechaActual = LocalDate.now();

		int Lote = FechaActual.getDayOfYear();

		Formatter fmt = new Formatter();

		String text = fmt.format("%03d", Lote).toString();
		fmt.close();

		return text;

	}

}
