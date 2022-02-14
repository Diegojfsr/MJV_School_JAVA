package mjv.springjparest.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.springjparest.model.Cadastro;
import mjv.springjparest.model.Endereco;
import mjv.springjparest.model.Profissao;
import mjv.springjparest.model.Sexo;
import mjv.springjparest.repository.CadastroRepository;
import mjv.springjparest.service.CadastroService;

@Component
public class Application implements CommandLineRunner {
	
	@Autowired
	private CadastroService cadastroService;
	@Override
	public void run(String... args) throws Exception {
		Endereco end = new Endereco();
		end.setLogradouro("Rua Almirante Frontin");
		end.setNumero("S/N");
		
		Cadastro cadastro = new Cadastro();
		cadastro.setCpfCnpj("12312");
		cadastro.setNome("GREYSON");
		cadastro.setSexo(Sexo.M);
		cadastro.setEndereco(end);
		Profissao p = new Profissao();
		p.setId(2);
		p.setNome("PROGRAMADOR");
		cadastro.setProfissao(p);
		
		cadastroService.salvarCadastro(cadastro);
	}

}
