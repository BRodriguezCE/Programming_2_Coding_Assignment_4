package analyze;

import app.ExecutionInfo;
import java.util.ArrayList;

public class DataAnalyzer {
    
    private ArrayList<ExecutionInfo> data; 

    public DataAnalyzer() {
        
        data = new ArrayList<>();
    }

    public ArrayList<ExecutionInfo> getData() {
        return data;
    }
    
    public void findGrowthRate(){
          System.out.println("");
          
         System.out.println("-------------------------------------------------");
         System.out.println("Data Analyzer Growth Rate");
         System.out.println("-------------------------------------------------");
         
         // your output format must match mine
         // look at the video for see the out format
         // the exponent value is e^x = total method class   
         // you need to find the x... do not overthink it use the Math class
         // YOU PUT YOUR CODE HERE

        for (ExecutionInfo e : data){
            //System.out.printf("%-5s %-5d %-5s %-10d %-5s %-10d %-5s %-10.3f\n", "Index: ", e.getFibIndex(), "FibValue: ", e.getFibValue(), "Calls: ", (int)e.getTotalMethodCalls(), "Exponent: ", Math.log(e.getTotalMethodCalls()));
            System.out.printf("%-5s %-5d", "Index: ", e.getFibIndex());
            System.out.printf("%-5s %-10d", "FibValue: ", e.getFibValue());
            System.out.printf("%-5s %-10d", "Calls: ", (int)e.getTotalMethodCalls());
            System.out.printf("%-5s %-10.3f\n", "Exponent: ", Math.log(e.getTotalMethodCalls()));
        }

    }
    
}// end class
