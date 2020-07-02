package edu.es.eoi.service;

import edu.es.eoi.entity.Pedido;
import edu.es.eoi.repository.MyRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PedidoService {
	
	MyRepository<Pedido> repository;
	
	public void alta(Pedido pedido) throws Exception {
		repository.save(pedido);
	}

	
	
}
