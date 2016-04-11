package im.delight.android.ddp;

/**
 * Created by Rohan on 11/04/16.
 */
public interface NetworkMonitorListener extends Listener{
    void onInternetStatusChanged(boolean hasNetwork);
}
