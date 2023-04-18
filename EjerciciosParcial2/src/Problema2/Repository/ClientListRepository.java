package Problema2.Repository;

import Problema2.Model.TPoints;
import Problema2.ObjectSerializaer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientListRepository implements ClientRepository{

    private List<TPoints> dataSource;

    public ClientListRepository() throws  IOException, ClassNotFoundException{
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<TPoints> obtainAll() throws IOException, ClassNotFoundException {
        dataSource = (List<TPoints>) ObjectSerializaer.readObjectFromFile("Client.ax");
        return dataSource;
    }

    @Override
    public void add(TPoints tPoints) throws IOException {
        this.dataSource.add(tPoints);
        ObjectSerializaer.writeObjectToFile(this.dataSource,"Client.ax");
    }

    @Override
    public TPoints obtainById(Integer integer) {
        TPoints t = null;
        for(TPoints tp: dataSource) {
            if (tp.getAccesedId() != null && tp.getAccesedId().equals(tp.getAccesedId())) {
                t = tp;
                break;
            }
        }
        return t;
    }

    @Override
    public void update(TPoints tPoints) throws IOException {

    }


    @Override
    public void delete(Integer accesedId) throws IOException {
        this.dataSource.remove(this.obtainById(accesedId));
        ObjectSerializaer.writeObjectToFile(this.dataSource,"Client.ax");
    }
}
