package com.ipartek.formacion.primero.bean;

import com.ipartek.formacion.primero.bean.interfaces.IOrdenable;

public class Churro implements IOrdenable {

	private int calorias;

	public Churro(int calorias) {
		this.calorias = calorias;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	@Override
	public int getPeso() {
		return getCalorias();
	}

}
