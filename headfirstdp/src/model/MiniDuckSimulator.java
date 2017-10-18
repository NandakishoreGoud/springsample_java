package model;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck model = new ModelDuck();
    /*Duck mallard = new MallardDuck();
	mallard.performFly();
	mallard.performQucak();
	model.performFly();*/
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.swim();

    }


}
