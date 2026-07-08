class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin;
        double Fahrenheit;
        kelvin=celsius+273.15;
        Fahrenheit=celsius*1.80+32.00;
        return new double[]{kelvin,Fahrenheit};
    }
}