package Bai4_1;

public class Cylinder {

        private double height;

        public Cylinder(){
            super();
            height = 1.0;
        }
        public Cylinder(double radius,double height){
            super(radius);
            this.height=height;
        }
        public double getHeight(){
            return height;
        }
        public double getVoluem(){
            return getArea()*height;
        }
}
