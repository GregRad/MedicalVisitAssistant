package pl.gregrad.medicalvisitassistant.entity.Abstract;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/*
    Jeżeli będziesz tej klasy używać, to warto ją dokończyć o gettery/settery
    i nadpisane metody: toString(), equals() oraz hashCode().
    Gdybyś jej jednak nie używał, to pamiętaj, że taki kod się definitywnie wywala z projektu.
    Nie zostawiamy klas, których nie używamy.
 */
@MappedSuperclass
public abstract class AbstractDictionaryEntity extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String name;
    private String description;

}
