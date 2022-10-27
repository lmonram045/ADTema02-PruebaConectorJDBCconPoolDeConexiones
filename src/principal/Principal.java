package principal;

import metodos.Pool;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Con este programa se muestra como crear un pool de conexiones a una base de datos.
 *
 * Son necesarias las siguientes librerías:
 *
 * 1. commons-dbcp2-2.9.0.jar
 * 2. commons-pool2-2.11.1.jar
 * 3. mysql-connector-java-8.0.31.jar
 * 4. commons-logging-1.2.jar
 */
public class Principal {

    public static void main(String[] args) {
        Pool metodopool = new Pool();
        java.sql.Connection conexion = null;

        try {
            conexion = metodopool.dataSource.getConnection(); // Obtenemos la conexión a la base de datos

            if (conexion != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                conexion.close(); // Cerramos la conexión a la base de datos
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}

