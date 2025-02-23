package com.br.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.br.helpdesk.domain.Chamado;
import com.br.helpdesk.domain.Cliente;
import com.br.helpdesk.domain.Tecnico;
import com.br.helpdesk.domain.enums.Perfil;
import com.br.helpdesk.domain.enums.Prioridade;
import com.br.helpdesk.domain.enums.Status;
import com.br.helpdesk.repositores.ChamadoRepository;
import com.br.helpdesk.repositores.ClienteRepository;
import com.br.helpdesk.repositores.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instaciaDB() {



		Tecnico tec1 = new Tecnico(null,"Felipe Alcantara", "46530904409","felipealcantara1234@gmail.com",encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Carlos Silva", "12345678900", "carlos.silva@email.com", encoder.encode("senha123"));
		tec2.addPerfil(Perfil.ADMIN);
		Tecnico tec3 = new Tecnico(null, "Roberto Souza", "11122233344", "roberto.souza@email.com", encoder.encode("senha789"));
		tec3.addPerfil(Perfil.TECNICO);
		Tecnico tec4 = new Tecnico(null, "Lucas Mendes", "22233344455", "lucas.mendes@email.com", "senha321");
		tec4.addPerfil(Perfil.TECNICO);

		Cliente cli1 = new Cliente(null,"Neymar de Jesus", "38122833608", "NeymarPerigosinho123@gmail.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Mariana Oliveira", "98765432100", "mariana.oliveira@email.com", encoder.encode("senha456"));
		Cliente cli3 = new Cliente(null, "Fernanda Costa", "55566677788", "fernanda.costa@email.com", encoder.encode("senha000"));
		Cliente cli4 = new Cliente(null, "João Pedro", "99988877766", "joao.pedro@email.com", encoder.encode("senha654"));

		Chamado c1 = new Chamado(null,Prioridade.MEDIA, Status.ANDAMENTO,"Chamado 01", "Primeiro Chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Problema de conexão", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 03", "Manutenção preventiva", tec3, cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 04", "Erro no sistema", tec4, cli4);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c2));
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		clienteRepository.saveAll(Arrays.asList(cli3));
		chamadoRepository.saveAll(Arrays.asList(c3));
		tecnicoRepository.saveAll(Arrays.asList(tec4));
		clienteRepository.saveAll(Arrays.asList(cli4));
		chamadoRepository.saveAll(Arrays.asList(c4));

	}

}
