class Vehicle {
    int velocity;
    String model;

    void setVelocity(int velocity){
        if (velocity > 100) System.out.println("Speed limit exceeded. Cannot set velocity above 100.");
        else this.velocity = velocity;
    }

    void setModel(String model){
        this.model = model;
    }

    int getVelocity(){
        return this.velocity;
    }

    String getModel(){
        return this.model;
    }
}

class Demo {
    public static void main(String[] args) {
        Vehicle sedan = new Vehicle();
        sedan.setModel("Sedan");
        sedan.setVelocity(85);
        System.out.println("Vehicle Model: " + sedan.getModel());
        System.out.println("Vehicle Velocity: " + sedan.getVelocity());
    }
}