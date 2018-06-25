package admin.com.garden.gardenorderadmin.Model;

import java.util.List;

/**
 * Created by Faggot on 11/26/2017.
 */

public class MyResponse {
    public long multicast_id;
    public int success;
    public int failure;
    public int canonical_ids;
    public List<Result> results;
}
