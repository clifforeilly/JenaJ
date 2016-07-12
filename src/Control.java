import edu.stanford.nlp.time.SUTime;
import org.apache.jena.atlas.lib.ProgressMonitor;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cliff on 12/07/2016.
 */


public class Control {


    static String OutputFolder;
    static String NowD;
    static String inputFileLoc;

    public static void main (String[] args){

        try
        {
            System.out.println("starting Control");

            OutputFolder = "D:\\LaRheto\\Outputs";
            System.out.println("... OutputFolder=" + OutputFolder);

            NowD = GetNow();
            System.out.println("... Hash=" + NowD);

            inputFileLoc = "D:\\LaRheto\\Inputs\\english-kjv.txt";
            System.out.println("... FileLoc=" + inputFileLoc);


            Parse parse = new Parse(OutputFolder, NowD);
            System.out.println("... running Parse");
            parse.run(inputFileLoc);




            System.out.println("ending Control");
        }
        catch (Exception ee)
        {
            ee.printStackTrace();
        }
    }


    public static String GetNow()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String n = sdf.format(new Date());
        return n;
    }

}
