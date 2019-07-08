package com.example.dellayush.databaseapplcn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static  final int dbVersion = 1;
    private static final String databaseName = "Products.db" ;
    public static final String tableName = "ProductTable" ;
    public static final String firstColumn = "ID";
    public static final String secondColumn = "ProductName";

    public DatabaseHandler(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, databaseName, factory, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+tableName+"("+firstColumn+" INTEGER PRIMARY KEY AUTOINCREMENT, "+secondColumn+" TEXT "+");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+tableName);
        onCreate(db);
    }

    public void addProduct(Product product){
        ContentValues values = new ContentValues();
        values.put(secondColumn,product.getProductName());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(tableName,null,values);
        db.close();
    }

    public void deleteProduct(String productname){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + tableName + " WHERE " + secondColumn + "=\"" + productname + "\";");
    }

    public String databasetostring(){
        String dbString="";
        SQLiteDatabase db= getWritableDatabase();
        String query = "SELECT * FROM " + tableName + " WHERE 1";
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        while (!c.isAfterLast()) {
            if(c.getString(c.getColumnIndex("ProductName"))!=null) {
                dbString += c.getString(c.getColumnIndex(firstColumn))+" "+c.getString(c.getColumnIndex("ProductName"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }



}
