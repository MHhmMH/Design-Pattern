
// Java program to demonstrate factory method design pattern 

import java.*;
// Library classes 
class Vehicle 
{  
    abstract void printVehicle() {};
    static Vehicle* Create(VehicleType type); 
}; 
class TwoWheeler extends Vehicle 
{ 
    public void printVehicle() 
    { 
        System.Out.printlin("I am two wheeler");
    } 
}; 
class ThreeWheeler : public Vehicle 
{ 
public void printVehicle() 
    { 
        System.Out.printlin("I am Three wheeler");
    } 
}; 
class FourWheeler : public Vehicle 
{ 
    public void printVehicle() 
    { 
        System.Out.printlin("I am Four wheeler");
    } 
}; 
  
// Factory method to create objects of different types. 
// Change is required only in this function to create a new object type 
Vehicle* Vehicle::Create(VehicleType type) 
{ 
    if (type == VT_TwoWheeler) 
        return new TwoWheeler(); 
    else if (type == VT_ThreeWheeler) 
        return new ThreeWheeler(); 
    else if (type == VT_FourWheeler) 
        return new FourWheeler(); 
    else return NULL; 
} 
  
// Client class 
class Client 
{ 
public: 
  
    // Client doesn't explicitly create objects 
    // but passes type to factory method "Create()" 
    Client() 
    { 
        VehicleType type = VT_ThreeWheeler; 
        pVehicle = Vehicle::Create(type); 
    } 
    ~Client() { 
        if (pVehicle) { 
            delete[] pVehicle; 
            pVehicle = NULL; 
        } 
    } 
    Vehicle* getVehicle()  { 
        return pVehicle; 
    } 
  
private: 
    Vehicle *pVehicle; 
}; 
  
// Driver program 
int main() { 
    Client *pClient = new Client(); 
    Vehicle * pVehicle = pClient->getVehicle(); 
    pVehicle->printVehicle(); 
    return 0; 
}