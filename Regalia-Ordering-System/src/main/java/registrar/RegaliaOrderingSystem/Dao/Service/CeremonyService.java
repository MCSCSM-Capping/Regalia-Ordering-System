/**
 * Implements JpaRepository to provide a way to manage Entity
 * @version 1.0
 * @author Steven Buglione
 *
 */


package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.CeremonyRepository;
import registrar.RegaliaOrderingSystem.Models.Ceremony;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CeremonyService {

    @Autowired
    private CeremonyRepository _ceremonyRepository;

    public List<Ceremony> listAll(){
        return _ceremonyRepository.findAll();
    }

    public void save(Ceremony ceremony){
        _ceremonyRepository.save(ceremony);
    }

    public Ceremony get(Long id){
        return _ceremonyRepository.findById(id).get();
    }

    public void delete(Long id){
        _ceremonyRepository.deleteById(id);
    }

    public Ceremony getCermonyByName(String name){
        Ceremony ceremony = _ceremonyRepository.getCeremonyByName(name);
        return ceremony;
    }
}
