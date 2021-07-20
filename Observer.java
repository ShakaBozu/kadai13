abstract class Subject{
    public ArrayList<Observer>observer;

    Subject(){
        observer = new ArrayList<Observer>();
    }
    public void attach(Observer o){
        observer.add(o);
    }
    public void tsuuchi(){
        for(Observer observer:observer){
            observer.update(this){
            }        
        }
    }
}