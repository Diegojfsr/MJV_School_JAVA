package mjv.spring;

import java.io.File;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import mjv.spring.adm.dominio.Role;
import mjv.spring.adm.dominio.Usuario;
import mjv.spring.adm.dominio.UsuarioRepositorio;
import mjv.spring.core.dominio.Cidade;
import mjv.spring.core.dominio.CidadeRepositorio;
import mjv.spring.rh.dominio.Departamento;
import mjv.spring.rh.dominio.DepartamentoRepositorio;
import mjv.spring.rh.dominio.Pessoa;
import mjv.spring.rh.dominio.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;
	@Autowired
	private CidadeRepositorio cidadeRepo;
	@Autowired
	private DepartamentoRepositorio departamentoRepo;
	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		File jsonFile = ResourceUtils.getFile("classpath:municipios.json");
		ObjectMapper cidadeMapper = new ObjectMapper();
		JsonNode dataNode = cidadeMapper.readTree(jsonFile).get("data");
		
		dataNode.forEach((cidadeNode) -> {
			Cidade cidade = new Cidade();
			cidade.setCodigo(cidadeNode.get("Codigo").asText());
			cidade.setNome(cidadeNode.get("Nome").asText());
			cidade.setUf(cidadeNode.get("Uf").asText());
			cidadeRepo.save(cidade);
		});
		
		cidadeRepo.flush();

		Departamento departamento1 = new Departamento("Tecnologia da Informação", "TI");
		Departamento departamento2 = new Departamento("Recursos Humanos", "RH");
		Departamento departamento3 = new Departamento("Produção", "PROD");
		departamentoRepo.save(departamento1);
		departamentoRepo.save(departamento2);
		departamentoRepo.save(departamento3);
		
		departamentoRepo.flush();
		
		Cidade cidade1 = cidadeRepo.findById(1L).get();
		
		Pessoa p1 = new Pessoa("Diego");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("Diegojfsr@gmail.com");
		p1.setCpf("10518516962");
		p1.setCidade(cidade1);
		p1.setDepartamento(departamento1);
		
		Pessoa p2 = new Pessoa("Camille");
		p2.setDataNascimento(LocalDate.of(1900, 1, 1));
		p2.setEmail("camille@gmail.com");
		p2.setCpf("10518516962");
		p2.setCidade(cidade1);
		p2.setDepartamento(departamento2);

		Pessoa p3 = new Pessoa("Gustavo");
		p3.setDataNascimento(LocalDate.of(1990, 2, 1));
		p3.setEmail("Gustavo@gmail.com");
		p3.setCpf("10518516962");
		p3.setCidade(cidade1);
		p3.setDepartamento(departamento3);
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
		pessoaRepo.save(p3);
		
		Usuario u1 = new Usuario("Diego", passwordEncoder.encode("Diego"));
		u1.setRole(Role.ADMIN.getNome());
		
		Usuario u2 = new Usuario("user", passwordEncoder.encode("user"));
		
		usuarioRepo.save(u1);
		usuarioRepo.save(u2);
	}
}
