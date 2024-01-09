package com.infowithvijay.triviaquizapp2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.infowithvijay.triviaquizapp2.TriviaQuizContract.*;

import java.util.ArrayList;

public class TriviaQuizHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "TriviaQuiz.db";
    private static final int DATBASE_VERSION = 19;

    private SQLiteDatabase db;


    TriviaQuizHelper(Context context) {
        super(context, DATABASE_NAME,null, DATBASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " TEXT, " +
                QuestionTable.COLUMN_CATEGORY + " TEXT, " +
                QuestionTable.COLUMN_LEVELS_ID + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }


    private void fillQuestionsTable()
    {
        TriviaQuestion q1 = new TriviaQuestion("Pada Sistem Periodik Modern terdapat berapa banyak golongan ?",
                "16 golongan",
                "17 golongan",
                "18 golongan ",
                "19 golongan",
                "18 golongan ",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q1);

        TriviaQuestion q2 = new TriviaQuestion("Dalam sistem periodik modern, golongan menyatakan apa ?",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
                "jumlah atom",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terdalam)",
                "bilangan kuantum",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q2);

        TriviaQuestion q3 = new TriviaQuestion("Apa Kepa njangan dari Gol. IA? Gambar = H,Li,Na,K,Rb,Cs,Fr",
                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
                "Hidrogen, Litium, Nitrogen, Kalsium, Rubidium, Cesium dan Fransium",
                "Hidrogen, Litium, Natrium, Kalsium, Rubidium, Cesium, dan Fluorine",
                "Hidrogen, Litium, Nitrogen, Kalium, Rubidium, Cesium, dan Fluorine",
                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q3);

        TriviaQuestion q4 = new TriviaQuestion("Unsur-unsur apa saja yang terdapat pada Gol. 5A?",
                "N, P, As, Sb, Bi, dan Mc",
                "C, Si, Ge, Sn, Pb, dan Fl",
                "He, Ne, Ar, Kr, Xe, Rn, dan Og",
                "Be, Mg, Ca, Sr, Ba, dan Ra",
                "N, P, As, Sb, Bi, dan Mc",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q4);

        TriviaQuestion q5 = new TriviaQuestion("Berikut ini yang merupakan kelompok unsur golongan gas Mulia adalah? ",
                "C, Si, Ge, Sn, Pb, dan Fl",
                "He, Ne, Ar, Kr, Xe, dan Rn",
                "Be, Mg, Ca, Sr, Ba, dan Ra",
                "H, Li, Na, K, Rb, Cs, dan Fr",
                "He, Ne, Ar, Kr, Xe, dan Rn",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q5);

        TriviaQuestion q6 = new TriviaQuestion("Apa singkatan dari unsur-unsur Gol. 1B (Tembaga, Perak, Emas, dan Roentgenium)?",
                "Cu, Ag, Au, dan Rg.",
                "Tb, Pr, Es, dan Rg.",
                "Co, Ar, Au, dan Rg.",
                "Cu, Au, Ag, dan Rg",
                "Cu, Ag, Au, dan Rg.",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q6);

        TriviaQuestion q7 = new TriviaQuestion("Secara berurutan disebut apakah golongan A dan B?",
                "Golongan Utama dan Golongan Transisi",
                "Golongan Transisi dan Golongan Utama",
                "Golongan Utama dan Golongan Halogen",
                "Golongan Lantanida dan Golongan Aktinida",
                "Golongan Utama dan Golongan Transisi",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q7);

        TriviaQuestion q8 = new TriviaQuestion("Suatu unsur memiliki konfigurasi elektron [Ne] 3s2 3p5 terletak pada golongan?",
                "Golongan VII A.",
                "Golongan VI A.",
                "Golongan V A.",
                "Golongan IIV A.",
                "Golongan VII A.",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q8);

        TriviaQuestion q11 = new TriviaQuestion("Pada Sistem Periodik Modern terdapat berapa banyak golongan ?",
                "16 golongan",
                "17 golongan",
                "18 golongan ",
                "19 golongan",
                "18 golongan ",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q11);

        TriviaQuestion q22 = new TriviaQuestion("Dalam sistem periodik modern, golongan menyatakan apa ?",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
                "jumlah atom",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terdalam)",
                "bilangan kuantum",
                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q22);

        TriviaQuestion q33 = new TriviaQuestion("Apa Kepa njangan dari Gol. IA? Gambar = H,Li,Na,K,Rb,Cs,Fr",
                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
                "Hidrogen, Litium, Nitrogen, Kalsium, Rubidium, Cesium dan Fransium",
                "Hidrogen, Litium, Natrium, Kalsium, Rubidium, Cesium, dan Fluorine",
                "Hidrogen, Litium, Nitrogen, Kalium, Rubidium, Cesium, dan Fluorine",
                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q33);

        TriviaQuestion q44 = new TriviaQuestion("Unsur-unsur apa saja yang terdapat pada Gol. 5A?",
                "N, P, As, Sb, Bi, dan Mc",
                "C, Si, Ge, Sn, Pb, dan Fl",
                "He, Ne, Ar, Kr, Xe, Rn, dan Og",
                "Be, Mg, Ca, Sr, Ba, dan Ra",
                "N, P, As, Sb, Bi, dan Mc",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q44);

        TriviaQuestion q55 = new TriviaQuestion("Berikut ini yang merupakan kelompok unsur golongan gas Mulia adalah? ",
                "C, Si, Ge, Sn, Pb, dan Fl",
                "He, Ne, Ar, Kr, Xe, dan Rn",
                "Be, Mg, Ca, Sr, Ba, dan Ra",
                "H, Li, Na, K, Rb, Cs, dan Fr",
                "He, Ne, Ar, Kr, Xe, dan Rn",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q55);

        TriviaQuestion q66 = new TriviaQuestion("Apa singkatan dari unsur-unsur Gol. 1B (Tembaga, Perak, Emas, dan Roentgenium)?",
                "Cu, Ag, Au, dan Rg.",
                "Tb, Pr, Es, dan Rg.",
                "Co, Ar, Au, dan Rg.",
                "Cu, Au, Ag, dan Rg",
                "Cu, Ag, Au, dan Rg.",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q66);

        TriviaQuestion q77 = new TriviaQuestion("Secara berurutan disebut apakah golongan A dan B?",
                "Golongan Utama dan Golongan Transisi",
                "Golongan Transisi dan Golongan Utama",
                "Golongan Utama dan Golongan Halogen",
                "Golongan Lantanida dan Golongan Aktinida",
                "Golongan Utama dan Golongan Transisi",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q77);

        TriviaQuestion q88 = new TriviaQuestion("Suatu unsur memiliki konfigurasi elektron [Ne] 3s2 3p5 terletak pada golongan?",
                "Golongan VII A.",
                "Golongan VI A.",
                "Golongan V A.",
                "Golongan IIV A.",
                "Golongan VII A.",
                TriviaQuestion.CATEGORY_TPU,1);
        addQuestions(q88);

//        TriviaQuestion q1 = new TriviaQuestion("Pada Sistem Periodik Modern terdapat berapa banyak golongan ?",
//                "16 golongan",
//                "17 golongan",
//                "18 golongan ",
//                "19 golongan",
//                "18 golongan ",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q1);
//
//        TriviaQuestion q2 = new TriviaQuestion("Dalam sistem periodik modern, golongan menyatakan apa ?",
//                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
//                "jumlah atom",
//                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terdalam)",
//                "bilangan kuantum",
//                "jumlah elektron valensi (jmlh elektron valensi = jumlah elektron di kulit terluar)",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q2);
//
//        TriviaQuestion q3 = new TriviaQuestion("Apa Kepa njangan dari Gol. IA? Gambar = H,Li,Na,K,Rb,Cs,Fr",
//                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
//                "Hidrogen, Litium, Nitrogen, Kalsium, Rubidium, Cesium dan Fransium",
//                "Hidrogen, Litium, Natrium, Kalsium, Rubidium, Cesium, dan Fluorine",
//                "Hidrogen, Litium, Nitrogen, Kalium, Rubidium, Cesium, dan Fluorine",
//                "Hidrogen, Litium, Natrium, Kalium, Rubidium, Cesium, dan Fransium",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q3);
//
//        TriviaQuestion q4 = new TriviaQuestion("Unsur-unsur apa saja yang terdapat pada Gol. 5A?",
//                "N, P, As, Sb, Bi, dan Mc",
//                "C, Si, Ge, Sn, Pb, dan Fl",
//                "He, Ne, Ar, Kr, Xe, Rn, dan Og",
//                "Be, Mg, Ca, Sr, Ba, dan Ra",
//                "N, P, As, Sb, Bi, dan Mc",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q4);
//
//        TriviaQuestion q5 = new TriviaQuestion("Berikut ini yang merupakan kelompok unsur golongan gas Mulia adalah? ",
//                "C, Si, Ge, Sn, Pb, dan Fl",
//                "He, Ne, Ar, Kr, Xe, dan Rn",
//                "Be, Mg, Ca, Sr, Ba, dan Ra",
//                "H, Li, Na, K, Rb, Cs, dan Fr",
//                "He, Ne, Ar, Kr, Xe, dan Rn",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q5);
//
//        TriviaQuestion q6 = new TriviaQuestion("Apa singkatan dari unsur-unsur Gol. 1B (Tembaga, Perak, Emas, dan Roentgenium)?",
//                "Cu, Ag, Au, dan Rg.",
//                "Tb, Pr, Es, dan Rg.",
//                "Co, Ar, Au, dan Rg.",
//                "Cu, Au, Ag, dan Rg",
//                "Cu, Ag, Au, dan Rg.",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q6);
//
//        TriviaQuestion q7 = new TriviaQuestion("Secara berurutan disebut apakah golongan A dan B?",
//                "Golongan Utama dan Golongan Transisi",
//                "Golongan Transisi dan Golongan Utama",
//                "Golongan Utama dan Golongan Halogen",
//                "Golongan Lantanida dan Golongan Aktinida",
//                "Golongan Utama dan Golongan Transisi",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q7);
//
//        TriviaQuestion q8 = new TriviaQuestion("Suatu unsur memiliki konfigurasi elektron [Ne] 3s2 3p5 terletak pada golongan?",
//                "Golongan VII A.",
//                "Golongan VI A.",
//                "Golongan V A.",
//                "Golongan IIV A.",
//                "Golongan VII A.",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q8);

//        TriviaQuestion q9 = new TriviaQuestion("Suatu unsur memiliki konfigurasi elektrin [Ar] 4s2 3d3 terletak pada golongan?",
//                "Golongan V A","Golongan VI B","Golongan VI A",
//                "Golongan V B",
//                "Golongan V B",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q9);
//
//        TriviaQuestion q10 = new TriviaQuestion("Apa salah satu ciri yang dimiliki oleh unsur golongan VIIA/ gol. Halogen?",
//                "6 elektron valensi",
//                "7 elektron valensi",
//                "8 elektron valensi",
//                "9 elektron valensi",
//                "7 elektron valensi",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q10);
//
//        TriviaQuestion q101 = new TriviaQuestion("Apa salah satu ciri yang dimiliki oleh unsur golongan VIIA/ gol. Halogen?",
//                "6 elektron valensi",
//                "7 elektron valensi",
//                "8 elektron valensi",
//                "9 elektron valensi",
//                "7 elektron valensi",
//                TriviaQuestion.CATEGORY_TPU,1);
//        addQuestions(q101);
//
////level 2 TPU
//        TriviaQuestion q11 = new TriviaQuestion("Terdapat berapa periode kah pada Tabel Peridik Modern?",
//                "6 periode",
//                "7 periode",
//                "8 periode",
//                "9 periode",
//                "7 periode",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q11);
//
//        TriviaQuestion q12 = new TriviaQuestion("Unsur dengan konfigurasi elektron 1s2 2s2. Dalam tabel periodik, unsur tersebut berada pada periode?",
//                "Periode 1A",
//                "Periode 2A",
//                "Periode 1B",
//                "Periode 2B",
//                "Periode 2A",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q12);
//
//
//        TriviaQuestion q13 = new TriviaQuestion("Pada periode berapakah unsur 20Z?",
//                        "Periode 1",
//                        "Periode 2",
//                        "Periode 3",
//                        "Periode 4",
//                        "Periode 4",
//                        TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q13);
//
//
//        TriviaQuestion q14 = new TriviaQuestion("Terdapat berapa unsur kah pada periode 2?",
//                "6 unsur",
//                "8 unsur",
//                "7 unsur",
//                "9 unsur",
//                "8 unsur",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q14);
//
//
//        TriviaQuestion q15 = new TriviaQuestion("Terdapat berapa banyak unsur pada periode 6?",
//                "11 unsur",
//                "Browser",
//                "16 unsur",
//                "30 unsur",
//                "30 unsur",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q15);
//
//        TriviaQuestion q16 = new TriviaQuestion("Apa elemen unsur-unsur pada periode 3? ",
//                "Li, Be, B, C, N, O, F, Ne",
//                "B, Al, Ga, In, Tl, Nh",
//                "Na, Mg, Al, Si, P, S, Cl, Ar",
//                "He, Ne, Ar, Kr, Xe, Rn, Og",
//                "Na, Mg, Al, Si, P, S, Cl, Ar",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q16);
//
//        TriviaQuestion q17 = new TriviaQuestion("Pada periode keberapakah terdapat unsur-unsur transisi dalam pada tabel periodik modern?",
//                "Periode 1 & 2",
//                "Periode 2 & 3",
//                "Periode 5 & 6",
//                "Periode 6 & 7",
//                "Periode 6 & 7",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q17);
//
//        TriviaQuestion q18 = new TriviaQuestion("Letak unsur-unsur pada periode yang sama jika memiliki persamaan apa?",
//                "Bilangan Kuantum",
//                "Jumlah Elektron",
//                "Elektron Valensi",
//                "A, B, dan C benar",
//                "Jumlah Elektron",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q18);
//
//        TriviaQuestion q19 = new TriviaQuestion("Pada periode ke berapakah unsur 11X?",
//                "Periode 1",
//                "Periode 2",
//                "Periode 3",
//                "Periode 4 ",
//                "Periode 3",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q19);
//
//        TriviaQuestion q20 = new TriviaQuestion("Secara berurutan pada periode keberapakah ketiga unsur ini 20Ca, 7N, 22Ti, 19K?",
//                "2,4,4,4",
//                "4,2,4,4",
//                "4,4,2,4",
//                "4,4,4,2",
//                "4,2,4,4",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q20);
//
//        TriviaQuestion q202 = new TriviaQuestion("Unsur transisi dalam SPU dimulai dari periode berapa?",
//                "Periode 1",
//                "Periode 2",
//                "Periode 3",
//                "Periode 4",
//                "Periode 4",
//                TriviaQuestion.CATEGORY_TPU,2);
//        addQuestions(q202);
////level 3
//
//        TriviaQuestion q21 = new TriviaQuestion("Unsur transisi (golongan B) disebut sebagai blok apa?",
//                "Blok s",
//                "Blok d",
//                "Blok p",
//                "Blok f",
//                "Blok d",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q21);
//
//        TriviaQuestion q22 = new TriviaQuestion("Blok f disebut sebagai unsur apa?",
//                "Unsur Transisi Dalam",
//                "Unsur Transisi Luar",
//                "Unsur Halogen",
//                "Unsur Gas Mulia",
//                "Unsur Transisi Dalam",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q22);
//
//        TriviaQuestion q23 = new TriviaQuestion("Unsur gol. IIB (30Zn, 48Cd, 80Hg,112Cn) terletak pada blok apa?",
//                "Blok s",
//                "Blok d",
//                "Blok p",
//                "Blok f",
//                "Blok s",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q23);
//
//        TriviaQuestion q24 = new TriviaQuestion("Periode kelima sistem periodik meliputi pengisian subkulit-subkulit secara berurutan adalah?",
//                "5s, 5d, 5p, dan 5f",
//                "5d, 5s, 5p dan 5f",
//                "5s, 5p, dan 5d",
//                "5s,5p,5d, dan 5f",
//                "5s,5p,5d, dan 5f",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q24);
//
//        TriviaQuestion q25 = new TriviaQuestion("Secara berurutan sesuai urutan pengisian konfigurasi elektron setelah blok 5s adalah?",
//                "5f",
//                "5p",
//                "4d",
//                "4f",
//                "4d",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q25);
//
//
//        TriviaQuestion q26 = new TriviaQuestion("Unsur dengan nomor atom 36 terletak pada blok?",
//                "Blok s",
//                "Blok d",
//                "Blok p",
//                "Blok f",
//                "Blok p",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q26);
//
//        TriviaQuestion q27 = new TriviaQuestion("Unsur golongan gas mulia terletak pada blok apa?",
//                "Blok s",
//                "Blok d",
//                "Blok p",
//                "Blok f",
//                "Blok p",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q27);
//
//        TriviaQuestion q28 = new TriviaQuestion("Golongan berapa yang hanya memiliki blok s dan subkulit s?",
//                "Golongan IA dan IIA",
//                "Golongan IIA dan IIIA",
//                "Golongan IA dan IVA",
//                "Golongan IIA dan VA",
//                "Golongan IA dan IIA",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q28);
//
//        TriviaQuestion q29 = new TriviaQuestion("Konfigurasi elektron dari unsur Y adalah 1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p3 6s2 4f5. Unsur ini terletak pada blok apa dan nomor atom berapa?",
//                "Blok f dengan no. atom 57",
//                "Blok f dengan no. atom 58",
//                "Blok f dengan no. atom 56",
//                "Blok f dengan no. atom 55",
//                "Blok f dengan no. atom 58",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q29);
//
//        TriviaQuestion q30 = new TriviaQuestion("Unsur Al terdapat pada blok apa?",
//                "Blok s",
//                "Blok p",
//                "Blok f",
//                "Blok d",
//                "Blok p",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q30);
//
//        TriviaQuestion q303 = new TriviaQuestion("Secara berurutan unsur-unsur ini (39Y, 99Es, 31Ga,55Cs) terdapat pada blok-blok apa saja?",
//                "Blok s,p,d,f",
//                "Blok s,d,p,f",
//                "Blok s,d,f,p",
//                "Blok d,f,p,s",
//                "Blok d,f,p,s",
//                TriviaQuestion.CATEGORY_TPU,3);
//        addQuestions(q303);
//
////level 4
//
//        TriviaQuestion q31 = new TriviaQuestion("Sesuai dengan sifatnya, unsur diklasifikasikan ke dalam kategori besar apa saja?",
//                "Logam, Nonlogam, dan Metaloid",
//                "Metaloid, Gas Mulia, Alkali",
//                "Utama, Transisi, Gas Mulia",
//                "Utama, Lantanida dan Aktinida",
//                "Logam, Nonlogam, dan Metaloid",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q31);
//
//        TriviaQuestion q32 = new TriviaQuestion("Unsur-unsur yang termasuk Logam Alkali adalah ?",
//                "H, Li, Na, K, Rb, Cs, dan Fr",
//                "Li, Na, K, Rb, Cs, dan Fr",
//                "Be, Mg, Ca, Sr, Ba, dan Ra",
//                "C, Si, Ge, Sn, Pb, dan Fl",
//                "Li, Na, K, Rb, Cs, dan Fr",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q32);
//
//        TriviaQuestion q33 = new TriviaQuestion("Unsur-unsur yang termasuk Logam Alkali Tanah adalah?",
//                "H, Li, Na, K, Rb, Cs, dan Fr",
//                "Li, Na, K, Rb, Cs, dan Fr",
//                "Be, Mg, Ca, Sr, Ba, dan Ra",
//                "C, Si, Ge, Sn, Pb, dan Fl",
//                "Be, Mg, Ca, Sr, Ba, dan Ra",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q33);
//
//        TriviaQuestion q34 = new TriviaQuestion("Unsur-unsur yang termasuk non-logam adalah?",
//                "H, C, N, O, P, S, Se.",
//                "He, Ne, Ar, Kr, Xe, Rn.",
//                "N, O, F, Cl, Br, I.",
//                "B, Si, Ge, As, Sb, Te, At.",
//                "H, C, N, O, P, S, Se.",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q34);
//
//
//        TriviaQuestion q35 = new TriviaQuestion("Unsur-unsur He, Ne, Ar, Kr, Xe, Rn termasuk pada kelompok unsur apa?",
//                "Alkali",
//                "Transisi",
//                "Halogen",
//                "Gas Mulia",
//                "Gas Mulia",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q35);
//
//        TriviaQuestion q36 = new TriviaQuestion("Unsur-unsur yang termasuk dalam deret Aktinida adalah ?",
//                "H, C, N, O, P, S, Se.",
//                "Sm, Eu, Gd, Tb, U.",
//                "N, O, F, Cl, Br, I.",
//                "Ac, Th, Pa, U, Np.",
//                "Ac, Th, Pa, U, Np.",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q36);
//
//        TriviaQuestion q37 = new TriviaQuestion("Berapa banyak unsur-unsur yang termasuk dalam kelompok logam transisi?",
//                "9 unsur",
//                "16 unsur",
//                "25 unsur",
//                "29 unsur",
//                "25 unsur",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q37);
//
//        TriviaQuestion q38 = new TriviaQuestion("Unsur-unsur B, Si, Ge, As, Sb, Te termasuk dalam pengelompokkan apa?",
//                "Metaloid",
//                "Aktinida",
//                "Lantanida",
//                "Logam",
//                "Metaloid",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q38);
//
//        TriviaQuestion q39 = new TriviaQuestion("Ada berapa banyakkah unsur-unsur yang tidak diketahui?",
//                "7 unsur",
//                "9 unsur",
//                "10 unsur",
//                "18 unsur",
//                "9 unsur",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q39);
//
//        TriviaQuestion q40 = new TriviaQuestion("Aluminium termasuk dalam pengelompokkan?",
//                "Logam Pascatransisi",
//                "Logam Utama",
//                "Logam Transisi",
//                "Non Logam",
//                "Logam Pascatransisi",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q40);
//
//        TriviaQuestion q404 = new TriviaQuestion("Krom, Kobalt, Nikel dan Emas terasuk dalam penggelompokkan apa?",
//                "Logam Pascatransisi",
//                "Logam Utama",
//                "Logam Transisi",
//                "Non Logam",
//                "Logam Transisi",
//                TriviaQuestion.CATEGORY_TPU,4);
//        addQuestions(q404);
//
//        // SPU
//        TriviaQuestion q41 = new TriviaQuestion("Jari-jari atom adalah jarak dari inti atom hingga...?",
//                "Elektron pada kulit terluar",
//                "Elektron pada kulit pertama",
//                "Elektron pada kulit terdalam",
//                "Elektron pada kulit kedua",
//                "Elektron pada kulit terluar",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q41);
//
//        TriviaQuestion q42 = new TriviaQuestion("Dari keempat pernyataan berikut yang merupakan sifat periodik unsur untuk Jari-jari Atom adalah?",
//                "Dalam satu periode dari kiri ke kanan, jari-jari atom semakin membesar.",
//                "Dalam satu golongan dari atas ke bawah, jari-jari atom semakin mengecil.",
//                "Dalam satu periode dari kiri ke kanan, jari-jari atom semakin mengecil.",
//                "Dalam satu golongan dari bawah ke atas, jari-jari atom semakin membesar.",
//                "Dalam satu periode dari kiri ke kanan, jari-jari atom semakin mengecil.",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q42);
//
//        TriviaQuestion q43 = new TriviaQuestion("Jari-jari atom unsur gol. IIA secara acak dalam satuan angstrom sebesar 1,05; 2,00; 1,80; 2,15; dan 1,50. Data yang merupakan jari-jari atom Barium adalah ...?",
//                "1,50",
//                "1,80",
//                "2,00",
//                "2,15",
//                "2,15",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q43);
//
//        TriviaQuestion q44 = new TriviaQuestion("Secara berurut, unsur A, B, C, D memiliki no. atom 12,15,33, dan 38. Unsur yang mempunyai jari-jari atom paling besar adalah ..?",
//                "A",
//                "B",
//                "C",
//                "D",
//                "D",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q44);
//
//        TriviaQuestion q45 = new TriviaQuestion("Dari Gol IA, unsur apa yang memilki jari-jari atom paling kecil?",
//                "H",
//                "Na",
//                "K",
//                "Rb",
//                "H",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q45);
//
//        TriviaQuestion q46 = new TriviaQuestion("Dari Periode 1, secara berurutan unsur terkecil ke terbesar adalah?",
//                "H, He",
//                "He, H",
//                "H, Ha",
//                "Ha, H",
//                "He, H",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q46);
//
//        TriviaQuestion q47 = new TriviaQuestion("Dari Gol. Gas Mulia, unsur apa yang memiliki jari-jari atom terbesar?",
//                "He",
//                "Ar",
//                "Kr",
//                "Rn",
//                "Rn",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q47);
//
//        TriviaQuestion q48 = new TriviaQuestion("Unsur yang memiliki jari-jari atom paling besar pada periode ketiga adalah natrium. Berikut ini yang tidak benar mengenai atom Na adalah ...?",
//                "Atom Na memiliki nomor atom paling besar.",
//                "Dalam seperiode, dari kiri ke kanan jari-jari atom semakin kecil, maka Na paling besar.",
//                "Dalam seperiode, dari kanan ke kiri jari-jari atom semakin membesar, maka Na paling besar. ",
//                "Atom Na memiliki banyak lapisan orbital yang terisi oleh elektron.",
//                "Atom Na memiliki nomor atom paling besar.",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q48);
//
//        TriviaQuestion q49 = new TriviaQuestion("Dalam kelompok Lantanida, unsur apa yang memiliki jari-jari atom terbesar dan terkecil?",
//                "La dan Lu",
//                "Ac dan Lr",
//                "Sm dan Gd",
//                "Th dan U",
//                "La dan Lu",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q49);
//
//        TriviaQuestion q50 = new TriviaQuestion("Dalam kelompok Aktinida, unsur apa yang memiliki jari-jari atom terbesar?",
//                "Ac",
//                "Th",
//                "Pa",
//                "U",
//                "Ac",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q50);
//
//        TriviaQuestion q505 = new TriviaQuestion("Dalam kelompok Aktinida, unsur apa yang memiliki jari-jari atom terbesar?",
//                "Ac",
//                "Th",
//                "Pa",
//                "U",
//                "Ac",
//                TriviaQuestion.CATEGORY_SPU,1);
//        addQuestions(q505);
//
////level 2
//
//        TriviaQuestion q51 = new TriviaQuestion("Apa yang dimaskud dengan Energi Ionisasi?",
//                "Energi minimum untuk mengion dalam wujud gas.",
//                "Energi minimum untuk mengion dalam wujud cair.",
//                "Energi maksimum untuk mengion dalam wujud cair.",
//                "Energi maksimum untuk mengion dalam wujud gas.",
//                "Energi minimum untuk mengion dalam wujud gas.",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q51);
//
//        TriviaQuestion q52 = new TriviaQuestion("Dari keempat pernyataan berikut yang merupakan sifat periodik unsur untuk Energi Ionisasi adalah?",
//                "Dalam satu periode, dari kanan ke kiri, energi ionisasi semakin besar.",
//                "Dalam satu golongan, dari atas ke bawah, energi ionisasi semakin kecil.",
//                "Dalam satu periode, dari kiri ke kanan, energi ionisasi semakin kecil.",
//                "Dalam satu golongan, dari bawah ke atas, energi ionisasi semakin kecil.",
//                "Dalam satu golongan, dari atas ke bawah, energi ionisasi semakin kecil.",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q52);
//
//        TriviaQuestion q53 = new TriviaQuestion("Unsur dengan no. atom berikut yang memiliki energi ionisasi paling besar adalah ..?",
//                "9",
//                "11","15","19",
//                "9",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q53);
//
//        TriviaQuestion q54 = new TriviaQuestion("Unsur dengan no. atom berikut yang memiliki energi ionisasi terkecil adalah ?",
//                "9",
//                "11","15",
//                "19",
//                "19",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q54);
//
//        TriviaQuestion q55 = new TriviaQuestion("Unsur A, B, C merupakan unsur-unsur dalam satu golongan. Jika energi ionisasi unsur-unsur tersebut berturut-turut 419,403,496. Urutan unsur-unsur tersebut dari atas ke bawah adalah?",
//                "A, B, C","B, A, C",
//                "C, A, B",
//                "B, C, A",
//                "C, A, B",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q55);
//
//        TriviaQuestion q56 = new TriviaQuestion("Perhatikan data energi Ionisasi pertama dari berbagai unsur berikut. P = 1.000 kJ/mol, Q = 738 kJ/mol, R = 786 kJ/mol,S = 1.012 kJ/mol, T = 1.051 kJ/mol Urutan unsur-unsur tersebut dalam satu periode dari kiri ke kanan adalah ?",
//                "P-Q-R-S-T",
//                "T-S-R-Q-P",
//                "Q-R-P-S-T",
//                "S-Q-T-R-P",
//                "Q-R-P-S-T",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q56);
//
//        TriviaQuestion q57 = new TriviaQuestion("Suatu unsur dapat membentuk senyawa ionik dengan rumus X2O3. Data energi ionisasi ke-1 sampai ke-6 (dalam kK/mol) untuk unsur X adalah ... ?",
//                "500, 4.500, 6.910, 9.540, 13.350, 16.610",
//                "577, 1.81, 2.744, 11.576, 14.829, 18.375",
//                "1.400, 2.860, 4.580, 7.480, 9.400, 53.270",
//                " 1.090, 2.350, 4.620, 6.220, 38.830, 47.280",
//                "577, 1.81, 2.744, 11.576, 14.829, 18.375",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q57);
//
//        TriviaQuestion q58 = new TriviaQuestion("Energi ionisasi pertama, kedua, ketiga utk unsur Mg (dalam kJ/mol) adalah...?",
//                "496, 4.560, 6.900",
//                "578, 1.820, 2.750",
//                "736, 1.450, 7.730 ",
//                "786, 1.580, 3.230",
//                "736, 1.450, 7.730 ",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q58);
//
//        TriviaQuestion q59 = new TriviaQuestion("Energi ionisasi terbesar terdapat pada ...?",
//                "Golongan VA",
//                "Golongan VIA",
//                "Golongan VIIA",
//                "Golongan VIIIA",
//                "Golongan VIIIA",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q59);
//
//        TriviaQuestion q60 = new TriviaQuestion("Energi ionisasi terkecil terdapat pada ..?",
//                "Golongan IA dan Periode 1",
//                "Golongan IB dan Periode 5",
//                "Golongan VIIIA dan Periode 7",
//                "Golongan VB dan Periode 1",
//                "Golongan VIIIA dan Periode 7",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q60);
//
//        TriviaQuestion q606 = new TriviaQuestion("Energi ionisasi terkecil terdapat pada ..?",
//                "Golongan IA dan Periode 1",
//                "Golongan IB dan Periode 5",
//                "Golongan VIIIA dan Periode 7",
//                "Golongan VB dan Periode 1",
//                "Golongan VIIIA dan Periode 7",
//                TriviaQuestion.CATEGORY_SPU,2);
//        addQuestions(q606);
//
//
//        //level 3
//
//        TriviaQuestion q61 = new TriviaQuestion("Pada umumnya, suatu unsur yang memiliki keelektronegatifan tinggi, memiliki.. ?",
//                "Afinitas elektron rendah",
//                "Energi ionisasi tinggi",
//                "Jari-jari atom besar",
//                "Nomor atom kecil",
//                "Energi ionisasi tinggi",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q61);
//
//        TriviaQuestion q62 = new TriviaQuestion("Dari keempat pernyataan berikut yang bukan merupakan sifat periodik unsur untuk Keelektronegatifan adalah?",
//                "Dalam satu periode dari kiri ke kanan, keelektronegatifan semakin bertambah.",
//                "Dalam satu golongan dari atas ke bawah, keelektronegatifan semakin bertambah.",
//                "Dalam satu periode dari kanan ke kiri, keelektronegatifan semakin berkurang.",
//                "Dalam satu golongan dari atas ke bawah, keelektrongatifan semakin berkurang.",
//                "Dalam satu golongan dari atas ke bawah, keelektronegatifan semakin bertambah.",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q62);
//
//        TriviaQuestion q63 = new TriviaQuestion("Unsur-unsur yang memiliki keelektronegatifan (dalam skala Pauling) sebesar 3.0-4.0 dibawah ini adalah ?",
//                "N, Cl, O, dan F",
//                "Na, Si, Ca, dan Fl",
//                "B, K, Ca, dan O",
//                "H, Br, Rb, dan Xe",
//                "N, Cl, O, dan F",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q63);
//
//
//        TriviaQuestion q64 = new TriviaQuestion("Secara berurutan keelektronegatifan (dalam skala Pauling) sebesar 2.1, 2.4, 2.2, 2.0 adalah?",
//                "Te, Au, Ru, B",
//                "Ca, Rb, Fr, U",
//                "H, Na, Cl, O",
//                "Xr, Au, Ba, Li",
//                "Te, Au, Ru, B",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q64);
//
//        TriviaQuestion q65 = new TriviaQuestion("Berapakah jarak ukuran keelektronegatifan (dalam skala Pauling) yang dimiliki oleh kelompok Lantanida?",
//                "1.0 – 1.5 ",
//                "1.1 – 1.3",
//                "1.3 – 1.5",
//                "1.2 – 1.4",
//                "1.3 – 1.5",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q65);
//
//        TriviaQuestion q66 = new TriviaQuestion("Berapakah ukuran keelektronegatifan unsur Hidrogen? (dalam skala Pauling)",
//                "2.0",
//                "2.1",
//                "2.2",
//                "2.3",
//                "2.1",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q66);
//
//        TriviaQuestion q67 = new TriviaQuestion("Berapakah jarak ukuran keelektronegatifan (dalam skala Pauling) yang dimiliki oleh kelompok Aktinida?",
//                "1.0 – 1.5 ",
//                "1.1 – 1.3",
//                "1.3 – 1.5",
//                "1.2 – 1.4",
//                "1.3 – 1.5",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q67);
//
//        TriviaQuestion q68 = new TriviaQuestion("Dalam gol. IA terdapat 3 unsur yang memiliki jumlah keelektrogatifan yang sama yaitu 0.8. Ketiga unsur tersebut adalah?",
//                "K, Rb, Cs",
//                "H, Li, He",
//                "He, K, Rb",
//                "Rb, Cs, Fr",
//                "K, Rb, Cs",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q68);
//
//        TriviaQuestion q69 = new TriviaQuestion("Berikut ini yang bukan pasangan Unsur dan Keelektronegatifannya adalah ..?",
//                "Cu – 1.90",
//                "P – 2.10",
//                "Cl – 3.00",
//                "Ca – 0.89",
//                "P – 2.10",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q69);
//
//        TriviaQuestion q70 = new TriviaQuestion("Berikut ini yang bukan pasangan Unsur dan Keelektronegatifannya adalah ..?",
//                "Cu – 1.90",
//                "P – 2.10",
//                "Cl – 3.00",
//                "Ca – 0.89",
//                "P – 2.10",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q70);
//
//
//        TriviaQuestion q707 = new TriviaQuestion("Berikut ini yang bukan pasangan Unsur dan Keelektronegatifannya adalah ..?",
//                "Cu – 1.90",
//                "P – 2.10",
//                "Cl – 3.00",
//                "Ca – 0.89",
//                "P – 2.10",
//                TriviaQuestion.CATEGORY_SPU,3);
//        addQuestions(q707);
//        //level 4
//
//        TriviaQuestion q71 = new TriviaQuestion("Afinitas Elektron adalah besarnya energi yang dihasilkan atau dilepaskan apabila suatu atom menarik sebuah elektron dalam wujud apa?",
//                "Cair",
//                "Padat",
//                "Gas",
//                "Listrik",
//                "Gas",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q71);
//
//        TriviaQuestion q72 = new TriviaQuestion("Dari keempat pernyataan berikut yang bukan merupakan sifat periodik unsur untuk Afinitas Elektron adalah?",
//                "Dalam satu periode kiri ke kanan, afinitas elektron cenderung bertambah",
//                "Dalam satu golongan dari bawah ke atas, afinitas elektron cenderung berkurang.",
//                "Dalam satu periode kanan ke kiri, afinitas elektron cenderung bertambah.",
//                "A dan B benar.",
//                "Dalam satu periode kiri ke kanan, afinitas elektron cenderung bertambah",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q72);
//
//        TriviaQuestion q73 = new TriviaQuestion("Afinitas elektron paling besar terdapat pada golongan ... ?",
//                "Golongan VIA",
//                "Golongan VIIA",
//                "Golongan IB",
//                "Golongan IIIB",
//                "Golongan VIIA",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q73);
//
//        TriviaQuestion q74 = new TriviaQuestion("Berapa besar ukuran afinitas elektron unsur Oksigen ?",
//                "-121",
//                "212",
//                "141",
//                "-141",
//                "-141",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q74);
//
//        TriviaQuestion q75 = new TriviaQuestion("Golongan berapakah pada golongan utama yang memiliki afinitas elektron yang bernilai positif?",
//                "Golongan Gas Mulia",
//                "Golongan Metaloid",
//                "Golongan Halogen",
//                "Golongan Transisi",
//                "Golongan Gas Mulia",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q75);
//
//        TriviaQuestion q76 = new TriviaQuestion("Pada golongan gas mulia, afinitas elektron terendah terdapat pada unsur ...?",
//                "Helium",
//                "Argon",
//                "Neon",
//                "Kripton",
//                "Helium",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q76);
//
//        TriviaQuestion q78 = new TriviaQuestion("Pada Gol. VA, afinitas elektron yang bernilai positif terdapat pada unsur..?",
//                "Bismut",
//                "Arsen",
//                "Fosfor",
//                "Nitrogen",
//                "Nitrogen",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q78);
//
//        TriviaQuestion q79 = new TriviaQuestion("Dalam Gol. IIIA, afinitas elektron yang sama berupa unsur-unsur..?",
//                "B dan Al",
//                "Tl dan Ga",
//                "Al dan In",
//                "Ga dan Tl",
//                "Tl dan Ga",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q79);
//
//        TriviaQuestion q80 = new TriviaQuestion("Dari unsur-unsur 87Fr, 81Tl, 36Kr, 39Y, unsur manakah yang memiliki afinitas elektron terendah?",
//                "36Kr",
//                "39Y",
//                "81Tl",
//                "87Fr",
//                "87Fr",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q80);
//
//        TriviaQuestion q808 = new TriviaQuestion("Dari unsur-unsur 87Fr, 81Tl, 36Kr, 39Y, unsur manakah yang memiliki afinitas elektron terendah?",
//                "36Kr",
//                "39Y",
//                "81Tl",
//                "87Fr",
//                "87Fr",
//                TriviaQuestion.CATEGORY_SPU,4);
//        addQuestions(q808);
    }

    private void addQuestions(TriviaQuestion question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR,question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_CATEGORY,question.getCategory());
        cv.put(QuestionTable.COLUMN_LEVELS_ID,question.getLevels());
        db.insert(QuestionTable.TABLE_NAME,null,cv);

    }

    public ArrayList<TriviaQuestion> getAllQuestions() {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };



            Cursor c = db.query(QuestionTable.TABLE_NAME,
                    Projection,
                    null,
                    null,
                    null,
                    null,
                    null);


            if (c.moveToFirst()) {
                do {

                    TriviaQuestion question = new TriviaQuestion();
                    question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                    question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                    question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                    question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                    question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                    question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));

                    questionList.add(question);

                } while (c.moveToNext());

            }
            c.close();
            return questionList;
        }

    public ArrayList<TriviaQuestion> getQuestionsWithCategory(String Category) {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY
        };

        String selection = QuestionTable.COLUMN_CATEGORY + " = ? ";
        String selectionArgs[] = {Category};


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                TriviaQuestion question = new TriviaQuestion();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;
    }


    public ArrayList<TriviaQuestion> getQuestionsByLevelsAndCategory(String Category, int LevelsID) {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY,
                QuestionTable.COLUMN_LEVELS_ID
        };

        String selection = QuestionTable.COLUMN_LEVELS_ID + " = ? "
                + " AND " + QuestionTable.COLUMN_CATEGORY + " = ? ";

        String selectionArgs[] = new String[] {String.valueOf(LevelsID),Category};


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                TriviaQuestion question = new TriviaQuestion();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));
                question.setLevels(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_LEVELS_ID)));
                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;
    }

}


