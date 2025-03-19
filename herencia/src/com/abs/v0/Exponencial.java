package com.abs.v0;

public class Exponencial extends Operacion{
	
	public Exponencial(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return (int)Math.pow(x,y);
	}


}
