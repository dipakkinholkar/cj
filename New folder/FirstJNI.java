public class FirstJNI { 

static {
System.loadLibrary("first");
}

private native void runOnNative();

public static void main(String[] args) {
new FirstJNI().runOnNative();
}
}