/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author DELL
 */
public class Rumus2 {
    double volume ( double r,double t,double pi ){
                return (pi*r*r*t)/3;
    }
    double s ( double r,double t ){
                return Math.sqrt(r*r + t*t);
    }
    double luasper ( double r,double pi,double s ){
                return pi*r*(r+s);
    }
}
