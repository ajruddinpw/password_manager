package ajju.ali.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ajju.ali.entity.PasswordEntity;

public interface PasswordRepository extends JpaRepository<PasswordEntity, Integer> {


}
