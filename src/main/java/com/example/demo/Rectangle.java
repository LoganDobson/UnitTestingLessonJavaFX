package com.example.demo;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0)
            throw new IllegalArgumentException("height must be above 0");
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0)
            throw new IllegalArgumentException("width must be above 0");
        else
            this.width = width;
    }


    public boolean isSquare(){
        if(width == height){
            return true;
        }
        else
            return false;
    }

    public double getArea(){
        return width * height;
    }
}
