package EC2TomasOlortegui.Service;

import java.util.List;
import EC2TomasOlortegui.DTO.BodegaDTORequest;
import EC2TomasOlortegui.DTO.BodegaDTOResponse;

public interface BodegaService {
	
	void guardarBodega(BodegaDTORequest bodega);
	void actualizarBodega(BodegaDTORequest bodega);
	void eliminarBodega(Integer id);
	List<BodegaDTOResponse> listarBodegas();
	BodegaDTOResponse obtenerBodegaId(Integer id); 

}
