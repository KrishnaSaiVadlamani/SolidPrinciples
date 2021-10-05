class VehicleInformation
{
public double vehicleNumber(){

}
}
class Car extends VehicleInformation{
public double vehicleNumber(){
return 0;
}
}
class Car extends Truck{
public double vehicleNumber(){
return 0;
}
}


class OpenClosed{
public static void main(String[] args){
VehicleInformation vi=new VehicleInformation();
Car c=new Car();
vi.vehicleNumber();
c.vehicleNumber();
}
}
