package CSVParser;

// ********* THIS CODE IS AUTO PORTED FROM C# TO JAVA USING CODEPORTING.COM TECHNOLOGY *********

import com.codeporting.csharp2java.System.DateTime;
import java.util.ArrayList;
import com.codeporting.csharp2java.System.TimeSpan;
import com.codeporting.csharp2java.System.IO.File;


class Program
{
    public static void main(String[] args) 
    {
        try
        {
            DateTime stTime = DateTime.getNow().Clone();
            ArrayList<String[]> fileData = Parser.parseCSV("E:\\temp\\sample-cdr.csv");
            String[] output = Processor.processFileData(fileData);
            DateTime etTime = DateTime.getNow().Clone();
            TimeSpan elapsed = DateTime.subtract(etTime,stTime).Clone();
            output[output.length - 1] = com.codeporting.csharp2java.System.msString.concat("Elapsed Time : ",  elapsed.toString());
            File.writeAllLines("E:\\temp\\cdr_summary.txt", output);
        }
        catch (RuntimeException ex) 
        {
            ex.getStackTrace().toString();
        }

    }
   
   
}

