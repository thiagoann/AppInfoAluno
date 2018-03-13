package com.example.professorsudoeste.appinfoaluno;

import android.provider.BaseColumns;

/**
 * Created by Professor Sudoeste on 13/03/2018.
 */

public class SubjectContract {
    public static abstract class SubjectEntry implements BaseColumns {
        public static final String TABLE_NAME = "subject";

        public static final String _IDUSUBJECT = "_idSubject";
        public static final String COLUMN_SUBJECTNAME = "subjectname";
        public static final String COLUMN_N1 = "nota1";
        public static final String COLUMN_N2 = "nota2";
        public static final String COLUMN_N3 = "nota3";
        public static final String COLUMN_N4 = "nota4";
        public static final String COLUMN_STATUS = "status";
    }

}
