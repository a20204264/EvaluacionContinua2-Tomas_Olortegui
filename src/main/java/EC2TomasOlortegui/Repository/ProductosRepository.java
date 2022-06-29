package EC2TomasOlortegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2TomasOlortegui.Model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}
