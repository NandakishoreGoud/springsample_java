package model;

public class ModelDuck extends Duck{
public ModelDuck() {
	flyBehaviour = new FlyNoWay();
	quackBehaviour = new Quack();
}
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
