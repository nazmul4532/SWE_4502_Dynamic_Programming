package org.example.Factories;
import org.example.Objects.Engine.*;
import org.example.Objects.Turbochargers.*;


public class CarBehaviorFactory {
    public static TurbochargerBehavior getTurbocharger(String name){
        if(name.equals("Alpine")||name.equals("1")){
            return new Alpine();
        }
        else if (name.equals("Cummins")||name.equals("2")){
            return new Cummins();
        }
        else if (name.equals("Honeywell")||name.equals("3")){
            return new Honeywell();
        }
        else{
            return null;
        }
    }
    public static EngineBehavior getEngine(String name){
        if(name.equals("v6")||name.equals("1")){
            return new v6Engine();
        }
        else if (name.equals("v8")||name.equals("2")){
            return new v8Engine();
        }
        else if (name.equals("v12")||name.equals("3")){
            return new v12Engine();
        }
        else{
            return null;
        }
    }
}
