package Metrics;

//Safety measures for null/empty strings
public class MetricsException extends Exception{

    public MetricsException(String exceptionMsg){
        System.out.println("null or empty string");
    }
}
