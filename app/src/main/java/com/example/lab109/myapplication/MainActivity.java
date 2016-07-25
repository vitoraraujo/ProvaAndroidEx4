package com.example.lab109.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class MainActivity extends SQLiteOpenHelper {
    private String NOME_BANCO = "banco.db";
    private String TABELA = "mercadoAzul";
    private String ID = "_id";
    private String NOME = "nome";
    private String QUANTESTOQUE = "quantEstoque" ;
    private String PRECOUNITARIO = "precoUnitario";
    private int VERSAO = 1;

    public MainActivity(Context context){
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + NOME + "text,"
                + QUANTESTOQUE + "int,"
                + PRECOUNITARIO + "int"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void receita(SQLiteDatabase db){
        String sql = "SELECT qantEstoque, precoUnitario FROM mercadoAzul;";
    }
}