public class DevideByZeroException extends Exception {
    float x;
    float y;

    public DevideByZeroException(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "DevideByZeroException{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
