package ma.ensa.app;

import ma.ensa.baseTrain.BaseTrain;
import ma.ensa.baseTrain.TrainAbs;
import ma.ensa.decorator.Empty;
import ma.ensa.decorator.Head;
import ma.ensa.decorator.Loaded;
import ma.ensa.decorator.Passenger;
import ma.ensa.decorator.Restaurant;
import ma.ensa.decorator.Train;

public class TrainTest {

	public static void main(String[] args) {
		TrainAbs trainAbs = new BaseTrain();

		System.out.println("##################### BASE TRAIN ##################");
		System.out.println(trainAbs.getDescription());

		System.out.println("##################### WITH PASSENGER ##################");
		trainAbs = new Passenger(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### WITH RESTAURANT ##################");
		trainAbs = new Restaurant(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### WITH PASSENGER ##################");
		trainAbs = new Passenger(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### WITH EMPTY WAGON ##################");
		trainAbs = new Empty(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### WITH LOADED WAGON ##################");
		trainAbs = new Loaded(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### WITH HEAD ##################");
		trainAbs = new Head(trainAbs);
		System.out.println(trainAbs.getDescription());
		System.out.println("##################### PREVIOUS TRAIN ##################");
		System.out.println(((Train) trainAbs).getTrainAbs().getDescription());
	}

}
