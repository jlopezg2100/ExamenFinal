package apps.IrvinTheSenpai.proyectsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

// Clase DataBase Helper que contiene todos los métodos crud
public class MyDbHelper extends SQLiteOpenHelper {

    public MyDbHelper(@Nullable Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //Crea la tabla de la base de datos
        db.execSQL(Constants.CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

         // actualizar la base de datos (si hay alguna estructura, cambie la versión de db)

        //descartar la tabla anterior si existe
        db.execSQL("DROP TABLE IF EXISTS "+ Constants.TABLE_NAME);
        //crear tabla de nuevo
        onCreate(db);
    }

    //Inserta datos a la base de datos
    public long insertRecord(String descripcion, String cantidad, String tiempo, String periocidad, String imagen){

        //get databse grabable porque queremos escribir datos

        SQLiteDatabase db =this.getWritableDatabase();

        ContentValues values = new ContentValues();


        // la identificación se insertará automáticamente cuando configuremos AUTOINCREMENTO en la consulta

        // inserta datos
        values.put(Constants.C_DESCRIPCION, descripcion);
        values.put(Constants.C_CANTIDAD, cantidad);
        values.put(Constants.C_TIEMPO, tiempo);
        values.put(Constants.C_PERIOCIDAD, periocidad);
        values.put(Constants.C_IMAGEN, imagen);

        // insertar fila, devolverá la identificación del registro guardado
        long id = db.insert(Constants.TABLE_NAME, null, values);


        // cerrar db Connection
        db.close();


       // devuelve la identificación del registro insertado
        return id;

    }
}
