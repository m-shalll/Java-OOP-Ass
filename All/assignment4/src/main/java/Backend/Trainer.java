/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Admin
 */
public class Trainer implements Type{
    private String trainerId;
    private String name;
    private String email;
    private String specialty;
    private String phoneNumber;

    public Trainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String lineRepresentation()
    {
        return this.trainerId + "," + this.name + "," + this.email + "," + this.specialty + "," + this.phoneNumber;
    }
    
    @Override
    public String getSearchKey()
    { 
        return this.trainerId;
    }
}
