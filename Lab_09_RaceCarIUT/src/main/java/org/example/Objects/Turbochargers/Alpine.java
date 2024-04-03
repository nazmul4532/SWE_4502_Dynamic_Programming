package org.example.Objects.Turbochargers;

public class Alpine implements TurbochargerBehavior {
   private String name;
   public Alpine() {
       this.name = "Alpine";
       System.out.println("Adding Alpine Turbocharger");
   }
   public String getName() {
       return this.name;
   }
}
