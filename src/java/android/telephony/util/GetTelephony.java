package android.telephony.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetTelephony {

    public static String getProp(){
        Process process;
        Runtime runtime = Runtime.getRuntime();
        String telephony = new String("OTHER");
        try{
            String cmd = "/system/bin/getprop jolla.telephony";

            process = runtime.exec(cmd);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while((line = br.readLine()) != null) {
                telephony = line;
            }
        } catch (Exception e) {
        }
        return telephony;
    }
}
