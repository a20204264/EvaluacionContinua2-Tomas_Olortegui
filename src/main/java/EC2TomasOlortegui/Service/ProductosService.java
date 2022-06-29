package EC2TomasOlortegui.Service;

import java.util.List;
import EC2TomasOlortegui.DTO.ProductoDTORequest;
import EC2TomasOlortegui.DTO.ProductoDTOResponse;



public interface ProductosService {
	
	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);

}
