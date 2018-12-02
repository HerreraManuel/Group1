package Metrics;

//Safety measures for null/empty strings
public class MetricsException extends Exception{

    public MetricsException() {}

    public MetricsException(String exceptionMsg){
        super(exceptionMsg);
    }
}
