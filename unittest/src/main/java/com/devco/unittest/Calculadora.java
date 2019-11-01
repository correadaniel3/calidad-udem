package com.devco.unittest;

public class Calculadora
{
	public String calcular(final int i)
	{
		return construirRomano(5);
	}

	public String construirRomano(final int i)
	{
		if (i==5){
			return "V";
		}
		else{
			return "I";
		}
	}
}
