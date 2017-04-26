package com.firman.webservicevolley;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Firman on 4/7/2017.
 */

public class ItemObject {
    public class ObjectBelajar {
        @SerializedName("belajar")
        public List<Results> belajar;

        public class Results {
            @SerializedName("id")
            public String id;

            @SerializedName("name")
            public String name;

            @SerializedName("office")
            public String office;

            @SerializedName("email")
            public String email;
        }
    }
}
