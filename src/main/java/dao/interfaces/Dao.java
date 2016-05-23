package dao.interfaces;

import java.sql.*;

/**
 * Created by ZENIT on 23.05.2016.
 */
@FunctionalInterface
public interface Dao {
    Connection getConnection() throws SQLException;
}
