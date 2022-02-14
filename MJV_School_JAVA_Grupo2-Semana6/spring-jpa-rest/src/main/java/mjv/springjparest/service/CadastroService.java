package mjv.springjparest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.springjparest.model.Cadastro;
import mjv.springjparest.repository.CadastroRepository;
import mjv.springjparest.repository.ProfissaoRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private ProfissaoRepository profissaoRepository;
	
	public void salvarCadastro(Cadastro cadastro) {
		boolean existeProf=profissaoRepository.existsById(cadastro.getProfissao().getId());
		if(existeProf) {
			repository.save(cadastro);
		}else {
			System.out.println("CADASTRO NÂO REALIZADO. ID PROFISSAO NÂO EXISTE!");
		}
					
	}

}
