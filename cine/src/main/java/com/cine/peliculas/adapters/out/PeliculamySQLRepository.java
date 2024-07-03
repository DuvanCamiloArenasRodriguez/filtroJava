package com.cine.peliculas.adapters.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.cine.peliculas.domain.models.Pelicula;
import com.cine.peliculas.infraestructure.peliculaRepository;

public class PeliculamySQLRepository implements peliculaRepository{
    private final String url;
    private final String user;
    private final String password;

    
    public PeliculamySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(Pelicula pelicula) {
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            String query = "INSERT INTO pelicula (id, codinterno, nombre, duracion, sinopsis) VALUES (?,?,?,?,?)";
            try(PreparedStatement statement = connection.prepareStatement(query)){
                statement.setInt(1, pelicula.getId());
                statement.setString(2, pelicula.getCodinterno());
                statement.setString(3, pelicula.getNombre());
                statement.setString(4, pelicula.getDuracion());
                statement.setString(5, pelicula.getSinopsis());

                statement.executeUpdate();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void update(Pelicula pelicula) {
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            String query = "UPDATE pelicula SET codinterno = ?, nombre = ?, duracion = ?, sinopsis = ? WHERE id = ?";
            try(PreparedStatement statement = connection.prepareStatement(query)){
                statement.setInt(1, pelicula.getId());
                statement.setString(2, pelicula.getCodinterno());
                statement.setString(3, pelicula.getNombre());
                statement.setString(4, pelicula.getDuracion());
                statement.setString(5, pelicula.getSinopsis());

                statement.executeUpdate();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM pelicula WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public List<Pelicula> findAll() {
        List<Pelicula> peliculas = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM pelicula";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Pelicula pelicula = new Pelicula(
                        resultSet.getInt("id"),
                        resultSet.getString("codinterno"),
                        resultSet.getString("nombre"),
                        resultSet.getString("duracion"),
                        resultSet.getString("sinopsis")
                    );
                    peliculas.add(pelicula);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peliculas;
    }
}
