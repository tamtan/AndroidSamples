package mvvm.f4wzy.com.samplelogin.util

import java.util.regex.Pattern

class Util {

//        companion object {
//        fun isEmailValid(email: String): Boolean {
//            val expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
//            val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
//            val matcher = pattern.matcher(email)
//            return matcher.matches()
//        }
//    }


    companion object {
        fun isEmailValid(email: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }
    }


}