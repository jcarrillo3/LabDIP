/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;


/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author Juan Carrillo 
 */
//I made the super class abstract because many kinds of
//employees can earn a yearly bonus.
public interface Employee {

    public abstract double getAnnualWages();

}