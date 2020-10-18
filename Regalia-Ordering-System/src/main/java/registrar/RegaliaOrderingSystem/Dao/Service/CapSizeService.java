/**
 * Implements JpaRepository to provide a way to manage Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */


package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.CapSizeRepository;
import registrar.RegaliaOrderingSystem.Models.CapSize;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CapSizeService {


    @Autowired
    private CapSizeRepository _capSizeRepository;

    public List<CapSize> listAll(){
        return _capSizeRepository.findAll();
    }

    public void save(CapSize capSize){
        _capSizeRepository.save(capSize);
    }

    public CapSize get(Long id){
        return _capSizeRepository.findById(id).get();
    }

    public void delete(Long id){
        _capSizeRepository.deleteById(id);
    }
}
