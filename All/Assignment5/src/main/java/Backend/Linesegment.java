/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author malak
 */
public class Linesegment implements Shape{
    private Point position;
    private Color color;
    private Color fillColor;
    private HashMap<String,Double> properties;    

    public Linesegment() {
        this.properties = new HashMap<>();
    }
    
    
    

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties.put("length",properties.get("length"));
    }

    @Override
    public HashMap<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color color) {
       fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        int length = (int) Math.round(getProperties().get("length"));
        canvas.drawLine(getPosition().x, getPosition().y, getPosition().x + length, getPosition().y + length);
        
    }
    
    
}
