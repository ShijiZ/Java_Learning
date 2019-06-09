public class HelperService {

    private String formatNumber(int value1){
        return String.format("%d",value1);
    }

    private String formatNumber(double value2){
        return String.format("%.3f",value2);
    }

    private String formatNumber(String value3){
        return String.format("%.2f",Double.parseDouble(value3));
    }

    public static void main(String[] args){
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("200"));
    }
}
