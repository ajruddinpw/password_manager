package ajju.ali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajju.ali.dao.PasswordRepository;
import ajju.ali.entity.PasswordEntity;

import java.util.List;
import java.util.Optional;

@Service
public class PasswordServiceImplementation implements PasswordService {

    private PasswordRepository passwordRepository;

    @Autowired
    public PasswordServiceImplementation(PasswordRepository thePasswordRepository) {
        passwordRepository = thePasswordRepository;
    }

    @Override
    public List<PasswordEntity> findAll() {
        return passwordRepository.findAll();
    }

    @Override
    public PasswordEntity findById(int theId) {
        Optional<PasswordEntity> result = passwordRepository.findById(theId);

        PasswordEntity thePasswordEntity = null;

        if (result.isPresent()) {
            thePasswordEntity = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return thePasswordEntity;
    }

    @Override
    public PasswordEntity save(PasswordEntity thePasswordEntity) {
        return passwordRepository.save(thePasswordEntity);
    }

    @Override
    public void deleteById(int theId) {
        passwordRepository.deleteById(theId);
    }
}






