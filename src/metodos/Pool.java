package metodos;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class Pool {
    public DataSource dataSource; // Objeto de conexión a la base de datos

    public String db = "consultoraIT"; // Nombre de la base de datos
    public String url = "jdbc:mysql://localhost:3306/" + db; // URL de la base de datos
    public String user = "luis"; // Usuario de la base de datos
    public String pass = "luis"; // Contraseña de la base de datos

    public Pool() {
        inicializaDataSource();
    }


    private void inicializaDataSource() {
        BasicDataSource bDS = new BasicDataSource(); // Objeto de conexión a la base de datos

        bDS.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Driver de conexión a la base de datos
        bDS.setUsername(user); // Usuario de la base de datos
        bDS.setPassword(pass); // Contraseña de la base de datos
        bDS.setUrl(url); // URL de la base de datos
        //bDS.setMaxTotal(50); // Número máximo de conexiones a la base de datos

        dataSource = bDS; // Asignamos el objeto de conexión a la base de datos
    }
}
