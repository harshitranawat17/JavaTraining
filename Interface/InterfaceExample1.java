/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;


class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}
public class InterfaceExample1 
{

    public static void main(String[] args) 
    {
        //object of smartphone with reference to Music
        IMusicPlayer ip=new SmartPhone();
        ip.play();
        ip.stop();
        //object of smartphone with reference to camera
        ICamera cm = new SmartPhone();
        cm.click();
        cm.record();
        
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.videoCall();
     
        
        
       
 
        
    }
    
}