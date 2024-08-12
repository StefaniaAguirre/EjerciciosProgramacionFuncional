package Punto1;

import Punto1.DTO.InmutableMedicalLaboratoryRegistration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClaseInmutable {

    public static void main(String[] args) {
        List<InmutableMedicalLaboratoryRegistration> patientRegistries = new ArrayList<>();

        patientRegistries.add(new InmutableMedicalLaboratoryRegistration(1, "John Doe", 1001, "O+", "Negative",  Arrays.asList("Result1", "Result2", "Result3"), "REG123", "123-456-7890"));
        patientRegistries.add(new InmutableMedicalLaboratoryRegistration(2, "Jane Smith", 1002, "A-", "Positive",  Arrays.asList("Result1", "Result2", "Result3"),"REG124", "098-765-4321"));
        patientRegistries.add(new InmutableMedicalLaboratoryRegistration(3, "Alice Johnson", 1003, "B+", "Negative",  Arrays.asList("Result1", "Result2", "Result3"), "REG125", "456-789-0123"));
        patientRegistries.add(new InmutableMedicalLaboratoryRegistration(4, "Bob Brown", 1004, "AB-", "Positive",  Arrays.asList("Result1", "Result2", "Result3"), "REG126", "321-654-0987"));

        System.out.println("patientRegistries Inicial --->");
        for (InmutableMedicalLaboratoryRegistration registry : patientRegistries) {

            System.out.println(registry);
        }
        System.out.println(" -------------------------------------------------------------- ");
       System.out.println(" patientRegistries intentando modificar la clase inmutable --->");
        patientRegistries.forEach(patientRegistrie -> {
            modifyDataObject(patientRegistrie);
            System.out.println(patientRegistrie);
        });

    }

    static void modifyDataObject(InmutableMedicalLaboratoryRegistration mutableComputer){
        List<String> results = mutableComputer.getResults();
        results.clear();
        results.add("Resultado negativo");
    }
}
