/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class Rectangle implements Shape {
    Map properties;
    private double x;
    private double y;
    private double length;
    private double width;
    private Color color;
    private Color fillColor;
    private Point position;
    public Rectangle(){
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
        this.length=properties.get("length");
        this.width=properties.get("width");
        this.x=properties.get("x");
        this.y=properties.get("y");
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
        canvas.drawRect((int)this.x, (int)this.y,(int) this.length, (int)this.width);
        
    }
}
