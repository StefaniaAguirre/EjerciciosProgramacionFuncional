package Punto1.DTO;


import java.util.LinkedList;
import java.util.List;

public final class InmutableMedicalLaboratoryRegistration {

    private final int idRegistry;
    private final String namePatient;
    private final int idPatient;
    private final String typeBlood;
    private final String patientGenes;
    private final List<String> results;
    private final String registrationNumber;
    private final String contactNumber;

    public InmutableMedicalLaboratoryRegistration(int idRegistry, String namePatient, int idPatient, String typeBlood, String patientGenes, List<String> results, String registrationNumber, String contactNumber) {
        this.idRegistry = idRegistry;
        this.namePatient = namePatient;
        this.idPatient = idPatient;
        this.typeBlood = typeBlood;
        this.patientGenes = patientGenes;
        this.results = results;
        this.registrationNumber = registrationNumber;
        this.contactNumber = contactNumber;
    }



    public int getIdRegistry() {
        return new Integer(idRegistry);
    }

    public String getNamePatient() {
        return namePatient;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public String getTypeBlood() {
        return typeBlood;
    }

    public String getPatientGenes() {
        return patientGenes;
    }

    public String getRegistrationNumber() {
        return new String();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<String> getResults() {
        return new LinkedList<>(results);
    }

    @Override
    public String toString() {
        return "InmutableMedicalLaboratoryRegistration{" +
                "idRegistry=" + idRegistry +
                ", namePatient='" + namePatient + '\'' +
                ", idPatient=" + idPatient +
                ", typeBlood='" + typeBlood + '\'' +
                ", patientGenes='" + patientGenes + '\'' +
                ", results='" + results + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
