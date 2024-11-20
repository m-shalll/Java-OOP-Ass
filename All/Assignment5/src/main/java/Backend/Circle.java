/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class Circle implements Shape {
    private Map<String, Double> properties = new HashMap<>();
    private double x;
    private double y;
    private double radius;
    private Color color;
    private Color fillColor;
    private Point position;
    public Circle(){
    this.color=Color.RED;
    this.fillColor=Color.RED;
    }
    @Override
    public void setPosition(Point position){
        this.position = position;
    }
    @Override
    public Point getPosition(){
        return(this.position);
    }
    @Override
    public void setProperties(Map<String, Double> properties){
        this.radius=properties.get("radius");
        this.x=properties.get("x");
        this.y=properties.get("y");
        this.properties.put("radius", this.radius);
        this.properties.put("x", this.x);
        this.properties.put("y", this.y);
    }
    @Override
    public Map<String, Double> getProperties(){
        return this.properties;
    }
    @Override   
    public void setColor(Color color){
        this.color=color;
    }
    @Override
    public Color getColor(){
        return(this.color);
    }
    @Override
    public void setFillColor(Color color){
        this.fillColor=color;
    }
    @Override
    public Color getFillColor(){
        return this.fillColor;
    }
    @Override
    public void draw(java.awt.Graphics canvas){
        canvas.setColor(getFillColor());
        canvas.drawOval((int)this.x, (int)this.y,(int) this.radius*2, (int)this.radius*2);  
    }
}
