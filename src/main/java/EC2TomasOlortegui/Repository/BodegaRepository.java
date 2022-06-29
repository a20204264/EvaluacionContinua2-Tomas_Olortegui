package EC2TomasOlortegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2TomasOlortegui.Model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
