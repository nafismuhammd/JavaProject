/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvehiclel;

/**
 *
 * @author MNafis
 */
public class TestVehiclel{
public static void main(String[] args){
System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
Vehicle vehicle = new Vehicle();
//Vehicle1 vehicle2 = new Vehicle1(1000);
System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
System.out.println("Vehicle load is " +vehicle.getLoad() + "kg");
}
}