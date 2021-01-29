
    public class Car {
        String name;
        int maxSpeed;
        int model;

        public Car(){

        }
        public Car (String name, int maxSpeed, int model){
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.model = model;

        }

        void drive(){
            System.out.println("The " +name+ " has " +maxSpeed+ " kph was made in " + model);
        }

    }

