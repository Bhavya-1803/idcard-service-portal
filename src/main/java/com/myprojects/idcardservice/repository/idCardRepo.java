package com.myprojects.idcardservice.repository;
import com.myprojects.idcardservice.entity.IdCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface idCardRepo extends JpaRepository<IdCard, Integer> {

}
