
public class Clock {

    public static void main(String[] args) {
        int nowSeconds = getSeconds(18, 32, 47);
        System.out.println(nowSeconds);

    }

    public static int getSeconds(int hour, int minutes, int seconds) {
        int nowSeconds = hour * 60 * 60;
        nowSeconds +=  minutes * 60;
        nowSeconds += seconds;
        return nowSeconds;
    }

}
