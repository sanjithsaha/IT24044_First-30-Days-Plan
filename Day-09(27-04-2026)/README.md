# Example-1
```java
import java.util.LinkedList;

 class TaskManager {
    private LinkedList <String> tasks;
    public TaskManager(){
        tasks= new LinkedList<>();
    }

    public void addTask(String task)
    {
        tasks.add(task);
    }
    public void completeTask(){
        if(!tasks.isEmpty()){
            String completedTask=tasks.removeFirst();
            System.out.println("Completed Task: "+completedTask);
        }else{
            System.out.println("No tasks to complete");
        }
    }
    public void displayTasks()
    {
    System.out.println("Current Tasks: ");
        for(String task: tasks)
        {
            System.out.println(task);
        }
    }


}
public class Example1 {
public static  void main(String[] args){
    TaskManager manager=new TaskManager();
    manager.addTask("Finish report");
    manager.addTask("Email client");
    manager.displayTasks();
}
}
```
# Example-2
```java
import java.io.*;

public class Example2 {
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("output.txt");
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();;
            bufferedWriter.write("This is a Java file handling example");
            bufferedWriter.close();
            System.out.println("Data written to file successfully.");
        }catch(IOException e){
            System.out.println("An error occured: "+e.getMessage());
        }

        try {
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader= new BufferedReader(reader);
            String line;
            while((line =bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
```
