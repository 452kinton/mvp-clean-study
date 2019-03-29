package com.gdut.kintonliu.cleanmvpbykt.data.source;



public class Repository {
    private static Repository INSTANCE;

    private Repository(){
    }

    public static Repository getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Repository();
        return INSTANCE;
    }

    /*public Observable<ResponseEntity> getUser(String loginAccount, String loginPsw) {
        return null;
    }*/

}
