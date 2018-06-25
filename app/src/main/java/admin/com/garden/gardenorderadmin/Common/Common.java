package admin.com.garden.gardenorderadmin.Common;

import admin.com.garden.gardenorderadmin.Model.Request;
import admin.com.garden.gardenorderadmin.Model.User;
import admin.com.garden.gardenorderadmin.Remote.APIService;
import admin.com.garden.gardenorderadmin.Remote.RetrofitClient;

/**
 * Created by Faggot on 11/3/2017.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;


    public static final String UPDATE = "Izmjena statusa/stavke";
    public static final String DELETE = "Izbriši";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code) {
        if (code.equals("0"))
            return "Narudžba primljena";
        else if (code.equals("1"))
            return "Narudžba prihvaćena";
        else
            return "Isporučeno";
    }

    public static final String fcmUrl = "https://fcm.googleapis.com";

    public static APIService getFCMClient(){
        return RetrofitClient.getClient(fcmUrl).create(APIService.class);
    }

}
