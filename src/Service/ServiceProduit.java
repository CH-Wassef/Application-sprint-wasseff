package Service;

import Entity.Produit;
import Utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServiceProduit implements IServiceProduit<Produit>{
    private Connection connection= DataSource.getInstance().getConnection();
    private Statement statement;
    public ServiceProduit(){
        try {
            statement= connection.createStatement();
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    @Override
    public void ajouter(Produit produit) throws SQLException {
        String query = "insert into produit values(NULL,produit.getnom,produit.getlibelle,produit.getmatricule,produit.getprix)";
        int res = statement.executeUpdate(query);
        System.out.println("produit ajoutés: "+res);
    }

    @Override
    public void update(Produit t) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public ArrayList<Produit> readAll() throws SQLException {
        ArrayList<Produit>produit = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from produit");
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String nom=resultSet.getString(2);
                String libelle=resultSet.getString(3);
                double prix=resultSet.getDouble(4);
                int matricule=resultSet.getInt(5);
                produit.add(new Produit(id,nom,libelle,prix,matricule));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }


    @Override
    public ArrayList<Produit> readAllById(int id) throws SQLException {
        ArrayList<Produit>produit = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("select * from produit where id="+id);
            while (resultSet.next()){
                id = resultSet.getInt(1);
                String nom=resultSet.getString(2);
                String libelle=resultSet.getString(3);
                double prix=resultSet.getDouble(4);
                int matricule=resultSet.getInt(5);
                produit.add(new Produit(id,nom,libelle,prix,matricule));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public Produit get(int id) throws SQLException {
        return null;
    }
}

