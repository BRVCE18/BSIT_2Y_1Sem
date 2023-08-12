public class Arithmetic {
     
    private double X;
    private double Y;
        
    public double sum() {
        return X + Y;
    }
    
    public double difference() {
        return X - Y;
    }
    
    public double product() {
        return X * Y;
    }
    
    public double quotient() {
        return X / Y;   
    }
    
    Arithmetic (double X1, double Y1) {
    X = X1; Y = Y1;}
}