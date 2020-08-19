package main.java;

public class Task {
    String name;
    boolean isDone;

    public Task(String name){
        this.name = name;
        this.isDone = false;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    @Override
    public String toString(){

        String isDoneSymbol;

        if(isDone){
            isDoneSymbol= "\u2713";
        }else{
            isDoneSymbol= "\u2718";
        }

        return "[" + isDoneSymbol + "] " + name;

    }
}
