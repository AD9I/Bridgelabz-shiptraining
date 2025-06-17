//  Write a program to generate a six-digit OTP number using the Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same Hint => 1. Write a method to generate a 6-digit OTP number using Math.random() 2. Create an array to save the OTP numbers generated 10 times 3. Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
//         double sum = 0;
//         for (int factor : factors) {
//             sum += factor;
//         }
//         return sum / factors.length;
//     }        
import java.util.*;

public class Q25_OTPNUMBER {
    private static final int OTP_LENGTH = 6;
    private static final int OTP_COUNT = 10;

    public static void main(String[] args) {
        HashSet<String> uniqueOTPs = new HashSet<>();
        while (uniqueOTPs.size() < OTP_COUNT) {
            String otp = generateOTP();
            uniqueOTPs.add(otp);
        }
        System.out.println("Generated unique OTPs: " + uniqueOTPs);
    }

    private static String generateOTP() {
        int otp = (int) (Math.random() * 1000000);
        return String.format("%06d", otp);
    }

    private static boolean areOTPUnique(String[] otps) {
        HashSet<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}