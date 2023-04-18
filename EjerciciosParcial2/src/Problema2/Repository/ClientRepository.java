package Problema2.Repository;

import Problema2.Model.TPoints;

import java.io.IOException;
import java.util.List;

public interface ClientRepository {

    List<TPoints> obtainAll() throws IOException, ClassNotFoundException;

    void add(TPoints tPoints) throws IOException;
    TPoints obtainById(Integer accesedId) ;
    void update(TPoints tPoints) throws IOException;
    void delete(Integer accesedId) throws  IOException;
}
