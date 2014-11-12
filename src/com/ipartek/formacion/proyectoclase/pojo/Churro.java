package com.ipartek.formacion.proyectoclase.pojo;

import java.util.Comparator;

public class Churro implements Comparable<Churro>, Comparator<Churro> {

	private Double caloria;

	public Churro() {
		super();
	}

	public Churro(Double caloria) {
		super();
		this.caloria = caloria;
	}

	@Override
	public int compareTo(Churro o) {
		// TODO Auto-generated method stub
		int resultado = 0;
		if (this.caloria < o.getCaloria()) {
			resultado = -1;
		} else if (this.caloria > o.getCaloria()) {
			resultado = 1;
		}
		return resultado;
	}

	@Override
	public int compare(Churro o1, Churro o2) {
		// TODO Auto-generated method stub
		int resultado = 0;
		return resultado;
	}

	public Double getCaloria() {
		return caloria;
	}

	public void setCaloria(Double caloria) {
		this.caloria = caloria;
	}

}
