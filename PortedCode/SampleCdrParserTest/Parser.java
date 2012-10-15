package CSVParser;

// ********* THIS CODE IS AUTO PORTED FROM C# TO JAVA USING CODEPORTING.COM TECHNOLOGY *********

import java.util.ArrayList;
import com.codeporting.csharp2java.System.IO.StreamReader;
import com.codeporting.csharp2java.System.msString;
import com.codeporting.csharp2java.System.IO.IOException;


   public class Parser
{
    private String csOne;

    public static ArrayList<String[]> parseCSV(String path)
    {
        ArrayList<String[]> CDRs = new ArrayList<String[]>();

        try
        {


            StreamReader readFile = new StreamReader(path);
            String line;
            String[] row;
            while ((line = readFile.readLine()) != null)
            {
                row = msString.split(line, ',');
                CDRs.add(row);
            }
        }

        catch (IOException  io) 
        {
           
            io.getStackTrace().toString();
        }
        
        return CDRs;
    }
}

