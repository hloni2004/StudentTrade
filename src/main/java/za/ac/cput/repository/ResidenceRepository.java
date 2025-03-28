package za.ac.cput.repository;

import za.ac.cput.domain.Residence;
import java.util.ArrayList;
import java.util.List;

public class ResidenceRepository implements IResidenceRepository {

    private static IResidenceRepository repository = null;
    private final List<Residence> residenceList;

    private ResidenceRepository() {
        residenceList = new ArrayList<>();
    }

    public static IResidenceRepository getRepository() {
        if (repository == null) {
            repository = new ResidenceRepository();
        }
        return repository;
    }

    @Override
    public Residence create(Residence residence) {
        boolean success = residenceList.add(residence);
        if (success) {
            return residence;
        }
        return null;
    }

    @Override
    public Residence read(String id) {
        // Using postalCode as a unique identifier for demonstration
        for (Residence r : residenceList) {
            if (r.getAddress().getPostalCode().equals(id)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public Residence update(Residence residence) {
        String id = residence.getAddress().getPostalCode();
        Residence existingResidence = read(id);
        if (existingResidence == null) {
            return null;
        }
        // Remove the existing Residence and add the updated one.
        if (delete(id)) {
            if (residenceList.add(residence)) {
                return residence;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Residence residenceToDelete = read(id);
        if (residenceToDelete == null) {
            return false;
        }
        return residenceList.remove(residenceToDelete);
    }

    @Override
    public List<Residence> getAll() {
        return residenceList;
    }
}
