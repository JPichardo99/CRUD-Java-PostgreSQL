import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO {
    public List<UsuarioModel> obtenerTodos() {
        List<UsuarioModel> usuarios = new ArrayList<>();

        try (Connection connection = ConexionDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

            while (resultSet.next()) {
                UsuarioModel usuario = new UsuarioModel();
                usuario.setId(resultSet.getInt("id"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setEmail(resultSet.getString("email"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public void agregar(UsuarioModel usuario) {
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO users (nombre, email) VALUES (?, ?)")) {

            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(UsuarioModel usuario) {
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE users SET nombre=?, email=? WHERE id=?")) {

            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setInt(3, usuario.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM users WHERE id=?")) {

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
