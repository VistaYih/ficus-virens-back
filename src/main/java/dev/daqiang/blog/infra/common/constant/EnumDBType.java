package dev.daqiang.blog.infra.common.constant;

public enum EnumDBType {
    MYSQL("MySQL","mysql"),
    POSTPRESQL("PostgreSQL", "postgresql"),
    ORACLE("Oracle", "oracle"),
    SQL_SERVER("SQL Server", "sqlserver"),
    H2("H2", "h2");

    private final String type;

    private final String alias;

    EnumDBType(String type, String alias) {
        this.type = type;
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public String getAlias() {
        return alias;
    }
}