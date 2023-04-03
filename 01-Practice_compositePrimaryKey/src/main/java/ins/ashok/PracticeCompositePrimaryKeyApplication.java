package ins.ashok;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ins.ashok.Entity.compositeEntity;
import ins.ashok.comositPrimary.AccountPk;
import ins.ashok.repo.AccountRepository;

@SpringBootApplication
public class PracticeCompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PracticeCompositePrimaryKeyApplication.class,
				args);
		AccountRepository repo = context.getBean(AccountRepository.class);
//		
//		AccountPk pk = new AccountPk();
//		pk.setAccNumb(123456789l);
//		pk.setAccType("saving");
//
//		compositeEntity cm = new compositeEntity();
//		cm.setAccHolder("anil kumar baral");
//		cm.setBranchName("bhimpur");
//		cm.setAccountpk(pk);
//
//		repo.save(cm);
//		System.out.println("successfully inserted..");

		AccountPk pk=new AccountPk();
		pk.setAccNumb(123456789l);
		pk.setAccType("saving");
		
		
		 Optional<compositeEntity>com= repo.findById(pk);
		 System.out.println(com.get());
//		    compositeEntity re  =com.get();
//		    System.out.println(re);
		
	}

}
