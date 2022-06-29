package EC2TomasOlortegui.Service;

import java.util.List;
import EC2TomasOlortegui.DTO.ClienteDTORequest;
import EC2TomasOlortegui.DTO.ClienteDTOResponse;



public interface ClienteService {
	
	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id); 

}
