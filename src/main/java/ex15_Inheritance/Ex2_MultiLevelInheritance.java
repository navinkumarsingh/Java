package ex15_Inheritance;

class Device {
    void powerOn() {
        System.out.println("Device is powered on..");
    }
}

class Mobile extends Device {
    void call() {
        System.out.println("Calling from Mobile..");
    }
}

class SmartPhone extends Mobile {
    void browse() {
        System.out.println("Browsing Internet on smart phone..");
    }
}

public class Ex2_MultiLevelInheritance {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn(); //Device
        phone.call();    //Mobile
        phone.browse();  //smartPhone

    }
}
