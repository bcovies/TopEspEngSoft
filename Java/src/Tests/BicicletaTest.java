package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Models.Bicicleta;

class BicicletaTest {

	private Bicicleta bike;
	private Bicicleta bikeAlugada;
	
	@BeforeEach
	void setUp() throws Exception {
		bike = new Bicicleta(0, "9h8f98h3n9upfd9a20a2j", "50km", "affg30pv", false);
		bikeAlugada = new Bicicleta(1, "u08wfe0j83wfak00f3", "250km", "dnn58d9t", true);
	}
	
	@Test
	void validacaoTokenTeste() {
		assertAll("TOKEN",
			() -> assertTrue(bike.totemDigitadoCorreto("affg30pv")),
			() -> assertTrue(bike.totemDigitadoCorreto("aFFg30pV")),
			() -> assertFalse(bike.totemDigitadoCorreto("b0fm"))
		);
	}
	
	@Test
	void validacaoBicicletaAlugada() {
		assertAll("Alugada",
			() -> assertFalse(bike.getAlugada()),
			() -> assertTrue(bikeAlugada.getAlugada())			
		);
	}

}
