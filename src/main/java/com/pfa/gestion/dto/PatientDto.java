package com.pfa.gestion.dto;

import java.util.Date;
import java.util.List;




import com.pfa.gestion.dao.entity.Dossier;
import com.pfa.gestion.dao.entity.Patient;
import com.pfa.gestion.dao.entity.RDV;



import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class PatientDto extends PersonneDto{


    private Date dateNaiss ;

    private String sexe ;

    private String etatCivil ;

    private String adresse;

    private String assurance;

    private String cnam ;

    //@JsonIgnore
    private Dossier dossier;

    //@JsonIgnore
    private List<RDV> rdvs;


    public static PatientDto fromEntity(Patient patient) {
        if(patient == null) {

            //to do throw an exception

        }

        return PatientDto.builder()

                .dateNaiss(patient.getDateNaiss())
                .sexe(patient.getSexe())
                .etatCivil(patient.getEtatCivil())
                .adresse(patient.getAdresse())
                .assurance(patient.getAssurance())
                .cnam(patient.getCnam())
                .build();
    }
    public static Patient toEntity(PatientDto patientDto) {
        if(patientDto == null) {

            //to do throw an exception

        }

        Patient patient = new Patient();
        patient.setDateNaiss(patientDto.getDateNaiss());
        patient.setSexe(patientDto.getSexe());
        patient.setEtatCivil(patientDto.getEtatCivil());
        patient.setAdresse(patientDto.getAdresse());
        patient.setAssurance(patientDto.getAssurance());
        patient.setCnam(patientDto.getCnam());


        return patient;
    }


}
