package model;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() {	
		
	}
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	public void performQucak() {
		quackBehaviour.quack();
	}
	public void swim() {
		System.out.println("ALL Ducks swim	");
	}
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
