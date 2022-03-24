package com.onrsgr.rws.personelservice.personelmanagement.Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "rws_personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer personelId;
    @NotEmpty
    String personelRegistration;
    @NotEmpty
    String personelCallsign;
    @NotEmpty
    String personelName;
    @NotEmpty
    String personelSurname;
    @NotEmpty
    Date personelDateOfBirth;
    @NotEmpty
    String personelRank;
    @NotEmpty
    @Column(name = "ivao_id")
    Integer ivaoID;

    public Personel() {
    }

    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
    }

    public String getPersonelRegistration() {
        return personelRegistration;
    }

    public void setPersonelRegistration(String personelRegistration) {
        this.personelRegistration = personelRegistration;
    }

    public String getPersonelCallsign() {
        return personelCallsign;
    }

    public void setPersonelCallsign(String personelCallsign) {
        this.personelCallsign = personelCallsign;
    }

    public String getPersonelName() {
        return personelName;
    }

    public void setPersonelName(String personelName) {
        this.personelName = personelName;
    }

    public String getPersonelSurname() {
        return personelSurname;
    }

    public void setPersonelSurname(String personelSurname) {
        this.personelSurname = personelSurname;
    }

    public Date getPersonelDateOfBirth() {
        return personelDateOfBirth;
    }

    public void setPersonelDateOfBirth(Date personelDateOfBirth) {
        this.personelDateOfBirth = personelDateOfBirth;
    }

    public String getPersonelRank() {
        return personelRank;
    }

    public void setPersonelRank(String personelRank) {
        this.personelRank = personelRank;
    }

    public Integer getIvaoID() {
        return ivaoID;
    }

    public void setIvaoID(Integer ivaoID) {
        this.ivaoID = ivaoID;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personelId=" + personelId +
                ", personelRegistration='" + personelRegistration + '\'' +
                ", personelCallsign='" + personelCallsign + '\'' +
                ", personelName='" + personelName + '\'' +
                ", personelSurname='" + personelSurname + '\'' +
                ", personelDateOfBirth=" + personelDateOfBirth +
                ", personelRank='" + personelRank + '\'' +
                ", ivaoID=" + ivaoID +
                '}';
    }
}
