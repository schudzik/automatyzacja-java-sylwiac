package kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Kocurek")

class KalkulatorAppTest {

    @Test
    public void addTest() {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();
                //act
       int suma = kalkulatorek.add(1,2);

        //assert
        Assertions.assertEquals(3,suma, "Sprawdź,że dodoawanie liczb całkowitych działa");
    }

    @Test
    public void nowy() {

    KalkulatorApp kalkulatorek = new KalkulatorApp();
    //act

    double suma = kalkulatorek.add(1.3,1.7);

    //assert
        Assertions.assertEquals(3,suma, "Sprawdź,że dodoawanie liczb całkowitych działa");
    }
}