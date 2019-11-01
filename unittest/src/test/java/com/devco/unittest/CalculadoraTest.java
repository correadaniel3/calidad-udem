package com.devco.unittest;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.hamcrest.EasyMock2Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(JUnit4.class)
public class CalculadoraTest
{
	@Spy
	Calculadora calculadora;

	@Before
	public void setUp(){
		 calculadora=new Calculadora();
	}
	@Test
	public void cuandoIngresa5EntoncesRetornaV(){
		Mockito.when(calculadora.construirRomano(Mockito.any())).thenReturn("V");
		String respuesta = calculadora.calcular(5);

		assertThat(respuesta, is(equalTo("V")));

	}
}
