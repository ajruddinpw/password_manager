package ajju.ali.service;

import java.util.List;

import ajju.ali.entity.PasswordEntity;

public interface PasswordService {

    List<PasswordEntity> findAll();

    PasswordEntity findById(int theId);

    PasswordEntity save(PasswordEntity thePasswordEntity);

    void deleteById(int theId);

}
