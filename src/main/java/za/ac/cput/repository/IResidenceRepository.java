package za.ac.cput.repository;

import za.ac.cput.domain.Residence;
import java.util.List;

public interface IResidenceRepository {

    Residence create(Residence residence);
    Residence read(String id);
    Residence update(Residence residence);
    boolean delete(String id);
    List<Residence> getAll();

}
