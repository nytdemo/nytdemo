package nytimes.siddarth.com.nytimes.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;



public class NetworkUtils {

    private NetworkUtils(){

    }


    public static boolean isInternetAvailable(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnected();

    }
}
