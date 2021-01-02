package lesson9_object.ex006_class_object_hash_code_overriden;

public class Car {
    private boolean booleanValue = true;
    private char charValue = 'd';
    private String stringValue = "Opana";
    private long longValue = 12341234L;
    private float floatValue = 1234123.21F;
    private double doubleValue = 9898983.34;
    private byte[] arrayValue = {1, 3, 35, 5};

    public Car(String stringValue, long longValue, float floatValue){
        this.stringValue = stringValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
    }

    @Override
    public int hashCode(){
        int result = 17;

        result = 37 * result + (booleanValue ? 1 : 0);
        result = 37 * result + (int) charValue;
        result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
        result = 37 * result + (int) (longValue ^ (longValue >>> 32));
        result = 37 * result + Float.floatToIntBits(floatValue);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : arrayValue){
            result = 37 * result + (int) b;
        }
        return result;
    }
}
