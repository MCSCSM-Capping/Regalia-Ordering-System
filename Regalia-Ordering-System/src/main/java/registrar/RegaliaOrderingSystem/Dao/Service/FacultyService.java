package registrar.RegaliaOrderingSystem.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrar.RegaliaOrderingSystem.Dao.Repository.FacultyRepository;
import registrar.RegaliaOrderingSystem.Models.Faculty;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FacultyService {

    @Autowired
    private FacultyRepository repo;

    public List<Faculty> listAll(){
        return repo.findAll();
    }

    public void save(Faculty faculty){
        repo.save(faculty);
    }

    public Faculty get(long id){
        return repo.findById(id).get();
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
