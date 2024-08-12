package Punto1;

import Punto1.DTO.InmutableMedicalLaboratoryRegistration;
import Punto1.DTO.MutableComputer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClaseMutable {
    public static void main(String[] args) {
        List<MutableComputer> computers = new ArrayList<>();

        computers.add(new MutableComputer("Dell", "XPS 13", 16, 512, "Intel i7", "Windows 10"));
        computers.add(new MutableComputer("Apple", "MacBook Pro", 32, 1024, "Apple M1", "macOS"));
        computers.add(new MutableComputer("HP", "Pavilion", 8, 256, "AMD Ryzen 5", "Windows 11"));

        System.out.println("   Propiedades Computer INICIAL  --->");
        computers.forEach(computer -> System.out.println(computer));

        computers.stream()
                .filter(computer -> computer.getModel().equals("Dell"))
                .forEach(computer -> {
                    computer.setStorageSize(1024);
                    computer.setRamSize(32);
                });

        System.out.println("   -----------------------------------------        ");
        System.out.println("   Propiedades Computer Modificado Object que permite la mutabilidad   --->");
        computers.forEach(computer -> System.out.println(computer));
    }

}
