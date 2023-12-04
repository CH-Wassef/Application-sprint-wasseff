package Service;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IService <Table> {

    void ajouter(Table t) throws SQLException;
    void update(Table t) throws SQLException;
    void delete(int id) throws SQLException;
    ArrayList<Table> readAll() throws SQLException;
    ArrayList<Table> readAllById(int id) throws SQLException;

    Table get(int id) throws SQLException;
}

