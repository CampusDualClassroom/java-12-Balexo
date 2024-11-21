package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer=0;
    public int tachometer=0;
    public String gear= "N";
    public boolean reverse = false;
    public int wheelsAngle=0;
    public boolean isOn=false;

    public Car(){
        this.brand = "Default";
        this.model = "Default";
        this.fuel = "Gasolina";
    }

    public Car(String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public boolean isTachometerGreaterThanZero() {
        return  this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
      return this.tachometer == 0;
    }

    public void start(){
        if(this.isOn){
            System.out.println("El coche ya está encendido");

        }if(isTachometerEqualToZero()){
            this.tachometer=1000;
            this.isOn=true;
            System.out.println("Vehículo encendido");

        }

    }

    public void stop(){
        if(this.speedometer>0){
            System.out.println("No se puede apagar el vehículo");
            return;
        }
        this.tachometer=0;
        this.isOn= false;
        System.out.println("Vehiculo apagado");
    }

    public void accelerate(){
        if(!this.isOn){
           System.out.println("No se puede arrancar con el coche apagado");
           return;
        }
        if(this.speedometer<MAX_SPEED){
            this.speedometer+=20;
            System.out.println("Velocidad del vehículo es " + this.speedometer);
        }if(this.speedometer==MAX_SPEED){
            this.speedometer=120;
        }
        else{
            System.out.println("Máxima velocidad es " + this.speedometer);
        }
    }

    public void brake(){
        if(this.speedometer>0){
            this.speedometer-=20;
            System.out.println("La velocidad es" + this.speedometer);
        if(this.speedometer==0){
            this.speedometer=0;
        }
        }else{
            System.out.println("El vehículo ya está detenido");
        }
    }

    public void turnAngleOfWheels(int angle){
       if(this.wheelsAngle + angle<-45){
           this.wheelsAngle= -45;
       }
       else if(this.wheelsAngle + angle>45){
            this.wheelsAngle=45;
        }else{
            this.wheelsAngle += angle;
        }
       System.out.println("Ángulo del volante" + this.wheelsAngle);
    }

    public void setReverse(boolean reverse){
        if(this.speedometer>0){
            System.out.println("Debes parar el coche primero");
            return;
        }
        this.reverse=reverse;
        this.gear= reverse ? "R" : "N";
        System.out.println(reverse ? "Marcha atrás" : "Marcha adelante");
        }


    }
