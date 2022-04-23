package apps.IrvinTheSenpai.proyectsqlite;

public class Constants {
    // nombre base de datos
    public static final String DB_NAME = "My_RECORDS_DB";
    //version de base de datos
    public static final int DB_VERSION = 1;
    //nombre de la tabla
    public static final String TABLE_NAME = "MY_RECORDS_TABLE";
    //columnas/campos de la tabla
    public static final String C_ID = "ID";
    public static final String C_DESCRIPCION = "DESCRIPCION";
    public static final String C_CANTIDAD = "CANTIDAD";
    public static final String C_TIEMPO = "TIEMPO";
    public static final String C_PERIOCIDAD = "PERIOCIDAD";
    public static final String C_IMAGEN = "IMAGEN";
    //Crea la tabla Query
    public static  final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +"("
            + C_ID+ " INTEGER PRIMARY KEY,"
            + C_DESCRIPCION + "TEXT,"
            + C_CANTIDAD + "TEXT,"
            + C_TIEMPO + "TEXT,"
            + C_PERIOCIDAD + "TEXT,"
            + C_IMAGEN + "TEXT,"
            + ");";
}
