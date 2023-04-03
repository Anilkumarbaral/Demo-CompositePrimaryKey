package ins.ashok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ins.ashok.Entity.compositeEntity;
import ins.ashok.comositPrimary.AccountPk;

public interface AccountRepository extends JpaRepository<compositeEntity, AccountPk> {
	
	

}
