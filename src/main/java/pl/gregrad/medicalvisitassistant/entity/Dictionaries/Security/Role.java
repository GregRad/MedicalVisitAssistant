package pl.gregrad.medicalvisitassistant.entity.Dictionaries.Security;

import pl.gregrad.medicalvisitassistant.entity.Abstract.AbstractDictionaryEntity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "security_role")
public class Role extends AbstractDictionaryEntity {

}
