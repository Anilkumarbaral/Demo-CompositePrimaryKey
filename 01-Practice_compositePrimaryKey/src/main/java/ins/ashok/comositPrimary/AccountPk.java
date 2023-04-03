package ins.ashok.comositPrimary;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class AccountPk implements Serializable{
        
	           private Long accNumb;
	           private String accType;
}
