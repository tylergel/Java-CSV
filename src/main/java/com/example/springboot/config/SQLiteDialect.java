package com.example.springboot.config;

import java.sql.Types;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.hibernate.type.StringType;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        registerColumnType(Types.BIT, "integer");
        registerColumnType(Types.TINYINT, "tinyint");
        registerColumnType(Types.SMALLINT, "smallint");
        registerColumnType(Types.INTEGER, "integer");

    }

    public boolean supportsIdentityColumns() {
       return true;
   }

   public String getIdentitySelectString(String table, String column, int type)
      {
       return "select last_insert_rowid()";
   }

   public String getIdentityColumnString(int type)  {
       return "integer";
   }

}
