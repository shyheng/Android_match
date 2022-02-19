package com.example.ui1.tool;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetAIP {

    class U{
        public U(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public String username;
        public String password;
    }
    class Token{
        public String token;
    }
    class MSG{
        public String msg;
    }
    @POST("/prod-api/api/login")
    Call<Token> token(@Body U u);

    class Rot{
        public List<RowsBean> rows;
        public static class RowsBean {
            public String advImg;
        }
    }

    @GET("/prod-api/api/rotation/list")
    Call<Rot> rot(@Query("type")String type);

}
