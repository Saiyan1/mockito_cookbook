package org.reserv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTest {

    @InjectMocks
    Calculadora calc = new Calculadora(); //Dependiente que debe ser instanciado al momento de la anotarlo, no se puede en Before

    @Mock
    CalculadoraGoogleCloud calcCloud; //Dependencia

    @Test
    public void probarSuma() {
        assertEquals(10.0, calc.sumar(5,5), 0.001);
    }

    @Test
    public void probarSumaEnCloud() {
        when(calcCloud.sumar(5,5)).thenReturn(10.0); //Comportamiento del Mock
        assertEquals(10.0, calc.sumarEnCloud(5,5), 0.001);
    }
}
