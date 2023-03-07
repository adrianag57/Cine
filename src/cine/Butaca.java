package cine;

public class Butaca {

	private boolean libre;
	private boolean bloqueada;
	private boolean ocupada;

	public Butaca() {

		libre = true;
		bloqueada = false;
	}

	public void setBloqueada() {
		bloqueada = true;
	}

	public String toString() {

		if (libre)
			return "-";
		else if (bloqueada)
			return "#";
		else
			return "X";
	}

}
