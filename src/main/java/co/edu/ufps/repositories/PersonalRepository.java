package co.edu.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.ufps.entities.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal,Integer>{

}
