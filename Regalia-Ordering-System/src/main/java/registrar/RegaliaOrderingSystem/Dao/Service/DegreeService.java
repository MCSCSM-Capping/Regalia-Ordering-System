package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.DegreeRepository;
import registrar.RegaliaOrderingSystem.Models.Degree;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DegreeService {

    @Autowired
    private DegreeRepository _degreeRepository;

    public List<Degree> listAll(){
        return _degreeRepository.findAll();
    }

    public void save(Degree degree){
        _degreeRepository.save(degree);
    }

    public Degree get(Long id){
        return _degreeRepository.findById(id).get();
    }

    public void delete(Long id){
        _degreeRepository.deleteById(id);
    }
}
