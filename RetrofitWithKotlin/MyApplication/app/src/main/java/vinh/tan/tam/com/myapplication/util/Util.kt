package vinh.tan.tam.com.myapplication.util

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object Util {

    fun getIMEI(context: Activity): String? {
        var result: String? = null
        try {
            if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(context, android.Manifest.permission.READ_PHONE_STATE)) {
                } else {
                    ActivityCompat.requestPermissions(context, arrayOf(android.Manifest.permission.READ_PHONE_STATE), 2)
                }
            } else if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                val tm = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
                result = tm.imei
                if (result != null) {
                    Toast.makeText(context, "IMEI number " + result, Toast.LENGTH_SHORT).show()
                }
                //---get the SIM card ID---
                result = tm.simSerialNumber
                if (result != null)
                    Toast.makeText(context, "SIM card ID: " + result,
                            Toast.LENGTH_LONG).show()
            }
        } catch (ex: Exception) {
            Log.e("exception", ex.message)
        }
        return result
    }
}