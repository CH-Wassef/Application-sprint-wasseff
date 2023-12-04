package Service;

import Entity.Fournisseur;
import Utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class IServiceFournisseur implements IService<Fournisseur> {
    private Connection connection= DataSource.getInstance().getConnection();
    private Statement statement;
    public IServiceFournisseur(){
        try {
            statement= connection.createStatement();
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void ajouter(Fournisseur t) throws SQLException {
        String query = "insert into fournisseur values(fournissuer.getid,fournissuer.getnom,fournissuer.getprenom,fournissuer.getemail)";
        int res = statement.executeUpdate(query);
        System.out.println("fournisseur ajoutés: "+res);

    }

    @Override
    public void update(Fournisseur t) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public ArrayList<Fournisseur> readAll() throws SQLException {
        ArrayList<Fournisseur>fournisseurs = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from fournisseur");
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String nom=resultSet.getString(2);
                String prenom=resultSet.getString(3);
                String email=resultSet.getString(4);
                String adresse=resultSet.getString(5);
                fournisseurs.add(new Fournisseur(id,nom,prenom,email,adresse));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public ArrayList<Fournisseur> readAllById(int id) throws SQLException {
        ArrayList<Fournisseur>fournisseurs = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from produit where id="+id);
            while (resultSet.next()){
                id = resultSet.getInt(1);
                String nom=resultSet.getString(2);
                String prenom=resultSet.getString(3);
                String email=resultSet.getString(4);
                String adresse=resultSet.getString(5);
                fournisseurs.add(new Fournisseur(id,nom,prenom,email,adresse));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public Fournisseur get(int id) throws SQLException {
        return null;
    }
}
