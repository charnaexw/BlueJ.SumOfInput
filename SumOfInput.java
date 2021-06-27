/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (the date and year)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer output;
    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        int sum=0;
        
    }
    
    public Integer oneToNumber(Integer numberToSum){
        int numberToSum1=0;
        for(int i=1; i<= numberToSum; i++){
        numberToSum1 = numberToSum1 +i; 
        }
        return numberToSum1;
    }

}
