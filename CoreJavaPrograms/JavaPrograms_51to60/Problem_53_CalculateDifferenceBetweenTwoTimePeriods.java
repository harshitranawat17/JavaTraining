package JavaPrograms_51to60;

public class Problem_53_CalculateDifferenceBetweenTwoTimePeriods {
	
	int seconds;
    int minutes;
    int hours;

    public Problem_53_CalculateDifferenceBetweenTwoTimePeriods(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public static Problem_53_CalculateDifferenceBetweenTwoTimePeriods difference(Problem_53_CalculateDifferenceBetweenTwoTimePeriods start, Problem_53_CalculateDifferenceBetweenTwoTimePeriods stop)
    {
    	Problem_53_CalculateDifferenceBetweenTwoTimePeriods diff = new Problem_53_CalculateDifferenceBetweenTwoTimePeriods(0, 0, 0);

        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

        return(diff);
    }

    public static void main(String[] args) {

    	Problem_53_CalculateDifferenceBetweenTwoTimePeriods start = new Problem_53_CalculateDifferenceBetweenTwoTimePeriods(8, 12, 15);
    	Problem_53_CalculateDifferenceBetweenTwoTimePeriods stop = new Problem_53_CalculateDifferenceBetweenTwoTimePeriods(12, 34, 55);
    	Problem_53_CalculateDifferenceBetweenTwoTimePeriods diff;

        diff = difference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }

    
}
