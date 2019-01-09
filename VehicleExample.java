package Lamdas;
@FunctionalInterface
interface VehicleExample {


    String getname();
    static String getcolor(){
    return "blue";
}
    default String getmileage() {
    return "Good";
}
}
