package Metrics;

//Safety measures for null/empty strings
public class MetricsException extends Exception{

    public MetricsException() {}

    public MetricsException(String exceptionMsg){
        super(exceptionMsg);
    }

    public MetricsException(Throwable cause) {
        super(cause);
    }

    public MetricsException(String exceptionMsg, Throwable cause){

    }
}
