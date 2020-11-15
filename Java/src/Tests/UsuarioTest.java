package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Models.Usuario;

class UsuarioTest {

	private Usuario user;
	private Usuario userBugado;
	
	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario(0, "Teste", "da Silva", "01234567890", "silva@exemplo.com", "abc123", "Rua ABC", "01/01/2001", "Não Cadastrado");
		userBugado = new Usuario(1, "Teste", "dos Santos", "12312312312", "mail@@teste.com", "abc123", "Rua 123", "01/01/1991", "Não Cadastrado");
	}

	@Test
	@DisplayName("Testar validação de CPF")
	void ValidacaoDeCpf() {
		assertAll("CPF",
			() -> assertTrue(user.isCpfValido()),
			() -> assertFalse(userBugado.isCpfValido())
		);
	}

	@Test
	@DisplayName("Testar validação de e-mail")
	void ValidacaoDeEmail() {
		assertAll("Mail",
			() -> assertTrue(user.isEmailValido()),
			() -> assertFalse(userBugado.isEmailValido())
		);
	}

}
