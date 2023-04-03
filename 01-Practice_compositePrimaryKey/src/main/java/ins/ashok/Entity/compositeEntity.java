package ins.ashok.Entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import ins.ashok.comositPrimary.AccountPk;
import lombok.Data;

@Entity
@Data
public class compositeEntity {
	@Column(name="branch_name")
      private String branchName;
	@Column(name="Acc_holder")
      private String AccHolder;
      @EmbeddedId
      private AccountPk accountpk;
}
