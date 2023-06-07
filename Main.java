import java.util.List;
public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // Obtener todos los usuarios
        /*System.out.println("--- TODOS LOS USUARIOS ANTES DE OPERACIONES --");
        List<UsuarioModel> usuarios = usuarioDAO.obtenerTodos();
        for (UsuarioModel usuario : usuarios) {
            System.out.println(usuario.getId() + " - " + usuario.getNombre() + " - " + usuario.getEmail());
        }*/
        // -------------------------------------------------------------------------------------------------
        // Agregar un usuario
        /*System.out.println("--- ADD USER --");
        UsuarioModel nuevoUsuario = new UsuarioModel();
        nuevoUsuario.setNombre("Jesus Alejandro Pichardo");
        nuevoUsuario.setEmail("alepbuenrostro20@gmail.com");
        usuarioDAO.agregar(nuevoUsuario);
        // Mostrar registro agregado
        List<UsuarioModel> usuarios = usuarioDAO.obtenerTodos();
        for (UsuarioModel usuario : usuarios) {
            System.out.println(usuario.getId() + " - " + usuario.getNombre() + " - " + usuario.getEmail());
        }*/
        // -------------------------------------------------------------------------------------------------
        // Actualizar un usuario
        /*System.out.println("--- UPDATE USER --");
        UsuarioModel updateUsuario = new UsuarioModel();
        updateUsuario.setId(1);
        updateUsuario.setNombre("Alejandro Pichardo");
        updateUsuario.setEmail("alejandro.pichardo@gmail.com");
        usuarioDAO.actualizar(updateUsuario);
        // Mostrar usuario actualizado
        List<UsuarioModel> usuarios = usuarioDAO.obtenerTodos();
        for (UsuarioModel usuario : usuarios) {
            System.out.println(usuario.getId() + " - " + usuario.getNombre() + " - " + usuario.getEmail());
        }*/
        // -------------------------------------------------------------------------------------------------
        // borrar un usuario
        /*int idUsuarioAEliminar = 1;
        usuarioDAO.eliminar(idUsuarioAEliminar);
        System.out.println("--- DELETE USER --");
        List<UsuarioModel> usuarios = usuarioDAO.obtenerTodos();
        for (UsuarioModel usuario : usuarios) {
            System.out.println(usuario.getId() + " - " + usuario.getNombre() + " - " + usuario.getEmail());
        }*/
    }
}