public class Droid{

  int batteryLevel;
  String name;
  
  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
    
  }

  public String toString(){
    return "Hello, I’m the droid:" + name; 
  }

  public void performTask(String task){
    batteryLevel = batteryLevel - 10;
    System.out.println(name + "is performing task: " + task);

  }

  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.performTask("talking");



  }

  
}