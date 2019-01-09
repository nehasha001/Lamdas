package Lamdas;

public class VehicleCarExample {
    public static void main(String[] args){
        /*VehicleExample veh = new VehicleExample(){
        @Override
                public String getname() {
            return "S";
        }};}};*/
        VehicleExample veh1 =() -> "Mercedes";
        System.out.println(veh1.getname());
        veh1.getname();
        System.out.println(VehicleExample.getcolor());
        veh1.getname();
        /*System.out.println(VehicleExample.getmileage);*/}}
