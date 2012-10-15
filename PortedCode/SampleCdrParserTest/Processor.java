package CSVParser;

// ********* THIS CODE IS AUTO PORTED FROM C# TO JAVA USING CODEPORTING.COM TECHNOLOGY *********

import java.util.ArrayList;
import com.codeporting.csharp2java.System.msString;
import com.codeporting.csharp2java.System.Convert;

public class Processor
{
    private static final int SIZE = 441;
    public static String[] processFileData(ArrayList<String[]> CDRs)
    {
        String[] output = new String [SIZE];
        int index = 0;
        String cliNumber = CDRs.get(1)[0].toString();
        int noOfCallsByCaller = 0;
        double callsChargesByCaller = 0;
        double totalCallsCharges = 0;
        int totalNoOfCalls = 0;

        try
        {
            for (int i = 1; i < CDRs.size(); i++)
            {
                totalNoOfCalls++;
                String[] CDR = CDRs.get(i);
                if (msString.equals(cliNumber, Convert.toString(CDR[0])))
                {
                    callsChargesByCaller += Convert.toDouble(CDR[5]) * Convert.toDouble(CDR[6]);
                    noOfCallsByCaller++;
                }
                else
                {
                    output[index++] = com.codeporting.csharp2java.System.msString.concat("Total amount of call charges for ",  cliNumber,  " are :",  Convert.toString(callsChargesByCaller));
                    cliNumber = CDRs.get(i)[0].toString();
                    noOfCallsByCaller = 1;
                    callsChargesByCaller = 0;
                    callsChargesByCaller += Convert.toDouble(CDR[5]) * Convert.toDouble(CDR[6]);
                }
                totalCallsCharges += callsChargesByCaller;
            }
            output[index++] = com.codeporting.csharp2java.System.msString.concat("Total No of Calls:",  Convert.toString(totalNoOfCalls));
            output[index++] = com.codeporting.csharp2java.System.msString.concat("Grand total of call charges in entire CDR file:",  Convert.toString(totalCallsCharges));
        }
        catch (RuntimeException ex) 
        {
            throw ex;
        }
        return output;
    }
}

