package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultHandler<T> {

    T handle(ResultSet set) throws SQLException;

}
