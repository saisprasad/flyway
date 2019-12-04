package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V2__InsertCustomer extends BaseJavaMigration
{
    public void migrate(Context context) throws Exception {
        try (Statement insert = context.getConnection().createStatement()) {
            insert.execute("insert into customer (name, id, lineofBusiness) values ('Nike', 101, 'Shoes')");
        }
    }
}