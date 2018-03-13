package com.example.professorsudoeste.appinfoaluno;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Professor Sudoeste on 08/03/2018.
 */

public abstract class InfoAlunoDB  extends SQLiteOpenHelper{

    private static  final int DATABASE_VERSION = 1;

    private static  final String DATABASE_NAME = "infoaluno.db";

    public InfoAlunoDB(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaUser = "CREATE TABLE" + UsuarioContract.UsuarioEntry.TABLE_NAME +" (" +
                UsuarioContract.UsuarioEntry._IDUSER + " INTEGERS PRIMARY KEY, " +
                UsuarioContract.UsuarioEntry.COLUMN_NAME + "TEXT NOT NULL, " +
                UsuarioContract.UsuarioEntry.COLUMN_EMAIL + "TEXT NOT NULL, " +
                UsuarioContract.UsuarioEntry.COLUMN_PASSWORD + " TEXT NOT NULL);";
        db.execSQL(sqlTabelaUser);

        String sqlTabelaSubject = "CREATE TABLE" + SubjectContract.SubjectEntry.TABLE_NAME +" (" +
                SubjectContract.SubjectEntry._IDUSUBJECT + " INTEGERS PRIMARY KEY, " +
                SubjectContract.SubjectEntry.COLUMN_SUBJECTNAME + "TEXT NOT NULL, " +
                SubjectContract.SubjectEntry.COLUMN_N1 + "TEXT NOT NULL, " +
                SubjectContract.SubjectEntry.COLUMN_N2 + "TEXT NOT NULL, " +
                SubjectContract.SubjectEntry.COLUMN_N3 + "TEXT NOT NULL, " +
                SubjectContract.SubjectEntry.COLUMN_N4 + "TEXT NOT NULL, " +
                SubjectContract.SubjectEntry.COLUMN_STATUS + " TEXT NOT NULL);";
        db.execSQL(sqlTabelaSubject);
    }

}
