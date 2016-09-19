package cpcx.ufms.samara.cardapio.model;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by samy on 18/09/2016.
 */

    @Database(name = Dbutil.NAME, version = Dbutil.VERSION)
    public class Dbutil {

        public static final String NAME = "AppDatabase"; // we will add the .db extension

        public static final int VERSION = 1;

}
