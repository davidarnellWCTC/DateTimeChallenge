
package datetimechallenge;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author darnell
 */
public class DateTimeChallenge {

    /**
     * DateTimeChallenge in class challenge
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int addDays = 20;
        
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().plusDays(addDays);
        
        //int difference = getDifferenceInSeconds(time1, time2);
        int difference = getDifferenceInSeconds(time1, time2);
        
        System.out.println(difference);
        
    }
    
    
    public int getDifferenceInSeconds(LocalDateTime time1, LocalDateTime time2){
        int seconds = 0;
        
        //seconds = (time2.getTime() - time1.getTime())/1000;
        Duration diff = Duration.between(time2, time1);
        seconds = (int) (diff.toMillis()*1000);
        
        return seconds;
        
    }
    
    
}
