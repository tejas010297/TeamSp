package com.example.tejaspatel.teamsp;

/**
 * Created by Tejas Patel on 24-Jul-17.
 */

public class ListInfo {
    private String imgURL;
    private String userName;
    private String gameName;

    public ListInfo(String imgURL,String userName,String gameName){
        this.imgURL=imgURL;
        this.userName=userName;
        this.gameName=gameName;
    }
    public String getImgURL(){
        return imgURL;
    }
    public String getUserName(){
        return userName;
    }
    public String getGameName(){
        return gameName;
    }
}
